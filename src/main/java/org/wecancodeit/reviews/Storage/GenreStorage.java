package org.wecancodeit.reviews.Storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.Repository.GenreRepository;
import org.wecancodeit.reviews.models.Genre;

@Service
public class GenreStorage {

    private GenreRepository genreRepo;

    public GenreStorage(GenreRepository genreRepo) {

        this.genreRepo = genreRepo;
    }

    public void addGenre(Genre genreToAdd) {
        genreRepo.save(genreToAdd);
    }

    public Iterable<Genre> retrieveAllGenres() {
        return genreRepo.findAll();
    }

    public Genre retrieveGenreById(Long id) {
        return genreRepo.findById(id).get();
    }
}

