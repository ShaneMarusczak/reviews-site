package org.wecancodeit.reviewsite;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewSiteRepository {

	private HashMap<Long, Review> reviewList = new HashMap<Long, Review>();

	public ReviewSiteRepository() {
		Review tech = new Review(1L, "tech", "tech");
		Review toys = new Review(2L, "toys", "toys");
		Review books = new Review(3L, "books", "books");

		reviewList.put(tech.getId(), tech);
		reviewList.put(toys.getId(), toys);
		reviewList.put(books.getId(), books);

	}

	public ReviewSiteRepository(Review... reviews) {
		for (Review review : reviews) {
			reviewList.put(review.getId(), review);
		}

	}

	public Review getOneReview(long firstTestId) {
		return reviewList.get(firstTestId);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

	public Review getOneCourse(Long id) {
		return reviewList.get(id);
	}

}
