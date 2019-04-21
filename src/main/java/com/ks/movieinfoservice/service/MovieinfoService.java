package com.ks.movieinfoservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ks.movieinfoservice.DAO.MovieinfoDAO;
import com.ks.movieinfoservice.model.MovieinfoModel;
@Service
public class MovieinfoService {

	@Autowired
	private MovieinfoDAO movieInfoDAO;

	public MovieinfoModel getMovieInfoByUserId(String movieId) {
		System.out.println("inside info service=======================================================================");
		
		MovieinfoModel movieinfoModel = movieInfoDAO.getMovieInfoByUserID(movieId);
		
		return movieinfoModel;
	}

}
