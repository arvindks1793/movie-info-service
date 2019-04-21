package com.ks.movieinfoservice.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MovieInfoRowMapper implements RowMapper<MovieinfoModel> {

	@Override
	public MovieinfoModel mapRow(ResultSet row, int rowNum) throws SQLException {
		System.out.println(row + "====" + rowNum);
		MovieinfoModel movieinfoModel = new MovieinfoModel();
		movieinfoModel.setId(row.getString("ID"));
		movieinfoModel.setMovieDetails(row.getString("MOVIEDETAILS"));
		movieinfoModel.setMovieID(row.getString("MOVIEID"));
		// TODO Auto-generated method stub
		return movieinfoModel;
	}

}
