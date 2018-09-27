package org.wecancodeit.reviewsite;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewSiteRepository {

	private HashMap<Long, Review> reviewList = new HashMap<Long, Review>();

	public ReviewSiteRepository() {
		Review springMVC = new Review(1L, "Spring Boot & MVC",
				"This page reviews information on how to use Spring Boot & MVC and its functionality. ", "java.png",
				"Creates stand-alone Spring applications.\r\n" + "\r\n"
						+ "Embeds Tomcat, Jetty or Undertow directly (no need to deploy WAR files).\r\n" + "\r\n"
						+ "Provides opinionated 'starter' dependencies to simplify your build configuration.\r\n"
						+ "\r\n" + "Automatically configures Spring and 3rd party libraries whenever possible.\r\n"
						+ "\r\n"
						+ "Provides production-ready features such as metrics, health checks and externalized configuration.\r\n"
						+ "\r\n" + "Absolutely no code generation and no requirement for XML configuration.");
		Review thymeleaf = new Review(2L, "Thymeleaf",
				"This page reviews information on what Thymeleaf is, and how to use it.", "thyme.jpg",
				"Thymeleaf is a Java XML/XHTML/HTML5 template engine that can work both in web (Servlet-based) and non-web environments. It is better suited for serving XHTML/HTML5 at the view layer of MVC-based web applications, but it can process any XML file even in offline environments. It provides full Spring Framework integration.");
		Review htmlcss = new Review(3L, "HTML & CSS", "This page reviews what HTML and CSS are, and how to use them. ",
				"html.jpg",
				"HTML (the Hypertext Markup Language) and CSS (Cascading Style Sheets) are two of the core technologies for building Web pages. HTML provides the structure of the page, CSS the (visual and aural) layout, for a variety of devices.");

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
