package org.wecancodeit.reviews.Repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.models.Hashtags;

public interface HashtagsRepository extends CrudRepository<Hashtags, Long> {
}
