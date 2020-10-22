package org.wecancodeit.reviews.Storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.Repository.HashtagsRepository;
import org.wecancodeit.reviews.models.Hashtags;
import org.wecancodeit.reviews.models.TvShowReviews;

@Service
public class HashtagsStorage {
    private HashtagsRepository hashtagsRepo;

    public HashtagsStorage(HashtagsRepository hashtagsRepo) {
        this.hashtagsRepo = hashtagsRepo;
    }

    public void addHashtag(Hashtags oneHashtagToAdd) {
        hashtagsRepo.save(oneHashtagToAdd);
    }

    public Iterable<Hashtags> retrieveAllHashtags() {
        return hashtagsRepo.findAll();
    }

    public Hashtags retrieveOneHashtagById(Long id) {
        return hashtagsRepo.findById(id).get();
    }

    public Hashtags retrieveOneHashtagByName(String name) {
        return hashtagsRepo.findByName(name);
    }
}
