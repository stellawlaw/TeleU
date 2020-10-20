package org.wecancodeit.reviews.Repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.models.Genre;

public interface GenreRepository extends CrudRepository<Genre, Long> {
}
