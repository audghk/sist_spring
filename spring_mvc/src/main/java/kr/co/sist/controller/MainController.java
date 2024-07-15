package kr.co.sist.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.sist.service.MainService;

@SessionAttributes("prdList")
@Controller
public class MainController {
	
	//@GetMapping("/index.do")
	public String main(Model model) {
		MainService ms=new MainService();
		List<String> qnaList=ms.qna();
		List<String> prdList=ms.prdList();
		
		//model은 requestScope객체 할당한다.
		model.addAttribute("qnaList",qnaList);
		model.addAttribute("prdList",prdList);
		
		return "index";
	}
	
	//@GetMapping("/test.do")
	public String useSession(Model model) {
		
		//세션의 값 받기
		//System.out.println("==========="+model.getAttribute("prdList"));
		List<String> prdList=(List<String>)model.getAttribute("prdList");
		for(String data : prdList) {
			System.out.println(data);
		}
		
		return "day0528/test";
	}
}
