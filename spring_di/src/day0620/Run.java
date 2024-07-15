package day0620;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {
        
        //1. Spring Container ���� (annotation ������ ����)
        ApplicationContext ac=new ClassPathXmlApplicationContext("day0618/applicationContext3.xml");
        
        //2. bean ��� (������ ���Թ��� Ŭ����)
        ServiceImpl si=ac.getBean(ServiceImpl.class);
        
        //3. bean ���
        si.addName("�ڽ���");
        
        //4. Spring Container �ݱ�
        ((ClassPathXmlApplicationContext)ac).close();
    }

}
