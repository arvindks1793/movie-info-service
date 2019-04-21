package com.ks.movieinfoservice.model;

public class MovieinfoModel {

	public MovieinfoModel() {

	}

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String movieID;

	public MovieinfoModel(String id, String movieID, String movieDetails) {
		super();
		this.id = id;
		this.movieID = movieID;
		this.movieDetails = movieDetails;
	}

	private String movieDetails;

	public String getMovieID() {
		return movieID;
	}

	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}

	public String getMovieDetails() {
		return movieDetails;
	}

	public void setMovieDetails(String movieDetails) {
		this.movieDetails = movieDetails;
	}

}
