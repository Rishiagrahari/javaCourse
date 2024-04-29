package com.cg.movierating.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.movierating.dto.Movie;


@RestController
@RequestMapping("/rating")
public class RatingController {
	@RequestMapping("/list")
	public Movie getAllData(){
		return new Movie(1001,4);
		
		
	}
}
