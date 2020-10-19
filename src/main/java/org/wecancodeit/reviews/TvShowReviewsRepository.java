package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.models.TvShowReviews;

public interface TvShowReviewsRepository extends CrudRepository<TvShowReviews, Long> {
}
