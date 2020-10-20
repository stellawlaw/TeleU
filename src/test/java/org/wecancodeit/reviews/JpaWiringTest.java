package org.wecancodeit.reviews;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.wecancodeit.reviews.Repository.GenreRepository;
import org.wecancodeit.reviews.Repository.HashtagsRepository;
import org.wecancodeit.reviews.Repository.TvShowReviewsRepository;
import org.wecancodeit.reviews.models.Genre;
import org.wecancodeit.reviews.models.Hashtags;
import org.wecancodeit.reviews.models.TvShowReviews;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class JpaWiringTest {
    @Autowired
    private GenreRepository genreRepo;
    @Autowired
    private TvShowReviewsRepository tvShowReviewsRepo;
    @Autowired
    private TestEntityManager testEntityManager;
    @Autowired
    private HashtagsRepository hashtagsRepo;

    @Test
    public void genreHasManyTvShowReviewsAndTvShowReviewsHasOneGenre() {
        Genre testGenre = new Genre("name", "images");
        genreRepo.save(testGenre);
        TvShowReviews testTvShowReviews1 = new TvShowReviews(testGenre, "Review 1", "fd", "fc", "fg", "ft", "fb");
        tvShowReviewsRepo.save(testTvShowReviews1);
        TvShowReviews testTvShowReviews2 = new TvShowReviews(testGenre, "Review 2", "cd", "cc", "cg", "ct", "cb");

        tvShowReviewsRepo.save(testTvShowReviews2);

        testEntityManager.flush();
        testEntityManager.clear();
        Genre retrievedGenre = genreRepo.findById(testGenre.getId()).get();

        assertThat(retrievedGenre.getReviews()).hasSize(2);
        assertThat(retrievedGenre.getReviews()).contains(testTvShowReviews1, testTvShowReviews2);
        assertThat(retrievedGenre.getName()).isEqualTo(testGenre.getName());
    }

    @Test
    public void TvShowReviewsHasManyHashtagsAndHashtagsHaveManyTvShowReviews() {
        Genre testGenre = new Genre("Tesety", "TestImg");

        genreRepo.save(testGenre);

        TvShowReviews testTvShowReviews1 = new TvShowReviews(testGenre, "Review 1", "fd", "fc", "fg", "ft", "fb");
        tvShowReviewsRepo.save(testTvShowReviews1);
        TvShowReviews testTvShowReviews2 = new TvShowReviews(testGenre, "Review 2", "cd", "cc", "cg", "ct", "cb");
        tvShowReviewsRepo.save(testTvShowReviews2);

        Hashtags testHashtag1 = new Hashtags("boring", testTvShowReviews1, testTvShowReviews2);
        Hashtags testHashtag2 = new Hashtags("awesome", testTvShowReviews1, testTvShowReviews2);
        Hashtags testHashtag3 = new Hashtags("cool");
        Hashtags testHashtag4 = new Hashtags("not cool", testTvShowReviews1);
        Hashtags testHashtag5 = new Hashtags("eh...", testTvShowReviews2);

        hashtagsRepo.save(testHashtag1);
        hashtagsRepo.save(testHashtag2);
        hashtagsRepo.save(testHashtag3);
        hashtagsRepo.save(testHashtag4);
        hashtagsRepo.save(testHashtag5);

        testEntityManager.flush();
        testEntityManager.clear();

        TvShowReviews retrievedTvShowReview1 = tvShowReviewsRepo.findById(testTvShowReviews1.getId()).get();
        TvShowReviews retrievedTvShowReview2 = tvShowReviewsRepo.findById(testTvShowReviews2.getId()).get();

        assertThat(retrievedTvShowReview1.getHashtags()).contains(testHashtag1,testHashtag2);
        assertThat(retrievedTvShowReview2.getHashtags()).contains(testHashtag1,testHashtag5);
    }
}

