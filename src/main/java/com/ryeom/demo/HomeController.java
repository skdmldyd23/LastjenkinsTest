package com.ryeom.demo;
import javax.annotation.Resource;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ryeom.demo.board.Service.BoardService;

@Controller
public class HomeController {
	
	@Resource(name="boardService")

	@Inject
	private BoardService boardService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {

		model.addAttribute("boardtest", boardService.boardTest());
		System.out.println("index입니다.");

		// System.out.println(userService.Test().toString());
		return "index";
	}
}
//asdasdsadasd