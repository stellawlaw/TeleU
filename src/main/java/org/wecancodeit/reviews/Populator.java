package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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

        TvShowReviews americanHorrorStory = new TvShowReviews(horror, "American Horror Story", "January", "nine", "It's bs", "Three Stars", 1, "/Images/American_Horror_Story.jpg");
        TvShowReviews strangerThingsSeason2 = new TvShowReviews(horror, "Stranger Things season 2", "November", "two", "It's bs", "Three Stars", 2, "/Images/Stranger_Things_season_2.jpg");
        TvShowReviews theOffice = new TvShowReviews(comedy, "the office", "march", "five", "it's alright", "one star", 3, "/Images/The-Office.jpg");
        TvShowReviews pAndR = new TvShowReviews(comedy, "P&R", "march", "six", "it's okay", "two star", 4, "/Images/P&R.jpg");

        tvShowReviewsStorage.addTvShowReview(americanHorrorStory);
        tvShowReviewsStorage.addTvShowReview(strangerThingsSeason2);
        tvShowReviewsStorage.addTvShowReview(theOffice);
        tvShowReviewsStorage.addTvShowReview(pAndR);

        genreStorage.addGenre(horror);
        genreStorage.addGenre(comedy);


    }
}