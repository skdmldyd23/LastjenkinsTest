package com.ryeom.demo.board.DAO;

import java.util.List;

import com.ryeom.demo.board.DTO.Boards;

public interface BoardDAO {

	public List<Boards> boardTest();

	public void insertContents(Boards boards);

	public List<Boards> loadMyPosts(Boards boards);
}
