package kr.co.sist.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.sist.VO.ParamVO;

@Controller
public class ParamController {

	//요청 URI와 JSP명이 같다면 반환형을 void로 써도됨 근데 권장은 안함 뭐야
	//@GetMapping("/day0604/param_frm.do")
	//public void paramFrm() {
	//	
	//}
	@GetMapping("/day0604/param_frm.do")
	public String paramFrm() {
		return "day0604/param_frm";//WEB-INF/views/day0604/param_frm.jsp
	}
	
	/**
	 * HTML Form Control의 name 속성에 이름과 method의 parameter명이 같아야한다.
	 * String이 아닌 경우에 Framework에서 동일형으로 변환해준다.(int -> Integer.parseInt)
	 * 장점 : VO를 안만들어도 됨
	 * 단접 : 값을 전달하기가 불편하다. 코드가 지저분하다.
	 * @return
	 */
	@GetMapping("/day0604/get_single_param.do")
	public String singleDataType(@RequestParam(name="name") String name2, @RequestParam(defaultValue="0") int age, String email, Model model) {//int는 null X, String은 null 저장가능! parameter가 null인 상황에서 0이 들어감
		model.addAttribute("msg","GET방식의 요청");
		System.out.println("GET방식 : "+name2+" "+age+" "+email);//web parameter의 유효성검증, Service객체로 전달, 관계유지객체 설정
		return "day0604/single_param";
	}//singleDataType
	@PostMapping("/day0604/post_single_param.do")
	public String postSingleDataType(HttpServletRequest request, String name, int age, String email, Model model) throws UnsupportedEncodingException {
		
		model.addAttribute("msg","POST방식의 요청");
		System.out.println("POST방식 : "+name+" "+age+" "+email);//web parameter의 유효성검증, Service객체로 전달, 관계유지객체 설정
		//POST방식일 때 Filter를 사용하지 않으면 각각의 한글을 encoding하여 사용한다.
		//System.out.println(new String(name.getBytes("8859_1"),"UTF-8"));
		//System.out.println(URLDecoder.decode(URLEncoder.encode(name,"8859_1"),"UTF-8"));
		return "day0604/single_param";
	}//postSingleDataType
	
	@GetMapping("/day0605/get_vo_param.do")
	public String voParam(ParamVO pVO, Model model) {
		model.addAttribute("msg","GET방식의 VO를 사용한 요청 값 처리");
		return "day0604/single_param";
	}//voParam
	@PostMapping("/day0605/post_vo_param.do")
	public String postVoParam(ParamVO pVO, Model model) {
		System.out.println(pVO);
		model.addAttribute("msg","POST방식의 VO를 사용한 요청 값 처리");
		return "day0604/single_param";
	}//postVoParam
	
	@GetMapping("/day0605/get_hsr_param.do")
	public String hsrParam(HttpServletRequest request) {
		request.setAttribute("msg","HttpServletRequest를 사용한 GET 요청 값 처리");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		System.out.println(name+" / "+age);
		
		//접속자의 정보를 얻을 수 있다.
		System.out.println("접속자 IP : "+request.getRemoteAddr()+"/접속자 port : "+
		request.getRemotePort());
		
		Enumeration<String> en=request.getHeaderNames();
		String headerName="";
		String referer="";
		while(en.hasMoreElements()) {
			headerName=en.nextElement();
			System.out.println(headerName+" : "+request.getHeader(headerName));
			if("referer".equals(headerName)) {
				referer=request.getHeader(headerName);
			}
		}
		System.out.println("이 페이지를 요청한 URL : "+referer);
		
		return "day0604/single_param";
	}//hsrParam
	
	@PostMapping("/day0605/post_hsr_param.do")
	public String postHsrParam(HttpServletRequest request) {
		request.setAttribute("msg","HttpServletRequest를 사용한 POST 요청 값 처리");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		System.out.println(name+" / "+age);
		
		//접속자의 정보를 얻을 수 있다.
		System.out.println("접속자 IP : "+request.getRemoteAddr()+"/접속자 port : "+
		request.getRemotePort());
		
		String referer=request.getHeader("referer");
		String accept_language=request.getHeader("accept-language");
		System.out.println("이 페이지를 요청한 URL : "+referer);
		System.out.println("이 페이지를 요청한 lang : "+accept_language);
		if(!accept_language.contains("ko-KR")) {
			System.out.println("한국이 아님.");
		}
		
		return "day0604/single_param";
	}//postHsrParam
	
	@GetMapping("/day0605/get_btn_rp.do")
	public String useRequestParam(@RequestParam(name="name", required=false, defaultValue = "윤웅찬") String myName,
			@RequestParam(defaultValue = "0") int age, Model model) {
		model.addAttribute("msg","RequestParam사용");
		System.out.println("이름 : "+myName+", 나이 : "+age);
		
		return "day0604/single_param";
	}
	
	@GetMapping("/day0605/get_btn_rp_vo.do")
	public String useRequestParamVO(ParamVO pVO, Model model) {
		model.addAttribute("msg","RequestParam VO사용");
		System.out.println("---------"+pVO);
		
		return "day0604/single_param";
	}
}
