package org.wecancodeit.reviews;

public class TvShowReviews {

    private long id;
    private Genre genre;
    private String title;
    private String showDate;
    private String numberOfSeasons;
    private String descriptionOfShow;
    private String review;
    private String imageReviewUrl;


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

    public long getId() { return id;
    }

    public String getImageReviewUrl() {
        return imageReviewUrl;
    }
}
