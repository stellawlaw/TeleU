package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.models.Genre;
import org.wecancodeit.reviews.models.TvShowReviews;

@Component
public class Populator implements CommandLineRunner {

    private GenreStorage genreStorage;
    private TvShowReviewsStorage tvShowReviewsStorage;

    public Populator(GenreStorage genreStorage, TvShowReviewsStorage tvShowReviewsStorage) {
        this.genreStorage = genreStorage;
        this.tvShowReviewsStorage = tvShowReviewsStorage;
    }
    @Override
    public void run(String... args) throws Exception {

        Genre horror = new Genre("Horror", "/Images/horror.jpg");
        Genre comedy = new Genre("Comedy", "/Images/comedy.jpg");

        genreStorage.addGenre(horror);
        genreStorage.addGenre(comedy);

        TvShowReviews americanHorrorStory = new TvShowReviews(horror, "American Horror Story", "January", "nine", "It's bs", "Three Stars", "/Images/American_Horror_Story.jpg");

        TvShowReviews strangerThingsSeason2 = new TvShowReviews(horror, "Stranger Things", "November", "two", "It's bs", "Three Stars", "/Images/Stranger_Things_season_2.jpg");

        TvShowReviews theOffice = new TvShowReviews(comedy, "The Office", "march", "five", "it's alright", "one star", "/Images/The-Office.jpg");

        TvShowReviews pAndR = new TvShowReviews(comedy, "Parks and Recreation", "march", "six", "it's okay", "two star", "/Images/P&R.jpg");

        tvShowReviewsStorage.addTvShowReview(americanHorrorStory);
        tvShowReviewsStorage.addTvShowReview(strangerThingsSeason2);
        tvShowReviewsStorage.addTvShowReview(theOffice);
        tvShowReviewsStorage.addTvShowReview(pAndR);


    }
}