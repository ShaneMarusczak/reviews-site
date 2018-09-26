package org.wecancodeit.reviewsite;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewSiteRepositoryTest {

	ReviewSiteRepository testRepository;

	private long firstTestId = 1L;
	private Review testReview1 = new Review(firstTestId, null, null);

	private long secondTestId = 2L;
	private Review testReview2 = new Review(secondTestId, null, null);

	@Test
	public void shouldFindAReview() {
		testRepository = new ReviewSiteRepository(testReview1);
		Review result = testRepository.getOneReview(firstTestId);
		assertThat(result, is(testReview1));
	}

	@Test
	public void shouldFindASecondReview() {
		testRepository = new ReviewSiteRepository(testReview2);
		Review result = testRepository.getOneReview(secondTestId);
		assertThat(result, is(testReview2));
	}

	@Test
	public void shouldFindAllReviews() {
		testRepository = new ReviewSiteRepository(testReview1, testReview2);
		Collection<Review> result = testRepository.findAll();
		assertThat(result, containsInAnyOrder(testReview1, testReview2));
	}
}
