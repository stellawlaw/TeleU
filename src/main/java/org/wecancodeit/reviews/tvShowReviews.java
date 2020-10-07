package org.wecancodeit.reviews;

public class tvShowReviews {
    private tvShowTitle title;
    private String showDate;
    private String numberOfSeasons;
    private String descriptionOfShow;
    private String review;

    public tvShowReviews(tvShowTitle title, String showDate, String numberOfSeasons, String descriptionOfShow, String review) {
        this.title = title;
        this.showDate = showDate;
        this.numberOfSeasons = numberOfSeasons;
        this.descriptionOfShow = descriptionOfShow;
        this.review = review;
    }

    public tvShowTitle getTitle() {
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
}
