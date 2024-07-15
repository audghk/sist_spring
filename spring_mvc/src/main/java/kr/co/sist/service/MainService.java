package kr.co.sist.service;

import java.util.ArrayList;
import java.util.List;

public class MainService {

	public List<String> qna(){
		List<String> list=new ArrayList<String>();
		list.add("´õÀÌ»óÀÇ ÀÚ¼¼ÇÑ ¼³¸íÀº");
		list.add("»ı·«ÇÑ´Ù");
		return list;
	}
	
	public List<String> prdList(){
		List<String> list=new ArrayList<String>();
		list.add("»ï¼º ³ëÆ®ºÏ");
		list.add("¿¤Áö ³ëÆ®ºÏ");
		list.add("¸ÆºÏ");
		list.add("·¹³ë¹ö");
		return list;
	}
}
