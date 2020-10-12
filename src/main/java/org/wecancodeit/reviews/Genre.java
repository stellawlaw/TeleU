package org.wecancodeit.reviews;

import java.util.Collection;

public class Genre {

    private String name;
    private Collection<TvShowReviews> reviews;

    public Genre(String name, Collection<TvShowReviews> reviews) {
        this.name = name;
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public Collection<TvShowReviews> getReview() {
        return reviews;
    }
}
