package kr.co.sist.user.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UserMainController {
	
	@RequestMapping(value = "/index.do",method= {GET,POST})
	public String userMain(Model model) {
		return "user/index";
	}
}
