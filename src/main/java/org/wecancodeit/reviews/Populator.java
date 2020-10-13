package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Component
public class Populator implements CommandLineRunner {

    private GenreStorage genreStorage;

    public Populator(GenreStorage genreStorage){
        this.genreStorage = genreStorage;
    }

@Override
public void run(String...args) throws Exception{

    Collection<TvShowReviews> tvGenreReviews = new ArrayList<>();

    Genre horror = new Genre("Horror", tvGenreReviews, 1L);
    Genre comedy = new Genre("Comedy", Collections.EMPTY_LIST, 2L);

    tvGenreReviews.add(new TvShowReviews(horror, "American Horror Story", "January", "nine", "It's bs", "Three Stars", 1));

    genreStorage.addGenre(horror);
    genreStorage.addGenre(comedy);

}
}