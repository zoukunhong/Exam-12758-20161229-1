package zoukunhong.Exam_12758_20161229_1.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import zoukunhong.Exam_12758_20161229_1.commom.InputUtil;
import zoukunhong.Exam_12758_20161229_1.entity.Film;
import zoukunhong.Exam_12758_20161229_1.service.FilmService;
import zoukunhong.Exam_12758_20161229_1.service.IEntityService;

/**
 * 功能控制
 * */
@Component
public class FunctionController {
	@Autowired
	private IEntityService filmService;
	public void saveFilm(){
        Film film = new Film();
       
        System.out.println("请输入电影名称(title): ");
        String title = InputUtil.getString();
        System.out.println("请输入电影描述(description): ");
        String description = InputUtil.getString();
        System.out.println("请输入语言 ID(language_id): ");
        Integer language_id = InputUtil.getInt();
        film.setTitle(title);
        film.setDescription(description);
        film.setLanguage_id(language_id);
        filmService.save(film);
	} 
	
	public static void main(String[] args) {
		
	}
	
}
