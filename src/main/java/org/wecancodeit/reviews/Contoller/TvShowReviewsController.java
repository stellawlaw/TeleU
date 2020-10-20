package org.wecancodeit.reviews.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.Storage.TvShowReviewsStorage;

@Controller
public class TvShowReviewsController {

    private TvShowReviewsStorage tvShowReviewsStorage;

    public TvShowReviewsController(TvShowReviewsStorage tvShowReviewsStorage) {
        this.tvShowReviewsStorage = tvShowReviewsStorage;
    }

    @RequestMapping("{genre}/reviews/{id}")
    public String showOneReview(Model model, @PathVariable long id, @PathVariable String genre) {
        model.addAttribute("TvShowReviews", tvShowReviewsStorage.retrieveOneReviewById(id));
        return "TvShowsReviews-template";
    }
}
