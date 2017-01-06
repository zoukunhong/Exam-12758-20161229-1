package com.zou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/film")
public class FilmController {
	@RequestMapping("/ShowFilm")
	public String showFilm(){
		System.out.println("FilmController showFilm");
		return "ShowFilm";
	}
	@RequestMapping("/ModifyFilm")
	public String modifyFilm(){
		System.out.println("FilmController modifyFilm");
		return "ModifyFilm";
	}
	@RequestMapping("/AddFilm")
	public String addFilm(){
		System.out.println("FilmController addFilm");
		return "AddFilm";
	}
}
