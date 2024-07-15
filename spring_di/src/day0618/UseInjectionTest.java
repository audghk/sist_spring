package day0618;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseInjectionTest {
    
    public static void main(String[] args) {
        
        //1. Spring Container ����
        ApplicationContext ac=new ClassPathXmlApplicationContext("day0618/applicationContext2.xml");
        //2. bean ���
        InjectionTest it=ac.getBean("intInjection",InjectionTest.class);
        //3. ���
        System.out.println("����injection : "+it.getYear()+" / "+it.getName());
        //2. bean ���
        InjectionTest it2=ac.getBean("strInjection",InjectionTest.class);
        //3. ���
        System.out.println("���ڿ�injection : "+it2.getYear()+" / "+it2.getName());
        //2. bean ���
        InjectionTest it3=ac.getBean("listInjection",InjectionTest.class);
        //3. ���
        System.out.println("list injection : "+it3.getList());
        //2. bean ���
        InjectionTest it4=ac.getBean("mapInjection",InjectionTest.class);
        //3. ���
        System.out.println("map injection : "+it4.getMap());
        //4. Spring Container �ݱ�
        ((ClassPathXmlApplicationContext)ac).close();
        
    }
    
}
