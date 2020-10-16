package org.wecancodeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class TvShowReviews {
@Id
@GeneratedValue

    private long id;
 @ManyToOne
    private Genre genre;
    private String title;
    private String showDate;
    private String numberOfSeasons;
    private String descriptionOfShow;
    private String review;
    private String imageReviewUrl;

    protected TvShowReviews(){}

    public TvShowReviews(Genre genre, String title, String showDate, String numberOfSeasons, String descriptionOfShow, String review, long id, String imageReviewUrl) {
        this.title = title;
        this.showDate = showDate;
        this.numberOfSeasons = numberOfSeasons;
        this.descriptionOfShow = descriptionOfShow;
        this.review = review;
        this.genre = genre;
        this.id = id;
        this.imageReviewUrl = imageReviewUrl;
    }
    public Genre getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String getShowDate() {
        return showDate;
    }

    public String getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public String getDescriptionOfShow() {
        return descriptionOfShow;
    }

    public String getReview() {
        return review;
    }

    public long getId() { return id; }

    public String getImageReviewUrl() {
        return imageReviewUrl;
    }

    @Override
    public String toString() {
        return "TvShowReviews{" +
                "id=" + id +
                ", genre=" + genre +
                ", title='" + title + '\'' +
                ", showDate='" + showDate + '\'' +
                ", numberOfSeasons='" + numberOfSeasons + '\'' +
                ", descriptionOfShow='" + descriptionOfShow + '\'' +
                ", review='" + review + '\'' +
                ", imageReviewUrl='" + imageReviewUrl + '\'' +
                '}';


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TvShowReviews that = (TvShowReviews) o;

        if (id != that.id) return false;
        if (genre != null ? !genre.equals(that.genre) : that.genre != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (showDate != null ? !showDate.equals(that.showDate) : that.showDate != null) return false;
        if (numberOfSeasons != null ? !numberOfSeasons.equals(that.numberOfSeasons) : that.numberOfSeasons != null)
            return false;
        if (descriptionOfShow != null ? !descriptionOfShow.equals(that.descriptionOfShow) : that.descriptionOfShow != null)
            return false;
        if (review != null ? !review.equals(that.review) : that.review != null) return false;
        return imageReviewUrl != null ? imageReviewUrl.equals(that.imageReviewUrl) : that.imageReviewUrl == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (showDate != null ? showDate.hashCode() : 0);
        result = 31 * result + (numberOfSeasons != null ? numberOfSeasons.hashCode() : 0);
        result = 31 * result + (descriptionOfShow != null ? descriptionOfShow.hashCode() : 0);
        result = 31 * result + (review != null ? review.hashCode() : 0);
        result = 31 * result + (imageReviewUrl != null ? imageReviewUrl.hashCode() : 0);
        return result;
    }
}
