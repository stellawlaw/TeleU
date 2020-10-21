package org.wecancodeit.reviews.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.reviews.Storage.HashtagsStorage;
import org.wecancodeit.reviews.Storage.TvShowReviewsStorage;
import org.wecancodeit.reviews.models.Hashtags;

@Controller
public class TvShowReviewsController {

    private TvShowReviewsStorage tvShowReviewsStorage;
//    private HashtagsStorage hashtagsStorage;

    public TvShowReviewsController(TvShowReviewsStorage tvShowReviewsStorage) {
        this.tvShowReviewsStorage = tvShowReviewsStorage;

    }

    @GetMapping ("{genre}/reviews/{id}")
    public String showOneReview(Model model, @PathVariable long id, @PathVariable String genre) {
        model.addAttribute("TvShowReviews", tvShowReviewsStorage.retrieveOneReviewById(id));
        return "TvShowsReviews-template";
    }
//    @PostMapping ("/hashtags/")
//    public String addHashtag(String hashtagName){
//        Hashtags hashtagsToAdd = new Hashtags(hashtagName);
//        HashtagsStorage.add
//    }

}
