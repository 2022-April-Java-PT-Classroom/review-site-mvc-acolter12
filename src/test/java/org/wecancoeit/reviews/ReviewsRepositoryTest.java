package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewsRepositoryTest {

    private ReviewsRepository underTest;

    private Reviews reviewOne = new Reviews(1L, "Test 1", "Test", "Review test one.");

    @Test
    public void shouldBeAbleToFindASingleReview() {
        underTest = new ReviewsRepository(reviewOne);
        Reviews foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

}
