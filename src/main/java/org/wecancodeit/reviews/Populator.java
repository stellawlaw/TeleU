package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Component
public class Populator implements CommandLineRunner {

    private GenreStorage genreStorage;
//    private TvShowReviewsStorage tvShowReviewsStorage;

    public Populator(GenreStorage genreStorage){
        this.genreStorage = genreStorage;
    }
//    public Populator(TvShowReviewsStorage tvShowReviewsStorage){
//        this.tvShowReviewsStorage = tvShowReviewsStorage;
//    }

@Override
public void run(String...args) throws Exception{

    Collection<TvShowReviews> comedyReviews = new ArrayList<>();
    Collection<TvShowReviews> horrorReviews = new ArrayList<>();

//    Collection<TvShowReviews> comedyShowReview = new ArrayList<>();
//    Collection<TvShowReviews> horrorShowReview = new ArrayList<>();

    Genre horror = new Genre("Horror", horrorReviews, 1L, "/Images/horror.jpg" );
    Genre comedy = new Genre("Comedy", comedyReviews, 2L,"/Images/comedy.jpg" );



    horrorReviews.add(new TvShowReviews(horror, "American Horror Story", "January", "nine", "It's bs", "Three Stars", 1,"/Images/American_Horror_Story.jpg" ));
    horrorReviews.add(new TvShowReviews(horror, "Stranger Things season 2", "November", "two", "It's bs", "Three Stars", 2,"/Images/Stranger_Things_season_2.jpg" ));
    comedyReviews.add(new TvShowReviews(comedy, "the office","march","five","it's alright","one star", 3, "/Images/The-Office.jpg"));
    comedyReviews.add(new TvShowReviews(comedy, "P&R","march","six","it's okay","two star", 4, "/Images/P&R.jpg"));



    genreStorage.addGenre(horror);
    genreStorage.addGenre(comedy);


}
}