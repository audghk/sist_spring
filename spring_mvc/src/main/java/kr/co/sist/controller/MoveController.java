package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("id")
@Controller
public class MoveController {
	@GetMapping("day0610/use_redirect.do")
	public String useRedirect() {
		//return "day0610/test.jsp"; //ViewResolver를 총해서 응답 => WEB-INF/views/day0610/test.jsp.jsp
		//return "redirect:test.jsp"; //redirect:를 사용하면 viewRelsolver를 거치지 않고 URL로 직접 요청한다.
		return "redirect:http://stu6.sist.co.kr/spring_mvc/day0610/test.jsp";
	}//useRedirect

		@GetMapping("day0610/use_redirect2.do")
		public String useRedirect2() {
			//return "../day0605/hsr_hs.do"; //ViewResolver를 총해서 응답 => WEB-INF/day0605/hsr_hs.do.jsp
			//return "redirect:../day0605/hsr_hs.do";//redirect:를 사용하면 viewRelsolver를 거치지 않고 URL로 직접 요청한다.
			return "redirect:http://stu6.sist.co.kr/spring_mvc/day0605/hsr_hs.do";
		}//useRedirect2
		
		//////////forward chain/////////////
		//forward_a.do의 요청이 발생하면 forward_b.do로 이동한다.
		@GetMapping("/day0610/forward_a.do")
		public String useForwardA() {
			//return "forward_b.do";// ViewResolver => WEB-INF/views/forward_b.do.jsp
			return "forward:forward_b.do";// ViewResolver를 거치지 않고 do를 연결하여 호출
		}
		
		//forward_b.do의 요청이 발생하면 forward_c.do로 이동한다.
		@GetMapping("/day0610/forward_b.do")
		public String useForwardB( Model model ) {
			model.addAttribute("id","kim");//request, @SessionAttributes("id") => session 로그인 체크
			return "forward:forward_c.do";
		}
		
		//forward_c.do 최종적인 결과를 보여주는 페이지
		@GetMapping("/day0610/forward_c.do")
		public String useForwardC(String year, String month, Model model) {
			
			System.out.println(year+" / "+month+" / "+model.getAttribute("id"));
			
			return "day0610/forward_result";
		}
}
