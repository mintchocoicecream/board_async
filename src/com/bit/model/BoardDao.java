package com.bit.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	String url, user, password;

	public BoardDao(String url, String user, String password) {
		this.url=url;
		this.user=user;
		this.password=password;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public List<BoardVo> getList() throws SQLException {
		String sql="select * from board order by boardno desc";
		List<BoardVo> list=new ArrayList<>();
		
		try(
				Connection conn=DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt=conn.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery();
				){
			while(rs.next()) {
				BoardVo bean=new BoardVo();
				bean.setBoardno(rs.getInt("boardno"));
				bean.setTitle(rs.getString("title"));
				bean.setWriter(rs.getString("writer"));
				bean.setViews(rs.getInt("views"));
				bean.setWritedate(rs.getDate("writedate"));
				list.add(bean);
			}
		}
		return list;
	}

	public void insertOne(String title, String writer, String writermail, String password2, String content) throws SQLException {
		String sql="insert into board values (0,?,?,?,?,?,0,now())";
		
		try(
				Connection conn=DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setString(1, writer);
			pstmt.setString(2, writermail);
			pstmt.setString(3, password2);
			pstmt.setString(4, title);
			pstmt.setString(5, content);
			pstmt.executeUpdate();
		}
	}

	public BoardVo selectOne(int boardno) throws SQLException {
		String sql="select * from board where boardno=?";
		try(
				Connection conn=DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setInt(1, boardno);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				BoardVo bean=new BoardVo();
				bean.setTitle(rs.getString("title"));
				bean.setWriter(rs.getString("writer"));
				bean.setContent(rs.getString("content"));
				bean.setWritermail(rs.getString("writermail"));
				bean.setPassword(rs.getString("password"));
				return bean;
			}
			
		}
		return null;
	}

	public int editOne(int boardno, String title, String content) throws SQLException {
		String sql="update board set title=?, content=? where boardno=?";
		try(
				Connection conn=DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt=conn.prepareStatement(sql);
				){
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setInt(3, boardno);
			System.out.println("sql="+sql);
			return pstmt.executeUpdate();
		}
	}

	public int deleteOne(int boardno) throws SQLException {
		String sql="delete from board where boardno=?";
		try (
			Connection conn=DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt=conn.prepareStatement(sql);
			){
			pstmt.setInt(1, boardno);
			return pstmt.executeUpdate();
		}
	}

}
