package zoukunhong.Exam_12758_20161229_1.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import zoukunhong.Exam_12758_20161229_1.entity.Film;
@Repository
public class FilmDao extends Dao<Film>{
	@Override
	public List<Film> getAll() {
		return sqlSessionTemplate.selectList("getAllFilm");
	}

	@Override
	public int save(Film film) {
		return sqlSessionTemplate.update("saveFilm",film);
	}

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/ApplicationContext.xml");
		Dao dao = (Dao)context.getBean("filmDao");
		Film film = new Film();
		film.setTitle("test");
		film.setDescription("this is a save test");
		film.setLanguage_id(1);
		List<Film> list = dao.getAll();
		System.out.println(list.get(0));
		dao.save(film);
	}
}
