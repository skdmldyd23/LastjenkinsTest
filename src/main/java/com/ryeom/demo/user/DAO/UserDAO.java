package com.ryeom.demo.user.DAO;

import java.util.List;

import com.ryeom.demo.user.DTO.Users;

public interface UserDAO {

	public List<Users> Test();
	public int insertAcc(Users users);
	public Users trySignIn(Users users);
}
