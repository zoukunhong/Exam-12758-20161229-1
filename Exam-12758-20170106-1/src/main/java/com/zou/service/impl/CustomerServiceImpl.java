package com.zou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.zou.dto.Page;
import com.zou.dto.ResponseData;
import com.zou.entity.Customer;
import com.zou.mapper.CustomerMapper;
import com.zou.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public Customer getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseData<Customer> query(Page<Customer> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> batchInsert(List<Customer> t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer insert(Customer t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Customer t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int batchUpdate(List<Customer> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> selectAllByEntity(Customer customer) {
		return customerMapper.selectAllByEntity(customer);
	}
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerServiceImpl service = (CustomerServiceImpl)context.getBean("customerServiceImpl");
		Customer customer = new Customer(null,"MAR");
		System.out.println(service.selectAllByEntity(customer));
	}
}
