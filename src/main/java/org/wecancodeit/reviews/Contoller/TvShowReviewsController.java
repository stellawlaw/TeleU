package org.wecancodeit.reviews.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancodeit.reviews.Storage.GenreStorage;
import org.wecancodeit.reviews.Storage.HashtagsStorage;
import org.wecancodeit.reviews.Storage.TvShowReviewsStorage;
import org.wecancodeit.reviews.models.Hashtags;

@Controller
public class TvShowReviewsController {

    private TvShowReviewsStorage tvShowReviewsStorage;
    private HashtagsStorage hashtagsStorage;
    private GenreStorage genreStorage;
    public TvShowReviewsController(TvShowReviewsStorage tvShowReviewsStorage, HashtagsStorage hashtagsStorage) {
        this.tvShowReviewsStorage = tvShowReviewsStorage;
        this.hashtagsStorage = hashtagsStorage;
    }

    @GetMapping("{genre}/reviews/{id}")
    public String showOneReview(Model model, @PathVariable long id, @PathVariable String genre) {
        model.addAttribute("TvShowReviews", tvShowReviewsStorage.retrieveOneReviewById(id));
        return "TvShowsReviews-template";
    }
    @PostMapping ("{genre}/hashtags/{id}")
    public String addHashtag(@RequestParam String hashtagName, @PathVariable String id,@PathVariable String genre){
        Hashtags hashtagsToAdd = new Hashtags(hashtagName);
        hashtagsStorage.addHashtag(hashtagsToAdd);
        return "redirect:/";
    }

}
