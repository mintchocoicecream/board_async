package com.bit.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.BoardDao;

public class EditController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=req.getServletContext();
		String url=context.getInitParameter("url");
		String user=context.getInitParameter("user");
		String password=context.getInitParameter("password");
		BoardDao dao=new BoardDao(url, user, password);
		
		int boardno=Integer.parseInt(req.getParameter("boardno"));
	
		String title=req.getParameter("title");
		String content=req.getParameter("content");
		System.out.println(boardno+","+title+","+content);
		resp.setHeader("Access-Control-Allow-Origin", "*");

		try {
			dao.editOne(boardno, title, content);
		} catch (SQLException e) {
			resp.sendError(resp.SC_BAD_REQUEST);
		}
	
	}
}
