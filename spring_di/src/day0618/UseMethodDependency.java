package day0618;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import day0617.di.Service;
import day0617.di.ServiceImpl;

public class UseMethodDependency {

    public static void main(String[] args) {
        // 1. spring container ����(ApplicationContext)
        ApplicationContext ac=new ClassPathXmlApplicationContext("day0618/applicationContext2.xml");
        // 2. ������ ���� ���� ��ü (bean) ���
        Service service=ac.getBean(ServiceImpl.class);
        // 3. ���
        service.addName("�����");
        // 4. Spring container �ݱ�
        
        System.out.println("-------------------");
        //1. Spring container ����
        //2. Bean ���
        Service si2=ac.getBean(SingletonServiceImpl.class);
        //3. ���
        si2.addName("������");
        //4. Spring container �ݱ�
        ((ClassPathXmlApplicationContext)ac).close();
        
    }// main
    

}
