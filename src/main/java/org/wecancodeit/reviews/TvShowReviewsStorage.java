package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.models.TvShowReviews;

@Service
public class TvShowReviewsStorage {
    private TvShowReviewsRepository tvShowReviewsRepo;

    public TvShowReviewsStorage(TvShowReviewsRepository tvShowReviewsRepo){
        this.tvShowReviewsRepo = tvShowReviewsRepo;
    }
    public void addTvShowReview(TvShowReviews oneReviewToAdd){
        tvShowReviewsRepo.save(oneReviewToAdd);
    }
    public Iterable<TvShowReviews>retrieveAllReviews(){
        return tvShowReviewsRepo.findAll();
    }
    public TvShowReviews retrieveOneReviewById(Long id){
        return tvShowReviewsRepo.findById(id).get();
    }


//    public TvShowReviews retrieveTvShowReviewsById(long id){
//        return new TvShowReviews(new Genre("Comedy", "/Images/comedy.jpg"),"", "", "tester", "", "", 2L, "");
//    }
}
