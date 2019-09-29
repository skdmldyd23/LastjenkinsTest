package com.ryeom.demo.board.DAO;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ryeom.demo.board.DTO.Boards;
@Repository
public class BoardDAO_Impl implements BoardDAO {

	@Inject
	private SqlSession sql;

	private static String Namespace = "boards";

	@Override
	public List<Boards> boardTest() {
		// TODO Auto-generated method stub
		return sql.selectList(Namespace+".boardtest");
	}

	@Override
	public void insertContents(Boards boards) {
		// TODO Auto-generated method stub
		System.out.println(boards.getBoard_Writer());
		sql.insert(Namespace + ".boardinsert", boards);
	}

	@Override
	public List<Boards> loadMyPosts(Boards boards) {
		// TODO Auto-generated method stub
		System.out.println(boards.getBoard_Writer());
		return sql.selectList(Namespace+".loadMyPosts", boards);
	}
}
