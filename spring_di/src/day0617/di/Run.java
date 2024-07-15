package day0617.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * spring container�� ����Ͽ� ������ ���Թ��� ��ü�� �� ����ϴ� Ŭ����.
 * 
 * @author user
 *
 */
public class Run {

    public static void main(String[] args) {
        // 1.spring container����
        // ApplicationContext ac =
        // new ClassPathXmlApplicationContext("day0617/di/applicationContext.xml");
        ApplicationContext ac = new FileSystemXmlApplicationContext(
                "C:/dev/workspace_spring/spring_di/src/day0617/di/applicationContext.xml");
        // 2.������ ���Թ��� ��ü�� ���.
        Service service = ac.getBean("service", ServiceImpl.class);
        // 3.���
        service.addName("�����");
        System.out.println(service.searchName());

        Service service2 = ac.getBean("service2", ServiceImpl.class);
        service2.addName("������");
        System.out.println(service2.searchName());
        // 4. spring container����
        // ((ClassPathXmlApplicationContext) ac).close();
        ((FileSystemXmlApplicationContext) ac).close();
    }// main

}
