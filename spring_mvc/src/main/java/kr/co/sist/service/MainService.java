package kr.co.sist.service;

import java.util.ArrayList;
import java.util.List;

public class MainService {

	public List<String> qna(){
		List<String> list=new ArrayList<String>();
		list.add("���̻��� �ڼ��� ������");
		list.add("�����Ѵ�");
		return list;
	}
	
	public List<String> prdList(){
		List<String> list=new ArrayList<String>();
		list.add("�Ｚ ��Ʈ��");
		list.add("���� ��Ʈ��");
		list.add("�ƺ�");
		list.add("�����");
		return list;
	}
}
