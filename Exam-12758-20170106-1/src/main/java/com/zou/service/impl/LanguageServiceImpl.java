package com.zou.service.impl;

import com.zou.dto.Page;
import com.zou.dto.ResponseData;
import com.zou.entity.Language;
import com.zou.mapper.LanguageMapper;
import com.zou.service.LanguageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService{
	@Autowired
	private LanguageMapper languageMapper;
	@Override
	public Language getById(int id) {
		return null;
	}

	@Override
	public ResponseData<Language> query(Page<Language> t) {
		return null;
	}

	@Override
	public List<String> batchInsert(List<Language> t) {
		return null;
	}

	@Override
	public int delete(Integer id) {
		return 0;
	}

	@Override
	public Language insert(Language t) {
		return null;
	}

	@Override
	public int update(Language t) {
		return 0;
	}

	@Override
	public int batchUpdate(List<Language> list) {
		return 0;
	}

	@Override
	public List<Language> selectAll() {
		return languageMapper.selectAll();
	}
	@Override
	public List<Language> selectAllByEntity(Language language) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		LanguageServiceImpl service = (LanguageServiceImpl)context.getBean("languageServiceImpl");
		System.out.println(service.selectAll());
		
	}


}
