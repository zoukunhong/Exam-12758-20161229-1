package com.zou.service.impl;

import com.zou.dto.Page;
import com.zou.dto.ResponseData;
import com.zou.entity.Film;
import com.zou.entity.Language;
import com.zou.mapper.FilmMapper;
import com.zou.service.FilmService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService{
	@Autowired
	private FilmMapper filmMapper;
	
	@Override
	public Film getById(int id) {
		return filmMapper.getById(id);
	}

	@Override
	public ResponseData<Film> query(Page<Film> page) {
		if(page == null){
			return null;
		}
        ResponseData<Film> responseData = new ResponseData<>();
        
        responseData.setRows(filmMapper.select(page));
        responseData.setTotal(filmMapper.selectCount((Film) page.getEntity()));
        
        return responseData;
	}

	@Override
	public List<String> batchInsert(List<Film> list) {
		return null;
	}

	@Override
	public int delete(Integer id) {
		System.out.println("delete " + id);
		return filmMapper.delete(new Film(id, null, null, null));
	}

	@Override
	public int update(Film film) {
		return filmMapper.update(film);
	}

	@Override
	public int batchUpdate(List<Film> list) {
		return 0;
	}
	
	
	@Override
	public Film insert(Film film) {
		filmMapper.insert(film);
		return film;
	}
	

	@Override
	public List<Film> selectAll() {
		return null;
	}

	@Override
	public List<Film> selectAllByEntity(Film film) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args){
		System.out.println("test");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		FilmServiceImpl service = (FilmServiceImpl)context.getBean("filmServiceImpl");
/*		
		Page<Film> page = new Page<Film>(1, 10, new Film(null,null,null,new Language(4, null, null)));
		ResponseData<Film> data= service.query(page);
		System.out.println(data);
		System.out.println(service.getById(2));
		service.update(new Film(1018, "try", "s", new Language(3, null, null)));
		service.delete(1018);
		Film film = service.insert(new Film(null, "try", "s", new Language(3, null, null)));
		System.out.println(film);*/
		Page<Film> page = new Page<Film>(5, 10, new Film(null,null,null,new Language(1, null, null)));
		ResponseData<Film> data= service.query(page);
		System.out.println(data);
	}

}
