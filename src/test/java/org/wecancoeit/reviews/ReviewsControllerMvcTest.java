package org.wecancoeit.reviews;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.Collection;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ReviewsController.class)
public class ReviewsControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ReviewsRepository reviewsRepo;

    @Mock
    private Reviews reviewOne;

    @Mock
    private Reviews reviewTwo;

    @Test
    public void shouldBeOkForAllCoursesInTheTemplate() throws Exception{
        mockMvc.perform(get("/reviews")).andExpect(status().isOk()).andExpect(view().name("reviewsTemplate"));
    }

    @Test
    public void shouldBeAbleToFindAllReviewsInModel() throws Exception{
        Collection<Reviews> allReviewsInModel = Arrays.asList(reviewOne, reviewTwo);
        when(reviewsRepo.findAll()).thenReturn(allReviewsInModel);
        mockMvc.perform(get("/reviews")).andExpect(model().attribute("reviewsModel", allReviewsInModel));
    }

    @Test
    public void shouldBeOkForOneReviewInReviewsTemplate() throws Exception{
        Long reviewOneId = 1L;
        when(reviewsRepo.findOne(reviewOneId)).thenReturn(reviewOne);
        mockMvc.perform(get("/course?id=1")).andExpect(status().isOk()).andExpect(view().name("reviewTemplate"));
    }
}
