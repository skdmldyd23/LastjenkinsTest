package com.ryeom.demo.board.Service;

import java.util.List;

import com.ryeom.demo.board.DTO.Boards;

public interface BoardService {

	public List<Boards> boardTest();
	public void insertContents(Boards boards);
	public List<Boards> loadMyPosts(Boards boards);
	
}
