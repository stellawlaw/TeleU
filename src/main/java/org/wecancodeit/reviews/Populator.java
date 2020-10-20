package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.Repository.HashtagsRepository;
import org.wecancodeit.reviews.Storage.GenreStorage;
import org.wecancodeit.reviews.Storage.TvShowReviewsStorage;
import org.wecancodeit.reviews.models.Genre;
import org.wecancodeit.reviews.models.Hashtags;
import org.wecancodeit.reviews.models.TvShowReviews;

@Component
public class Populator implements CommandLineRunner {

    private GenreStorage genreStorage;
    private TvShowReviewsStorage tvShowReviewsStorage;
    private HashtagsRepository hashtagsRepo;

    public Populator(GenreStorage genreStorage, TvShowReviewsStorage tvShowReviewsStorage, HashtagsRepository hashtagsRepo) {
        this.genreStorage = genreStorage;
        this.tvShowReviewsStorage = tvShowReviewsStorage;
        this.hashtagsRepo = hashtagsRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Genre horror = new Genre("Horror", "/Images/horror.jpg");
        Genre comedy = new Genre("Comedy", "/Images/comedy.jpg");

        genreStorage.addGenre(horror);
        genreStorage.addGenre(comedy);

        TvShowReviews tvShowReviews1 = new TvShowReviews(horror, "American Horror Story", "January", "nine", "It's bs", "Three Stars", "/Images/American_Horror_Story.jpg");
        tvShowReviewsStorage.addTvShowReview(tvShowReviews1);

        TvShowReviews tvShowReviews2 = new TvShowReviews(horror, "Stranger Things", "November", "two", "It's bs", "Three Stars", "/Images/Stranger_Things_season_2.jpg");
        tvShowReviewsStorage.addTvShowReview(tvShowReviews2);

        TvShowReviews tvShowReviews3 = new TvShowReviews(comedy, "The Office", "march", "five", "it's alright", "one star", "/Images/The-Office.jpg");
        tvShowReviewsStorage.addTvShowReview(tvShowReviews3);

        TvShowReviews tvShowReviews4 = new TvShowReviews(comedy, "Parks and Recreation", "march", "six", "it's okay", "two star", "/Images/P&R.jpg");
        tvShowReviewsStorage.addTvShowReview(tvShowReviews4);

        hashtagsRepo.save(new Hashtags("#Awesome", "ah", tvShowReviews1,tvShowReviews2));
        hashtagsRepo.save(new Hashtags("#ehhhhhhh", "ah", tvShowReviews4,tvShowReviews3));

    }
}