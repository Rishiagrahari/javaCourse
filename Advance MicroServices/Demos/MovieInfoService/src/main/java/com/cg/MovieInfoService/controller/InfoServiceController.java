package com.cg.MovieInfoService.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.MovieInfoService.dto.Info;
import com.cg.MovieInfoService.dto.Movie;
import com.cg.MovieInfoService.dto.Rating;

@RestController
@RequestMapping("/info")
public class InfoServiceController {
	@Autowired
	RestTemplate rest;
	@RequestMapping("/list/{movid}")
	public List<Movie> getAllData(@PathVariable("movid") int id){
		
		//RestTemplate restOne=new RestTemplate();
		Info info=rest.getForObject("http://localhost:9090/cato/list",Info.class);
		Rating rating=rest.getForObject("http://localhost:9092/rating/list",Rating.class);
		return Collections.singletonList(new Movie(1001,info.getMovieName(),rating.getMovieRating()));
		
	}

}
