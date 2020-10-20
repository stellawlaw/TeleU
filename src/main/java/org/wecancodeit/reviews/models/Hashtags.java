package org.wecancodeit.reviews.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Entity
public class Hashtags {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String imageUrl;
    @ManyToMany
    private Collection<TvShowReviews> tvShowReviews;
    protected Hashtags(){}

    public Hashtags(String name, String imageUrl, TvShowReviews... tvShowReviews){

        this.name = name;
        this.imageUrl = imageUrl;
        this.tvShowReviews = new ArrayList<>(List.of(tvShowReviews));
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public Collection<TvShowReviews> getTvShowReviews() {
        return tvShowReviews;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "Hashtags{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hashtags hashtags = (Hashtags) o;

        if (id != hashtags.id) return false;
        return name != null ? name.equals(hashtags.name) : hashtags.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
