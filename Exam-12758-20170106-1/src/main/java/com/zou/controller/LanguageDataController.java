package com.zou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zou.dto.ResponseData;
import com.zou.entity.Language;
import com.zou.service.LanguageService;

@RestController
@RequestMapping("/data/language")
public class LanguageDataController {
	@Autowired
	private LanguageService languageService;
    @RequestMapping(path = "", method = RequestMethod.GET)
    public  ResponseData<Language>  query() {
        System.out.println("LanguageDataController query");
        ResponseData<Language> data = new ResponseData<>();
        data.setRows(languageService.selectAll());
        System.out.println(data);
        return data;
    }
}
