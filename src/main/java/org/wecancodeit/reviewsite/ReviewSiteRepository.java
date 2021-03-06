package org.wecancodeit.reviewsite;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewSiteRepository {

	private HashMap<Long, Review> reviewList = new HashMap<Long, Review>();

	public ReviewSiteRepository() {
		Review springMVC = new Review(1L, "Spring Boot & MVC",
				"This page reviews information on Spring Boot & MVC and its functionality. ", "java.png",
				"Creates stand-alone Spring applications.\r\n" + "\r\n"
						+ "Embeds Tomcat, Jetty or Undertow directly (no need to deploy WAR files)."
						+ "Provides opinionated 'starter' dependencies to simplify your build configuration."
						+ "Automatically configures Spring and 3rd party libraries whenever possible."
						+ "Provides production-ready features such as metrics, health checks and externalized configuration."
						+ "Absolutely no code generation and no requirement for XML configuration.");
		Review thymeleaf = new Review(2L, "Thymeleaf", "This page reviews information about Thymeleaf.", "thyme.jpg",
				"Thymeleaf is a Java XML/XHTML/HTML5 template engine that can work both in web (Servlet-based) and non-web environments. It is better suited for serving XHTML/HTML5 at the view layer of MVC-based web applications, but it can process any XML file even in offline environments. It provides full Spring Framework integration.");
		Review htmlcss = new Review(3L, "HTML & CSS", "This page reviews what HTML and CSS are.", "html.jpg",
				"HTML (the Hypertext Markup Language) and CSS (Cascading Style Sheets) are two of the core technologies for building Web pages. HTML provides the structure of the page, CSS the (visual and aural) layout, for a variety of devices.");

		Review forloops = new Review(4L, "For Loops in Java", "This page explains what a for loop is and how they are useful","forloop.png","For loops come in two different varieties in java. The standard for loop and the enhanced for loop. Both of which iterate through a set of data. The standard loop uses an initialized integer variable, a range and an increment to produce a loop. The enhanced for loop uses objects in a collection to iterate through the collection.");
			
		reviewList.put(springMVC.getId(), springMVC);
		reviewList.put(thymeleaf.getId(), thymeleaf);
		reviewList.put(htmlcss.getId(), htmlcss);
		reviewList.put(forloops.getId(), forloops);

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
