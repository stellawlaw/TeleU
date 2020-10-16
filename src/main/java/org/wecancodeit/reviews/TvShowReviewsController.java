package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;

@Controller
public class TvShowReviewsController {

    private TvShowReviewsStorage tvShowReviewsStorage;

    public TvShowReviewsController(TvShowReviewsStorage tvShowReviewsStorage){
        this.tvShowReviewsStorage = tvShowReviewsStorage;
    }

    @RequestMapping("reviews/{id}")
    public String showOneReview(Model model, @PathVariable long id){
        model.addAttribute("TvShowReviews", tvShowReviewsStorage.retrieveOneReviewById(id));
        return "TvShowsReviews-template";
    }
}
