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
import com.bit.model.BoardVo;

public class DetailController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=req.getServletContext();
		String url=context.getInitParameter("url");
		String user=context.getInitParameter("user");
		String pw=context.getInitParameter("password");
		BoardDao dao=new BoardDao(url, user, pw);
		
		int boardno=Integer.parseInt(req.getParameter("boardno"));
		
		resp.setHeader("Access-Control-Allow-Origin","*");
		resp.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out=resp.getWriter();){
			out.print("{\"boardno\":[");
			BoardVo bean=dao.selectOne(boardno);
			out.print(bean);
			out.print("]}");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
