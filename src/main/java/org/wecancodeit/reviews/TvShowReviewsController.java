package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;

@Controller
public class TvShowReviewsController {
    @RequestMapping("reviews")
    public String showOneReview(Model model){
        Genre genre = new Genre("comedy", Collections.emptyList(), 1, "/Images/comedy.jpg" );
        TvShowReviews sampleTvShowReviews = new TvShowReviews(genre, "the office", "2005", "9", "office", "good", 1, "/Images/The-Office.jpg" );

        model.addAttribute("TvShowReviews", sampleTvShowReviews);

        return "TvShowsReviews-template";
    }
}
