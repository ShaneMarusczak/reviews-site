package org.wecancodeit.reviewsite;

public class Review {

	private Long Id;
	private String title;
	private String category;

	Review(Long id, String title, String category) {
		this.Id = id;
		this.title = title;
		this.category = category;
	}

	public Long getId() {
		return Id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

}
