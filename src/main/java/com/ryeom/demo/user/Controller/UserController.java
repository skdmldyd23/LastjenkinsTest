package com.ryeom.demo.user.Controller;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ryeom.demo.user.DTO.Users;
import com.ryeom.demo.user.Service.UserService;

@Controller
public class UserController {

	@Inject
	private UserService userService;

	@RequestMapping("/login")
	public String login(Model model) {

		return "signIn/login";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession ses) {
		
		userService.logout(ses);
		return "redirect:/";
	}


	@RequestMapping("/join")
	public String join(Model model) {

		return "signIn/join";
	}

	@RequestMapping("/insertAccount")
	public String insertAccount(Users users, Model model) {

		userService.insertAcc(users);

		return "redirect:/";
	}

	@RequestMapping("/tryLogin")
	public String tryLogin(Users users, Model model, HttpServletRequest req) {

		System.out.println(" - - - --  - - - - - - --  --  - -- "+users +" - - - --  - - - - - - --  --  - -- ");
		Users uu = userService.trySingIn(users, req);
				if (uu!=null)
			return "redirect:/";
		else
			return "redirect:signin/login";
	}
	
	@RequestMapping("/myInfo")
	public String myInfo(Model model) {

		return "signIn/myInfo";
	}
}
