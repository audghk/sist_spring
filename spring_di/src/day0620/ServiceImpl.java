package day0620;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 업무로직을 구현하는 클래스 : DB를 사용하는 업무와 그렇지 않은 업무 구현
 * 
 * @author user
 */
@Component
public class ServiceImpl {
    
      //field injection
//    @Autowired(required = false)
    private OracleDAO dao; // 의존성 주입을 받아서 저장할 객체

    public ServiceImpl() {//부모를 받으면 : 모든 자식을 입력할 수 있다.
        System.out.println("ServiceImpl 기본 생성자");
    }
    
    //Constructor Injection
//    @Autowired(required = false)
    public ServiceImpl(OracleDAO dao) { // 부모를 받으면 모든 자식을 입력할 수 있다.
        this.dao = dao;
        System.out.println("ServiceImpl 매개변수 생성자");
    }
    
    @Autowired(required = false)
    public void setDao(OracleDAO dao) {
        this.dao = dao;
        System.out.println("setDao method");
    }
    
    public void addName(String name) {
        try {
            dao.insertName(name); // dao를 사용하면 입력받은 자식의 method를 호출 (객체 다형성- )
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> searchName() {
        List<String> list = null;
        try {
            list = dao.selectNames();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
