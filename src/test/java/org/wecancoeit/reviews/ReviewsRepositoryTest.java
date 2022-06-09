package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewsRepositoryTest {

    private ReviewsRepository underTest;

    private Reviews reviewOne = new Reviews(1L, "Test 1", "Test","Test", "Review test one.");
    private Reviews reviewTwo = new Reviews(2L, "Test 2", "Test", "Test","Review test two.");

    @Test
    public void shouldBeAbleToFindASingleReview() {
        underTest = new ReviewsRepository(reviewOne);
        Reviews foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldBeAbleToFindAllReviewsListed(){
        underTest = new ReviewsRepository(reviewOne, reviewTwo);
        Collection<Reviews> foundReviews = underTest.findAll();
        assertThat(foundReviews, containsInAnyOrder(reviewOne, reviewTwo));

    }

}
