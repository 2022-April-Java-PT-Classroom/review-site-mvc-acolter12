package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewsRepository {

    Map<Long, Reviews> reviewsList = new HashMap<>();

    public ReviewsRepository() {
        Reviews S = new Reviews(1L, "S", "../images/strawberries.jpg","B", "D");

        reviewsList.put(S.getId(), S);
    }
    public ReviewsRepository(Reviews ...reviewsToAdd) {
        for(Reviews review: reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Reviews findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Reviews> findAll() {
        return reviewsList.values();
    }
}