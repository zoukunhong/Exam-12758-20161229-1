package com.zou.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zou.util.DBUtilExcute;

public class LanguageDao {
	public static List<Object> getLanguages() throws SQLException{
		List<Object> values = new ArrayList<Object>();
		String sql = "select * from language";
		return DBUtilExcute.executeQuery(sql, values);
	}
}
