package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Collections;

@Controller
public class tvShowReviewsController {
    @RequestMapping("sample-tvShowsReviews")
    public String showOneReview(Model model){
        tvShowTitle sampletvShowTitle=new tvShowTitle("the Office", Collections.EMPTY_LIST);
        tvShowReviews sampletvShowReviews=new tvShowReviews(sampletvShowTitle, "2005", "9", "office", "good");
        model.addAttribute("tvShowsReviews", sampletvShowReviews);
        return "tvShowsReviews-template";
    }
}
