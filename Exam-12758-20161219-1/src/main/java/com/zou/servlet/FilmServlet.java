package com.zou.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zou.dao.FilmDao;

public class FilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FilmServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String choice = request.getParameter("choice");
		try {
			if("show".equals(choice)){
				showFilm(request, response);
			}else if("showOne".equals(choice)){
				showOneFilm(request, response);
			}else if("add".equals(choice)){
				addFilm(request, response);
			}else if("modify".equals(choice)){
				modifyFilm(request, response);
			}else if("delete".equals(choice)){
				deleteFilm(request, response);
			}else{
				request.setAttribute("info", "无该操作");
				request.getRequestDispatcher("result.jsp").forward(request,response);
			}
		}catch (Exception e){
			e.printStackTrace();
			request.setAttribute("info", e.getMessage());
			request.getRequestDispatcher("result.jsp").forward(request,response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
	
	
	
	
	
	
	
	
	private void showFilm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			List<Object> list = FilmDao.getAllFilm();
			request.setAttribute("list", list);
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("info", e.getMessage());
			request.getRequestDispatcher("result.jsp").forward(request,response);
			return;
		}
		request.getRequestDispatcher("/page/showFilm.jsp").forward(request, response);
	}
	
	
	
	
	private void showOneFilm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			String film_id = request.getParameter("film_id");
			List<Object> list = FilmDao.getOneFilmById(film_id);
			if(list.size() < 1){
				request.setAttribute("info", "没有该Film记录!");
				request.getRequestDispatcher("/page/result.jsp").forward(request,response);
				return;
			}
			request.setAttribute("film", list.get(0));
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("info", e.getMessage());
			request.getRequestDispatcher("/page/result.jsp").forward(request,response);
			return;
		}
		request.getRequestDispatcher("/PrepareServlet?languages=1&page=/page/update_film.jsp").forward(request, response);
	}
	
	
	
	
	
	
	private void addFilm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			List<Object> values = new ArrayList<Object>();
			values.add(request.getParameter("title"));
			values.add(request.getParameter("description"));
			values.add(request.getParameter("language"));
			int num = FilmDao.addFilm(values);
			if(num < 1){
				request.setAttribute("info", "添加失败，请稍后再试!");
			}else{
				request.setAttribute("info", "添加成功!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("info", e.getMessage());
		}
		request.getRequestDispatcher("/page/result.jsp").forward(request, response);
	}
	
	
	
	
	
	private void modifyFilm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			String film_id = request.getParameter("film_id");
			String title = request.getParameter("title");
			String description = request.getParameter("description");
			String language = request.getParameter("language");
			int num = FilmDao.modifyFilm(film_id, title, description, language);
			if(num < 1){
				request.setAttribute("info", "修改失败，请稍后再试!");
			}else{
				request.setAttribute("info", "修改成功!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("info", e.getMessage());
			request.getRequestDispatcher("/page/result.jsp").forward(request,response);
			return;
		}
		request.getRequestDispatcher("/page/result.jsp").forward(request, response);
	}
	
	
	
	
	private void deleteFilm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			String film_id = request.getParameter("film_id");
			int num = FilmDao.deleteFilmById(film_id);
			if(num < 1){
				request.setAttribute("info", "删除失败，请稍后再试!");
			}else{
				request.setAttribute("info", "删除成功!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("info", e.getMessage());
			request.getRequestDispatcher("/page/result.jsp").forward(request,response);
			return;
		}
		request.getRequestDispatcher("/page/result.jsp").forward(request, response);
	}
	
}
