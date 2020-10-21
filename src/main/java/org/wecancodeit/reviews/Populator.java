package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.Repository.HashtagsRepository;
import org.wecancodeit.reviews.Storage.GenreStorage;
import org.wecancodeit.reviews.Storage.TvShowReviewsStorage;
import org.wecancodeit.reviews.models.Genre;
import org.wecancodeit.reviews.models.Hashtags;
import org.wecancodeit.reviews.models.TvShowReviews;

@Component
public class Populator implements CommandLineRunner {

    private GenreStorage genreStorage;
    private TvShowReviewsStorage tvShowReviewsStorage;
    private HashtagsRepository hashtagsRepo;

    public Populator(GenreStorage genreStorage, TvShowReviewsStorage tvShowReviewsStorage, HashtagsRepository hashtagsRepo) {
        this.genreStorage = genreStorage;
        this.tvShowReviewsStorage = tvShowReviewsStorage;
        this.hashtagsRepo = hashtagsRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Genre horror = new Genre("Horror", "/Images/horror.jpg");
        Genre comedy = new Genre("Comedy", "/Images/comedy.jpg");
        Genre drama = new Genre("Drama", "/Images/drama.jpg");
        Genre action = new Genre("Action & Adventure", "/Images/action.jpg");
        Genre animated = new Genre("Animation", "/Images/animation.png");
        Genre documentary = new Genre("Documentary", "/Images/documentary.jpg");

        genreStorage.addGenre(horror);
        genreStorage.addGenre(comedy);
        genreStorage.addGenre(drama);
        genreStorage.addGenre(action);
        genreStorage.addGenre(animated);
        genreStorage.addGenre(documentary);

        TvShowReviews tvShowReviews1 = new TvShowReviews(horror, "American Horror Story", "Oct 2011 - Present", "Nine", "An anthology series centering on different characters and locations, including a house with a murderous past, an insane asylum, a witch coven, a freak show circus, a haunted hotel, a possessed farmhouse, a cult, the apocalypse, and a slasher summer camp", "Three Stars", "/Images/American_Horror_Story.jpg");
        tvShowReviewsStorage.addTvShowReview(tvShowReviews1);

        TvShowReviews tvShowReviews2 = new TvShowReviews(horror, "Stranger Things", "July 2016 - Present", "Three", "In a small town where everyone knows everyone, a peculiar incident starts a chain of events that leads to the disappearance of a child, which begins to tear at the fabric of an otherwise peaceful community", "Three Stars", "/Images/Stranger_Things_season_2.jpg");
        tvShowReviewsStorage.addTvShowReview(tvShowReviews2);

        TvShowReviews tvShowReviews3 = new TvShowReviews(comedy, "The Office", "Mar 2005 - May 2013", "Nine", "A mockumentary on a group of typical office workers, where the workday consists of ego clashes, inappropriate behavior, and tedium", "Three Stars", "/Images/The-Office.jpg");
        tvShowReviewsStorage.addTvShowReview(tvShowReviews3);

        TvShowReviews tvShowReviews4 = new TvShowReviews(comedy, "Parks and Recreation", "Apr 2009 - Feb 2015", "Seven", "The absurd antics of an Indiana town's public officials as they pursue sundry projects to make their city a better place", "Four Stars", "/Images/P&R.jpg");
        tvShowReviewsStorage.addTvShowReview(tvShowReviews4);

        TvShowReviews tvShowReviews5 = new TvShowReviews(horror, "The Walking Dead", "Oct 2010 - Present", "Ten", "Based on the comic book series written by Robert Kirkman, this gritty drama portrays life in the months and years that follow a zombie apocalypse", "Three Stars", "/Images/walkingdead.jpg");
        tvShowReviewsStorage.addTvShowReview(tvShowReviews5);

        TvShowReviews tvShowReviews6 = new TvShowReviews(horror, "Lovecraft Country", "Aug 2020 - Present", "One", "Atticus Black joins his friend Letitia and his Uncle George to embark on a road trip across 1950s Jim Crow America in search of his missing father", "Three Stars", "/Images/lovecraftcountry.jpg");
        tvShowReviewsStorage.addTvShowReview(tvShowReviews6);

        TvShowReviews tvShowReviews7 = new TvShowReviews(comedy, "Arrested Development", "Nov 2003 - Mar 2019", "Five", "Level-headed son Michael Bluth takes over family affairs after his father is imprisoned. But the rest of his spoiled, dysfunctional family are making his job unbearable", "Three Stars", "/Images/arresteddevelopment.jpg");
        tvShowReviewsStorage.addTvShowReview(tvShowReviews7);

        TvShowReviews tvShowReviews8 = new TvShowReviews(comedy, "Brooklyn Nine-Nine", "Sept 2013 - Present", "Seven", "Brooklyn Nine-Nine follows the exploits of hilarious Det. Jake Peralta and his diverse, lovable colleagues as they police the NYPD's 99th Precinct", "Four Stars", "/Images/brooklyn.jpg");
        tvShowReviewsStorage.addTvShowReview(tvShowReviews8);

        TvShowReviews tvShowReviews9 = new TvShowReviews(comedy, "Schitt's Creek", "Jan 2015 - Apr 2020", "Six", "When rich video-store magnate Johnny Rose and his family suddenly find themselves broke, they are forced to leave their pampered lives to regroup in Schitt's Creek", "Four Stars", "/Images/schittcreek.jpg");
        tvShowReviewsStorage.addTvShowReview(tvShowReviews9);

        TvShowReviews tvShowReviews10 = new TvShowReviews(comedy, "Seinfeld", "Jul 1989 - May 1998", "Nine", "The continuing misadventures of neurotic New York City stand-up comedian Jerry Seinfeld and his equally neurotic New York City friends", "Four Stars", "/Images/seinfeld.jpg");
        tvShowReviewsStorage.addTvShowReview(tvShowReviews10);

        TvShowReviews tvShowReviews11 = new TvShowReviews(horror, "The Haunting of Hill House", "Oct 2018", "One", "Flashing between past and present, a fractured family confronts haunting memories of their old home and the terrifying events that drove them from it", "two stars", "/Images/hauntinghh.jpg");
        tvShowReviewsStorage.addTvShowReview(tvShowReviews11);

        TvShowReviews tvShowReviews12 = new TvShowReviews(horror, "Castle Rock", "Jul 2018 - Present", "Two", "Based on the stories of Stephen King, the series intertwines characters and themes from the fictional town of Castle Rock", "two stars", "/Images/castlerock.jpg");
        tvShowReviewsStorage.addTvShowReview(tvShowReviews12);


        hashtagsRepo.save(new Hashtags("#nbc", "hashtag1", tvShowReviews3,tvShowReviews4));
        hashtagsRepo.save(new Hashtags("#binge", "hashtag2", tvShowReviews1,tvShowReviews2, tvShowReviews3, tvShowReviews4));
        hashtagsRepo.save(new Hashtags("#epic", "hashtag3", tvShowReviews4));
        hashtagsRepo.save(new Hashtags("#laughs", "hashtag4", tvShowReviews3));
        hashtagsRepo.save(new Hashtags("#slasher", "hashtag5", tvShowReviews1));
        hashtagsRepo.save(new Hashtags("#scream", "hashtag6", tvShowReviews1));
        hashtagsRepo.save(new Hashtags("#scifihorror", "hashtag7", tvShowReviews2));
        hashtagsRepo.save(new Hashtags("#80skids", "hashtag8", tvShowReviews2));

    }
}