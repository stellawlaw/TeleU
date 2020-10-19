package org.wecancodeit.reviews;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.wecancodeit.reviews.models.Genre;
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

    @Test
    public void genreHasManyTvShowReviewsAndTvShowReviewsHasOneGenre(){
        Genre testGenre = new Genre("name", "images");
        genreRepo.save(testGenre);
        TvShowReviews testTvShowReviews1 = new TvShowReviews(testGenre,"Review 1", "fd", "fc","fg","ft", "fb");
        tvShowReviewsRepo.save(testTvShowReviews1);
        TvShowReviews testTvShowReviews2 = new TvShowReviews(testGenre,"Review 2", "cd", "cc","cg","ct", "cb");

        tvShowReviewsRepo.save(testTvShowReviews2);

        testEntityManager.flush();
        testEntityManager.clear();
        Genre retrievedGenre = genreRepo.findById(testGenre.getId()).get();

        assertThat(retrievedGenre.getReviews()).hasSize(2);
        assertThat(retrievedGenre.getReviews()).contains( testTvShowReviews1,testTvShowReviews2);
        assertThat(retrievedGenre.getName()).isEqualTo(testGenre.getName());
    }
    }

