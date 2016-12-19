package com.zou.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zou.dao.LanguageDao;

/**
 * Servlet implementation class PrepareServlet
 */
public class PrepareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PrepareServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String,String[]> map = request.getParameterMap();
		if(map.containsKey("languages")){
			prepareLanguage(request, response);
		}
		String page = request.getParameter("page");
		request.getRequestDispatcher(page).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public static void prepareLanguage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setAttribute("languages", LanguageDao.getLanguages());
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("info", e.getMessage());
			request.getRequestDispatcher("result.jsp").forward(request,response);
			return;
		}
	}
}
