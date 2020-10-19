package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.models.Genre;

public interface GenreRepository extends CrudRepository<Genre, Long> {
}
