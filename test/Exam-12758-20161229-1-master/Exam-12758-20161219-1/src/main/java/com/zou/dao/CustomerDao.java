package com.zou.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zou.util.DBUtilExcute;


public class CustomerDao{
	public static List<Object> getCustomerByName(String name) throws SQLException{
		List<Object> values = new ArrayList<Object>(); 
		values.add(name);
		String sql = "select * from customer where first_name = ?";
		return DBUtilExcute.executeQuery(sql, values);
	}
	public static void main(String[] args) {
		try {
			getCustomerByName("test");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
