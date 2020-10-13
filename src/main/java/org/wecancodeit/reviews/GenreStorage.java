package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class GenreStorage {

    Map<Long, Genre> genrelist = new HashMap<>();

    public GenreStorage() {

    }

    public void addGenre (Genre genreToAdd) {
        genrelist.put(genreToAdd.getId(), genreToAdd);
    }
    public Collection<Genre> retrieveAllGenres() {
            return genrelist.values();
        }

        public Genre retrieveGenreById(Long id){
        return genrelist.get(id);
        }
    }

