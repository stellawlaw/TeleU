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

    @GetMapping("genre/reviews/{id}")
    public String showOneReview(Model model, @PathVariable long id) {
        model.addAttribute("TvShowReviews", tvShowReviewsStorage.retrieveOneReviewById(id));
        return "TvShowsReviews-template";
    }
    @PostMapping ("genre/hashtags/{id}")
    public String addHashtag(@RequestParam String hashtagName, @PathVariable long id){
        Hashtags hashtagsToAdd = new Hashtags(hashtagName,"",tvShowReviewsStorage.retrieveOneReviewById(id));
        hashtagsStorage.addHashtag(hashtagsToAdd);
        return "redirect:/genre/reviews/" + id;
        /*
        1. A way to find hashtags by name.
        2. if hashtag exists use that hashtag.
          - if hashtag exists you need to add review to existing hashtag object.
          -  resave in hashtag storagae
         3. Explore changing Collections of HashTag/Reviews to Sets.

         */
    }

}
