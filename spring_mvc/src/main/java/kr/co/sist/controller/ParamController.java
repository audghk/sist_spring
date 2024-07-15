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

	//��û URI�� JSP���� ���ٸ� ��ȯ���� void�� �ᵵ�� �ٵ� ������ ���� ����
	//@GetMapping("/day0604/param_frm.do")
	//public void paramFrm() {
	//	
	//}
	@GetMapping("/day0604/param_frm.do")
	public String paramFrm() {
		return "day0604/param_frm";//WEB-INF/views/day0604/param_frm.jsp
	}
	
	/**
	 * HTML Form Control�� name �Ӽ��� �̸��� method�� parameter���� ���ƾ��Ѵ�.
	 * String�� �ƴ� ��쿡 Framework���� ���������� ��ȯ���ش�.(int -> Integer.parseInt)
	 * ���� : VO�� �ȸ��� ��
	 * ���� : ���� �����ϱⰡ �����ϴ�. �ڵ尡 �������ϴ�.
	 * @return
	 */
	@GetMapping("/day0604/get_single_param.do")
	public String singleDataType(@RequestParam(name="name") String name2, @RequestParam(defaultValue="0") int age, String email, Model model) {//int�� null X, String�� null ���尡��! parameter�� null�� ��Ȳ���� 0�� ��
		model.addAttribute("msg","GET����� ��û");
		System.out.println("GET��� : "+name2+" "+age+" "+email);//web parameter�� ��ȿ������, Service��ü�� ����, ����������ü ����
		return "day0604/single_param";
	}//singleDataType
	@PostMapping("/day0604/post_single_param.do")
	public String postSingleDataType(HttpServletRequest request, String name, int age, String email, Model model) throws UnsupportedEncodingException {
		
		model.addAttribute("msg","POST����� ��û");
		System.out.println("POST��� : "+name+" "+age+" "+email);//web parameter�� ��ȿ������, Service��ü�� ����, ����������ü ����
		//POST����� �� Filter�� ������� ������ ������ �ѱ��� encoding�Ͽ� ����Ѵ�.
		//System.out.println(new String(name.getBytes("8859_1"),"UTF-8"));
		//System.out.println(URLDecoder.decode(URLEncoder.encode(name,"8859_1"),"UTF-8"));
		return "day0604/single_param";
	}//postSingleDataType
	
	@GetMapping("/day0605/get_vo_param.do")
	public String voParam(ParamVO pVO, Model model) {
		model.addAttribute("msg","GET����� VO�� ����� ��û �� ó��");
		return "day0604/single_param";
	}//voParam
	@PostMapping("/day0605/post_vo_param.do")
	public String postVoParam(ParamVO pVO, Model model) {
		System.out.println(pVO);
		model.addAttribute("msg","POST����� VO�� ����� ��û �� ó��");
		return "day0604/single_param";
	}//postVoParam
	
	@GetMapping("/day0605/get_hsr_param.do")
	public String hsrParam(HttpServletRequest request) {
		request.setAttribute("msg","HttpServletRequest�� ����� GET ��û �� ó��");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		System.out.println(name+" / "+age);
		
		//�������� ������ ���� �� �ִ�.
		System.out.println("������ IP : "+request.getRemoteAddr()+"/������ port : "+
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
		System.out.println("�� �������� ��û�� URL : "+referer);
		
		return "day0604/single_param";
	}//hsrParam
	
	@PostMapping("/day0605/post_hsr_param.do")
	public String postHsrParam(HttpServletRequest request) {
		request.setAttribute("msg","HttpServletRequest�� ����� POST ��û �� ó��");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		System.out.println(name+" / "+age);
		
		//�������� ������ ���� �� �ִ�.
		System.out.println("������ IP : "+request.getRemoteAddr()+"/������ port : "+
		request.getRemotePort());
		
		String referer=request.getHeader("referer");
		String accept_language=request.getHeader("accept-language");
		System.out.println("�� �������� ��û�� URL : "+referer);
		System.out.println("�� �������� ��û�� lang : "+accept_language);
		if(!accept_language.contains("ko-KR")) {
			System.out.println("�ѱ��� �ƴ�.");
		}
		
		return "day0604/single_param";
	}//postHsrParam
	
	@GetMapping("/day0605/get_btn_rp.do")
	public String useRequestParam(@RequestParam(name="name", required=false, defaultValue = "������") String myName,
			@RequestParam(defaultValue = "0") int age, Model model) {
		model.addAttribute("msg","RequestParam���");
		System.out.println("�̸� : "+myName+", ���� : "+age);
		
		return "day0604/single_param";
	}
	
	@GetMapping("/day0605/get_btn_rp_vo.do")
	public String useRequestParamVO(ParamVO pVO, Model model) {
		model.addAttribute("msg","RequestParam VO���");
		System.out.println("---------"+pVO);
		
		return "day0604/single_param";
	}
}
