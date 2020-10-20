package org.wecancodeit.reviews.Repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.models.TvShowReviews;

public interface TvShowReviewsRepository extends CrudRepository<TvShowReviews, Long> {
}
