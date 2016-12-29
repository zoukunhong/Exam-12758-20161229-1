package zoukunhong.Exam_12758_20161229_1.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import zoukunhong.Exam_12758_20161229_1.entity.Language;

@Repository
public class LanguageDao extends Dao<Language>{

	@Override
	public List<Language> getAll() {
		return sqlSessionTemplate.selectList("getAllLanguage");
	}
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/ApplicationContext.xml");
		LanguageDao dao = (LanguageDao)context.getBean("languageDao");
		System.out.println(dao.getAll());
	}
}
