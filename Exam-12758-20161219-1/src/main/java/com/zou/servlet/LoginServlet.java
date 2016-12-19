package com.zou.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zou.dao.CustomerDao;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		try {
			if(CustomerDao.getCustomerByName(name).size() > 0){
				request.getSession().setAttribute("user",name);
				request.setAttribute("info", "登录成功!");
				request.getRequestDispatcher("/page/index.jsp").forward(request, response);
				return;
			}else{
				request.setAttribute("info", "登录失败!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("info", e.getMessage());
		}
		request.getRequestDispatcher("/page/result.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
