package org.wecancodeit.reviewsite;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewSiteRepository {

	private HashMap<Long, Review> reviewList = new HashMap<Long, Review>();

	public ReviewSiteRepository() {
		Review springMVC = new Review(1L, "Spring Boot & MVC",
				"This page reviews information on how to use Spring Boot & MVC and its functionality. ", "java.png");
		Review thymeleaf = new Review(2L, "Thymeleaf",
				"This page reviews information on what Thymeleaf is, and how to use it.", "thyme.jpg");
		Review htmlcss = new Review(3L, "HTML & CSS", "This page reviews what HTML and CSS are, and how to use them. ",
				"html.png");

		reviewList.put(springMVC.getId(), springMVC);
		reviewList.put(thymeleaf.getId(), thymeleaf);
		reviewList.put(htmlcss.getId(), htmlcss);

	}

	public ReviewSiteRepository(Review... reviews) {
		for (Review review : reviews) {
			reviewList.put(review.getId(), review);
		}

	}

	public Review getOneReview(long Id) {
		return reviewList.get(Id);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}


}
