package org.wecancodeit.reviewsite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewSiteController {

	@Resource
	ReviewSiteRepository reviewsRepo;

	@RequestMapping("/show-all-reviews")
	public String findAllReviews(Model model) {
		model.addAttribute("reviews", reviewsRepo.findAll());
		return "reviews";
	}

	@RequestMapping("review")
	public String findOneReview(@RequestParam(value = "id") Long id, Model model) {
		model.addAttribute("reviews", reviewsRepo.getOneCourse(id));
		return "review";
	}

}
