package com.bit.model;

import java.util.Date;

public class BoardVo {
	private int boardno, views;
	private String writer, writermail, password, title, content;
	private Date writedate;
	
	@Override
	public String toString() {
		return "{\"boardno\":"+boardno
				+", \"title\":\""+title
				+"\", \"writer\":\""+writer
				+"\", \"writermail\":\""+writermail
				+"\", \"password\":\""+password
				+"\", \"content\":\""+content
				+"\", \"writedate\":\""+writedate
				+"\", \"views\":"+views+"}";
	}
	
	public int getBoardno() {
		return boardno;
	}
	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWritermail() {
		return writermail;
	}
	public void setWritermail(String writermail) {
		this.writermail = writermail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getWritedate() {
		return writedate;
	}

	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}

}
