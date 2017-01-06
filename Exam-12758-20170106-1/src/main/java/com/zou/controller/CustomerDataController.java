package com.zou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zou.entity.Customer;
import com.zou.service.CustomerService;

@RestController
@RequestMapping("/data/customer")
public class CustomerDataController {
	@Autowired
	private CustomerService customerService;
    @RequestMapping(path = "", method = RequestMethod.GET)
    public  String  query(@RequestParam(name = "firstName", required = false, defaultValue = "") String firstName) {
        System.out.println("CustomerDataController query");
        String result = "系统错误";
        try{
        	List<Customer> list = customerService.selectAllByEntity(new Customer(null, firstName));
        	if(list.size() > 0){
        		result = "登录成功";
        	}else{
        		result = "无该用户";
        	}
        }catch(Exception e){
        	e.printStackTrace();
        }
        return result;
    }
}
