package com.ryeom.demo.user.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ryeom.demo.user.DTO.Users;

@Repository
public class UserDAO_Impl implements UserDAO {

	@Inject
	private SqlSession sql;
	private static final String Namespace = "users";

	@Override
	public List<Users> Test() {
		return sql.selectList(Namespace + ".test");
	}


	@Override
	public int insertAcc(Users users) {
		// TODO Auto-generated method stub
		return sql.insert(Namespace+".joinAccount", users);
	}

	@Override
	public Users trySignIn(Users users) {
		// TODO Auto-generated method stub
		return sql.selectOne(Namespace + ".trySignIn",users);
	}

}
