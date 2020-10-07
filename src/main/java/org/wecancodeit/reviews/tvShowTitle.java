package org.wecancodeit.reviews;

import java.util.Collection;

public class tvShowTitle {

    private String title;
    private Collection<tvShowReviews> reviews;

    public tvShowTitle(String title, Collection<tvShowReviews>reviews) {
        this.title = title;
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public Collection<tvShowReviews> getReviews() {
        return reviews;
    }
}
