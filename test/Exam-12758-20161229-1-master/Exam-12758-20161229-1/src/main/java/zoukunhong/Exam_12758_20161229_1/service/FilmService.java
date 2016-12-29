package zoukunhong.Exam_12758_20161229_1.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import zoukunhong.Exam_12758_20161229_1.dao.Dao;
import zoukunhong.Exam_12758_20161229_1.dao.FilmDao;
import zoukunhong.Exam_12758_20161229_1.entity.Film;
@Service("filmService")
public class FilmService implements IEntityService<Film>{
	@Resource(name="filmDao")
	private Dao<Film> filmDao;
	@Override
	public List<Film> getAll() {
		return filmDao.getAll();
	}
	@Override
	public int save(Film film) {
		return filmDao.save(film);
	}
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/ApplicationContext.xml");
		IEntityService service = (IEntityService)context.getBean("filmService");
		Film film = new Film();
		film.setTitle("test");
		film.setDescription("this is a save test");
		film.setLanguage_id(1);
		List<Film> list = service.getAll();
		System.out.println(list.get(0));
		service.save(film);
	}
}
