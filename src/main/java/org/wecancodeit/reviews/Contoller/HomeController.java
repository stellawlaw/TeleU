package org.wecancodeit.reviews.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.Storage.GenreStorage;

@Controller

public class HomeController {

    private GenreStorage genreStorage;

    public HomeController(GenreStorage genreStorage) {
        this.genreStorage = genreStorage;
    }

    @RequestMapping({"home", "/"})
    public String home(Model model) {
        model.addAttribute("genres", genreStorage.retrieveAllGenres());
        return "HomeTemplate";
    }

    @RequestMapping("genre/{id}")
    public String displayASingleGenre(Model model, @PathVariable Long id) {
        model.addAttribute("genre", genreStorage.retrieveGenreById(id));
        return "GenreTemplate";
    }
}
