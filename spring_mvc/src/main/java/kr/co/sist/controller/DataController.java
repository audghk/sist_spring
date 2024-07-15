package kr.co.sist.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import kr.co.sist.service.TestService;

@SessionAttributes("id")//request와 session 둘다 값이 들어간다.
@Controller
public class DataController {
	
	@Autowired(required = false)
	private TestService ts;
	
	/**
	 * HttpServletRequest, HttpSession을 사용한 View에 값 전달.
	 * @return
	 */
	@GetMapping("/day0605/hsr_hs.do")
	public String hsrHs(HttpServletRequest request, HttpSession session) {
		
		request.setAttribute("names", ts.searchNames());//requestScope.names
		session.setAttribute("id", ts.searchId());//sessionScope.id
		
		
		return "day0605/hsr_hs";
	}
	
	@GetMapping("/day0605/model.do")
	public String useModel(Model model) {
		
		model.addAttribute("names", ts.searchNames());//requestScope.names
		model.addAttribute("id", ts.searchId());//requestScope.id, sessionScope.id 둘다 가능. session을 너무 많이 쓰면 메모리가 낭비될 수 있음~
		//model에 값 설정
		
		return "/day0605/model";
		
	}
	
	@GetMapping("/day0605/mav.do")
	public ModelAndView useModelAndView() {
		
		//ModelAndView 생성
		ModelAndView mav=new ModelAndView();
		//view 페이지 명 설정
		mav.setViewName("/day0605/mav");
		//view페이지로 전달할 데이터 설정
		mav.addObject("names", ts.searchNames());//requestScope.names
		mav.addObject("id", ts.searchId());//requestScope.id, sessionScope.id 둘다 가능. session을 너무 많이 쓰면 메모리가 낭비될 수 있음~
		//model에 값 설정
		
		return mav;
		
	}
}
