package com.zou.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zou.util.DBUtilExcute;

public class FilmDao {
	
	public static List<Object> getAllFilm() throws SQLException{
		List<Object> values = new ArrayList<Object>();
		String sql = "select f.film_id,f.title,f.description,l.name from film f,language l where f.language_id = l.language_id";
		return DBUtilExcute.executeQuery(sql, values);
	}
	
	public static int addFilm(List<Object> values) throws SQLException{
		String sql = "insert into film(title,description,language_id) values(?,?,?)";
		return DBUtilExcute.insertOrUpdateOrDelete(sql, values);
	}
	
	public static List<Object> getOneFilmById(String id) throws SQLException{
		List<Object> values = new ArrayList<Object>();
		values.add(id);
		String sql = "select film_id,title,description,language_id from film where film_id = ?";
		return DBUtilExcute.executeQuery(sql, values);
	}
	
	public static int deleteFilmById(String id) throws SQLException{
		List<Object> values = new ArrayList<Object>();
		values.add(id);
		String sql = "delete from film where film_id = ?";
		return DBUtilExcute.insertOrUpdateOrDelete(sql, values);
	}
	
	public static int modifyFilm(Object film_id,Object title,Object description,Object language) throws SQLException{
		List<Object> values = new ArrayList<Object>();
		values.add(title);
		values.add(description);
		values.add(language);
		values.add(film_id);
		String sql = "update film set title = ?,description=?,language_id=? where film_id = ?";
		return DBUtilExcute.insertOrUpdateOrDelete(sql, values);
	}
	public static void main(String[] args){
		try {
			System.out.println(getAllFilm());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
