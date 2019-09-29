package com.ryeom.demo.user.Service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.ryeom.demo.user.DAO.UserDAO;
import com.ryeom.demo.user.DTO.Users;

@Service
public class UserService_Impl implements UserService {

	@Inject
	private UserDAO userDao;

	@Override
	public List<Users> Test() {

		return userDao.Test();
	}

	@Override
	public int insertAcc(Users users) {

		return userDao.insertAcc(users);
	}

	@Override
	public Users trySingIn(Users users, HttpServletRequest req) {
		// TODO Auto-generated method stub\
		Users uu = userDao.trySignIn(users);
		System.out.println("fasdhfjsdkfhj"+uu);
		if (uu == null)
			return null;
		else {
			HttpSession ses= req.getSession();
			ses.setAttribute("signedId", uu.getUser_ID());
			ses.setAttribute("signedName", uu.getUser_Name());
			ses.setAttribute("signedNumber", uu.getUser_Number());
			return uu;
		}
	}

	@Override
	public void logout(HttpSession ses) {
		// TODO Auto-generated method stub
		ses.invalidate();
		
	}

}
