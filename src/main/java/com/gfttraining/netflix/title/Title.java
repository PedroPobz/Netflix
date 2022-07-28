package com.gfttraining.netflix.title;

import javax.persistence.Entity;

@Entity
public class Title {

	
	private Integer title;
	private String date_added;
	private String release_year;
	private String rating;
	private String duration;
	private String description;
	private Float user_rating;
	private Integer num_rating;
	
	
	
	
	
	
	
	public Title(Integer title, String date_added, String release_year, String rating, String duration,
			String description, Float user_rating, Integer num_rating) {
		super();
		this.title = title;
		this.date_added = date_added;
		this.release_year = release_year;
		this.rating = rating;
		this.duration = duration;
		this.description = description;
		this.user_rating = user_rating;
		this.num_rating = num_rating;
	}
	public Title() {
	
	}
	
	public Integer getTitle() {
		return title;
	}
	public void setTitle(Integer title) {
		this.title = title;
	}
	public String getDate_added() {
		return date_added;
	}
	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}
	public String getRelease_year() {
		return release_year;
	}
	public void setRelease_year(String release_year) {
		this.release_year = release_year;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getUser_rating() {
		return user_rating;
	}
	public void setUser_rating(Float user_rating) {
		this.user_rating = user_rating;
	}
	public Integer getNum_rating() {
		return num_rating;
	}
	public void setNum_rating(Integer num_rating) {
		this.num_rating = num_rating;
	}
	
	
	
	
}
