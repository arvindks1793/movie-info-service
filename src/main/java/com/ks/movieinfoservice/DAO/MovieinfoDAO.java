package com.ks.movieinfoservice.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ks.movieinfoservice.model.MovieInfoRowMapper;
import com.ks.movieinfoservice.model.MovieinfoModel;

@Transactional
@Repository
public class MovieinfoDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public MovieinfoDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public MovieinfoModel getMovieInfoByUserID(String movieId) {
		System.out.println("inside info DAO========================================================================");
		String sql = "select * from movie_info where movieid=?";
		RowMapper<MovieinfoModel> rowMapper = new MovieInfoRowMapper();
		MovieinfoModel movieinfoModel = jdbcTemplate.queryForObject(sql,
				rowMapper, movieId);
		return movieinfoModel;
	}

}
