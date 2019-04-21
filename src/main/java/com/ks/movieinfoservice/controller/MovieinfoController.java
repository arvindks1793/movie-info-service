package com.ks.movieinfoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ks.movieinfoservice.model.MovieinfoModel;
import com.ks.movieinfoservice.service.MovieinfoService;

@Controller
public class MovieinfoController {

	@Autowired
	private MovieinfoService movieInfoService;

	@RequestMapping(method = RequestMethod.GET, value = "/info/{movieId}")
	public ResponseEntity<MovieinfoModel> getMovieInfoByUserId(
			@PathVariable String movieId) {
		System.out.println("inside info controller==========================================================================");
		MovieinfoModel movieInfoModel;
		try {
			movieInfoModel = movieInfoService.getMovieInfoByUserId(movieId);
		} catch (Exception e) {
			System.out.println(e.getMessage().getClass());
			throw e;
		}
		return new ResponseEntity<MovieinfoModel>(movieInfoModel, HttpStatus.OK);
	}

}
