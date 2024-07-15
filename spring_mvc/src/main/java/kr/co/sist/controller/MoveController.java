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
		//return "day0610/test.jsp"; //ViewResolver�� ���ؼ� ���� => WEB-INF/views/day0610/test.jsp.jsp
		//return "redirect:test.jsp"; //redirect:�� ����ϸ� viewRelsolver�� ��ġ�� �ʰ� URL�� ���� ��û�Ѵ�.
		return "redirect:http://stu6.sist.co.kr/spring_mvc/day0610/test.jsp";
	}//useRedirect

		@GetMapping("day0610/use_redirect2.do")
		public String useRedirect2() {
			//return "../day0605/hsr_hs.do"; //ViewResolver�� ���ؼ� ���� => WEB-INF/day0605/hsr_hs.do.jsp
			//return "redirect:../day0605/hsr_hs.do";//redirect:�� ����ϸ� viewRelsolver�� ��ġ�� �ʰ� URL�� ���� ��û�Ѵ�.
			return "redirect:http://stu6.sist.co.kr/spring_mvc/day0605/hsr_hs.do";
		}//useRedirect2
		
		//////////forward chain/////////////
		//forward_a.do�� ��û�� �߻��ϸ� forward_b.do�� �̵��Ѵ�.
		@GetMapping("/day0610/forward_a.do")
		public String useForwardA() {
			//return "forward_b.do";// ViewResolver => WEB-INF/views/forward_b.do.jsp
			return "forward:forward_b.do";// ViewResolver�� ��ġ�� �ʰ� do�� �����Ͽ� ȣ��
		}
		
		//forward_b.do�� ��û�� �߻��ϸ� forward_c.do�� �̵��Ѵ�.
		@GetMapping("/day0610/forward_b.do")
		public String useForwardB( Model model ) {
			model.addAttribute("id","kim");//request, @SessionAttributes("id") => session �α��� üũ
			return "forward:forward_c.do";
		}
		
		//forward_c.do �������� ����� �����ִ� ������
		@GetMapping("/day0610/forward_c.do")
		public String useForwardC(String year, String month, Model model) {
			
			System.out.println(year+" / "+month+" / "+model.getAttribute("id"));
			
			return "day0610/forward_result";
		}
}
