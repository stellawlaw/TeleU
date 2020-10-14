package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class TvShowReviewsStorage {
    public TvShowReviews retrieveTvShowReviewsById(Long id){
        return new TvShowReviews(new Genre("Comedy", Collections.emptyList(), 2L, "/Images/comedy.jpg"),"", "", "tester", "", "", 2L, "");
    }
}
