package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewsRepository {

    Map<Long, Reviews> reviewsList = new HashMap<>();

    public ReviewsRepository(Reviews ...reviewsToAdd) {
        for(Reviews review: reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Reviews findOne(long id) {
        return reviewsList.get(id);
    }

}