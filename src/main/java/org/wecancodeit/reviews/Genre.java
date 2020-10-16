package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Genre {
@Id
@GeneratedValue

    private long id;
    private String name;
    @OneToMany(mappedBy = "genre")
    private Collection<TvShowReviews> reviews;
    private String imageUrl;


//, Collection<TvShowReviews> reviews
    protected Genre(){}

    public Genre(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
//        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public Collection<TvShowReviews> getReview() {
        return reviews;
    }
//    public Collection<TvShowReviews> getReviews() {
//        return reviews;
//    }
    public long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Genre genre = (Genre) o;

        if (id != genre.id) return false;
        if (name != null ? !name.equals(genre.name) : genre.name != null) return false;
        return imageUrl != null ? imageUrl.equals(genre.imageUrl) : genre.imageUrl == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        return result;
    }
}
