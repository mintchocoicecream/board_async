package com.bit.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.BoardDao;

public class AddController extends HttpServlet {
	Logger log=Logger.getLogger("com.bit.controller.AddController");

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=req.getServletContext();
		String url=context.getInitParameter("url");
		String user=context.getInitParameter("user");
		String pw=context.getInitParameter("password");
		BoardDao dao=new BoardDao(url, user, pw);
		
		String writermail=req.getParameter("writerEmail");
		String password=req.getParameter("pw");
		String writer=req.getParameter("writer");
		String title=req.getParameter("title");
		String content=req.getParameter("content");
		log.info(writermail+","+password+","+writer+","+title+","+content);
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setStatus(resp.SC_CREATED);
		
		try{
			dao.insertOne(title, writer, writermail, password, content);
		}catch(SQLException e) {
			resp.sendError(resp.SC_BAD_REQUEST);
		}
		
		
		
	}
}
