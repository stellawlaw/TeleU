package org.wecancodeit.reviews.Storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.Repository.TvShowReviewsRepository;
import org.wecancodeit.reviews.models.TvShowReviews;

@Service
public class TvShowReviewsStorage {
    private TvShowReviewsRepository tvShowReviewsRepo;

    public TvShowReviewsStorage(TvShowReviewsRepository tvShowReviewsRepo) {
        this.tvShowReviewsRepo = tvShowReviewsRepo;
    }

    public void addTvShowReview(TvShowReviews oneReviewToAdd) {
        tvShowReviewsRepo.save(oneReviewToAdd);
    }

    public Iterable<TvShowReviews> retrieveAllReviews() {
        return tvShowReviewsRepo.findAll();
    }

    public TvShowReviews retrieveOneReviewById(Long id) {
        return tvShowReviewsRepo.findById(id).get();
    }


}
