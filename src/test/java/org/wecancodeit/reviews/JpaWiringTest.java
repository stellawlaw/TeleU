package org.wecancodeit.reviews;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Properties;

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
        TvShowReviews testTvShowReviews1 = new TvShowReviews(testGenre,"fe", "fd", "fc","fg","ft",1,"fb");
        TvShowReviews testTvShowReviews2 = new TvShowReviews(testGenre,"ce", "cd", "cc","cg","ct",2,"cb");

        tvShowReviewsRepo.save(testTvShowReviews1);
        tvShowReviewsRepo.save(testTvShowReviews2);

        testEntityManager.flush();
        testEntityManager.clear();
        Genre retrievedGenre = genreRepo.findById(testGenre.getId()).get();
        assertThat(retrievedGenre.getReview()).contains( testTvShowReviews1,testTvShowReviews2);
        assertThat(retrievedGenre.getName()).isEqualTo(testGenre);
    }
    }

