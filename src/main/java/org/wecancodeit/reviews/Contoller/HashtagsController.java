package org.wecancodeit.reviews.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.Storage.HashtagsStorage;
import org.wecancodeit.reviews.Storage.TvShowReviewsStorage;

@Controller
public class HashtagsController {
    private HashtagsStorage hashtagsStorage;

    public HashtagsController(HashtagsStorage hashtagsStorage) {
        this.hashtagsStorage = hashtagsStorage;
    }

    @RequestMapping("hashtags/")
    public String showAllReviews(Model model) {
        model.addAttribute("allHashtags", hashtagsStorage.retrieveAllHashtags());
        return "AllHashtagsTemplate";
    }

    @RequestMapping("hashtags/{id}")
    public String showOneHashtag(Model model, @PathVariable long id) {
        model.addAttribute("hashtags", hashtagsStorage.retrieveOneHashtagById(id));
        return "HashtagTemplate";
    }


}
