package com.zou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zou.dto.Page;
import com.zou.dto.ResponseData;
import com.zou.entity.Film;
import com.zou.entity.Language;
import com.zou.service.FilmService;

@RestController
@RequestMapping("/data/film")
public class FilmDataController {
	@Autowired
	private FilmService filmService;
	@RequestMapping(path = "", method = RequestMethod.GET)
    public ResponseData<Film> query(@RequestParam(name = "title", required = false, defaultValue = "") String title,
                              @RequestParam(name = "description", required = false, defaultValue = "") String description,
                              @RequestParam(name = "page",required = false, defaultValue = "1") int page,
                              @RequestParam(name = "language",required = false, defaultValue = "") Integer language,
                              @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        System.out.println("FilmDataController query");
    	Page arg = new Page().setPage(page).setPageSize(pageSize).setEntity(new Film(null, title, description, new Language(language, null, null)));
    	ResponseData<Film> result = filmService.query(arg);
    	return result;
    }
	
	
	@RequestMapping(path = "/delete", method = RequestMethod.GET)
    public Integer delete(@RequestParam(name = "filmId",required = false, defaultValue = "") Integer filmId) {
		System.out.println("FilmDataController delete");
		Integer result = -1;
		try{
			result = filmService.delete(filmId);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return result;
		}
    }
	
	
	
	@RequestMapping(path = "/modify", method = RequestMethod.GET)
    public Integer modify(@RequestParam(name = "filmId",required = false, defaultValue = "") Integer filmId,
    		@RequestParam(name = "title", required = false, defaultValue = "") String title,
            @RequestParam(name = "description", required = false, defaultValue = "") String description,
            @RequestParam(name = "language",required = false, defaultValue = "") Integer language) {
        System.out.println("FilmDataController modify");
        Film film = new Film(filmId, title, description, new Language(language, null, null));
    	Integer result = filmService.update(film);
    	return result;
    }
	
	@RequestMapping(path = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam(name = "title", required = false, defaultValue = "") String title,
            @RequestParam(name = "description", required = false, defaultValue = "") String description,
            @RequestParam(name = "language",required = false, defaultValue = "") Integer language) {
        System.out.println("FilmDataController modify");
        Film film = new Film(null, title, description, new Language(language, null, null));
        Integer result = -1;
        if(filmService.insert(film) != null){
        	result = 1;
        }
    	return result;
    }
	
	
	@RequestMapping(path = "/queryById", method = RequestMethod.GET)
    public Film queryById(@RequestParam(name = "filmId",required = false, defaultValue = "") Integer filmId) {
        System.out.println("FilmDataController queryById");
    	Film result = filmService.getById(filmId);
    	return result;
    }
}
