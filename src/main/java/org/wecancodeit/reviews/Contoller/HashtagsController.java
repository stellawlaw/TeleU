package org.wecancodeit.reviews.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.Storage.HashtagsStorage;
import org.wecancodeit.reviews.Storage.TvShowReviewsStorage;

@Controller
public class HashtagsController {
    private TvShowReviewsStorage tvShowReviewsStorage;
    private HashtagsStorage hashtagsStorage;
//    private HashtagHomeController hashtagHomeController;

    public HashtagsController(HashtagsStorage hashtagsStorage){
        this.hashtagsStorage = hashtagsStorage;
    }
    @RequestMapping("hashtags/{id}")
    public String showOneHashtag(Model model, @PathVariable long id) {
        model.addAttribute("hashtags",hashtagsStorage.retrieveOneHashtagById(id));
        return "HashtagTemplate";
    }


    @RequestMapping("{reviews}hashtags/{id}")
    public String showAllReviews(Model model, @PathVariable long id, @PathVariable String reviews){
        model.addAttribute("allReviews", tvShowReviewsStorage.retrieveOneReviewById(id));
        return "HashtagTemplate";
    }
}
