package com.ryeom.demo.board.DTO;

public class Boards {
	private String board_Number;
	private String board_Title;
	private int board_Writer;
	private String board_Date;
	private String board_Contents;
	private String user_Name;
	
	public String getBoard_Number() {
		return board_Number;
	}
	public void setBoard_Number(String board_Number) {
		this.board_Number = board_Number;
	}
	public String getBoard_Title() {
		return board_Title;
	}
	public void setBoard_Title(String board_Title) {
		this.board_Title = board_Title;
	}
	public int getBoard_Writer() {
		return board_Writer;
	}
	public void setBoard_Writer(int board_Writer) {
		this.board_Writer = board_Writer;
	}
	public String getBoard_Date() {
		return board_Date;
	}
	public void setBoard_Date(String board_Date) {
		this.board_Date = board_Date;
	}
	public String getBoard_Contents() {
		return board_Contents;
	}
	public void setBoard_Contents(String board_Contents) {
		this.board_Contents = board_Contents;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	
}
