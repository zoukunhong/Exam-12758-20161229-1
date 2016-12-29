package zoukunhong.Exam_12758_20161229_1.service;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zoukunhong.Exam_12758_20161229_1.dao.Dao;
import zoukunhong.Exam_12758_20161229_1.entity.Language;


public class LanguageService implements IEntityService<Language> {
	private Dao<Language> languageDao;
	
	public void setLanguageDao(Dao<Language> languageDao) {
		this.languageDao = languageDao;
	}

	@Override
	public List<Language> getAll() {
		return languageDao.getAll();
	}

	@Override
	public int save(Language language) {
		return 0;
	}
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/ApplicationContext.xml");
		LanguageService service = (LanguageService)context.getBean("languageService");
		System.out.println(service.getAll());
	}
}
