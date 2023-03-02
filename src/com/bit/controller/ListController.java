package com.bit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.BoardDao;

public class ListController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=req.getServletContext();
		String url=context.getInitParameter("url");
		String user=context.getInitParameter("user");
		String password=context.getInitParameter("password");
		BoardDao dao=new BoardDao(url, user, password);
		resp.setHeader("Access-Control-Allow-Origin","*");
		resp.setContentType("text/html;charset=UTF-8");
		resp.setContentType("application/json");
		try(
				PrintWriter out=resp.getWriter();
				){
				out.print("{\"board\":");
				try {
					out.print(dao.getList().toString());
				}catch(SQLException e){
					out.print("[]");
				}
				out.print("}");
		}
	}
}
