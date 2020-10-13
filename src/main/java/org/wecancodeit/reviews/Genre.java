package org.wecancodeit.reviews;

import java.util.Collection;

public class Genre {

    private long id;
    private String name;
    private Collection<TvShowReviews> reviews;

    public Collection<TvShowReviews> getReviews() {
        return reviews;
    }

    public Genre(String name, Collection<TvShowReviews> reviews, long id) {
        this.name = name;
        this.reviews = reviews;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Collection<TvShowReviews> getReview() {
        return reviews;
    }

    public long getId() {
        return id;
    }
}
