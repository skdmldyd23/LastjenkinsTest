package com.ryeom.demo.user.Service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ryeom.demo.user.DTO.Users;

public interface UserService {
	
	public List<Users> Test();
	public int insertAcc(Users users);
	public Users trySingIn(Users users, HttpServletRequest req);
	public void logout(HttpSession ses);
}