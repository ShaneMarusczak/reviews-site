package org.wecancodeit.reviewsite;

public class Review {

	private Long Id;
	private String title;
	private String category;
	private String image;

	Review(Long id, String title, String category, String image) {
		this.Id = id;
		this.title = title;
		this.category = category;
		this.image = image;
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

	public String getImage() {
		return image;
	}

}
