package org.wecancodeit.reviews;

import java.util.Collection;

public class Genre {

    private long id;
    private String name;
    private Collection<TvShowReviews> reviews;
    private String imageUrl;

    public Collection<TvShowReviews> getReviews() {
        return reviews;
    }

    public Genre(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
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

    public String getImageUrl() {
        return imageUrl;
    }
}
