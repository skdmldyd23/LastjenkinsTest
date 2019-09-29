package com.ryeom.demo.board.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ryeom.demo.board.DTO.Boards;
import com.ryeom.demo.board.Service.BoardService;

@Controller
public class BoardController {
	
	@Resource(name="boardService")
	BoardService boardService;
	
	@RequestMapping("/tryWrite")
	public String login(Boards boards, Model model) {
		System.out.println("writer:" + boards.getBoard_Writer());
		System.out.println("tryWrite \n" + boards);
		
		boardService.insertContents(boards);

		return "redirect:/";
	}
	
	@RequestMapping("/write")
	public String write(Model model, HttpServletRequest req){
		HttpSession ses = req.getSession();
		
		String id = (String)ses.getAttribute("signedId"); 
		if(id == null) {
			return "redirect:/login";
		}
		else
		return "board/write";
	}
	
	@RequestMapping("/details")
	public String details(Model model) {

		return "board/details";
	}
	
	@RequestMapping(value = "/myPosts", method = RequestMethod.GET)
	public String index(Boards boards, Model model) {

		model.addAttribute("loadMyPosts",boardService.loadMyPosts(boards));

		return "board/myPosts";
	}
}