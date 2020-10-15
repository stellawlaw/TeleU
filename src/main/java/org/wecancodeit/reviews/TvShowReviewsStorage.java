package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class TvShowReviewsStorage {
//    Map<Long,TvShowReviews>tvShowReviewsList = new HashMap<>();
//    public TvShowReviewsStorage(){
//
//    }
//    public void addTvShowReview(TvShowReviews oneReviewToAdd){
//        tvShowReviewsList.put(oneReviewToAdd.getId(),oneReviewToAdd);
//    }
//    public Collection<TvShowReviews>retrieveAllReviews(){
//        return tvShowReviewsList.values();
//    }
//    public TvShowReviews retrieveOneReviewById(Long id){
//        return tvShowReviewsList.get(id);
//    }
    public TvShowReviews retrieveTvShowReviewsById(long id){
        return new TvShowReviews(new Genre("Comedy", Collections.emptyList(), 2L, "/Images/comedy.jpg"),"", "", "tester", "", "", 2L, "");
    }
}
