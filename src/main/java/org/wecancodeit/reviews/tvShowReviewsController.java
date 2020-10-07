package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Collections;

@Controller
public class tvShowReviewsController {
    @RequestMapping("sample-tvShows-Reviews")
    public String showOneReview(Model model){
        tvShowTitle sampleTvShowTitle = new tvShowTitle("the Office", Collections.EMPTY_LIST);
        tvShowReviews sampleTvShowReviews = new tvShowReviews(sampleTvShowTitle, "2005", "9", "office", "good");

        model.addAttribute("tvShowReviews", sampleTvShowReviews);

        return "tvShowsReviews-template";
    }
}
