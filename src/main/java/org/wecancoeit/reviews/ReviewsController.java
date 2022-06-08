package org.wecancoeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ReviewsController {

    @Resource
    private ReviewsRepository reviewsRepo;

    @RequestMapping("/reviews")
    public String findAllReviews(Model model) {
        model.addAttribute("reviewsModel", reviewsRepo.findAll());
        return "reviewsTemplate";
    }

    @RequestMapping("/review")
    public String findOneReview(@RequestParam(value="id") Long id, Model model) {
        model.addAttribute("reviewModel", reviewsRepo.findOne(id));
        return "reviewTemplate";
    }
}
