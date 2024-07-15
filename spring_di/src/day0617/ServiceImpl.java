package day0617;

import java.sql.SQLException;
import java.util.List;

/**
 * 업무로직을 구현하는 클래스 : DB를 사용하는 업무와 그렇지 않은 업무 구현
 * 
 * @author user
 */
public class ServiceImpl implements Service {

    private DAO dao; // 의존성 주입을 받아서 저장할 객체

    public ServiceImpl(DAO dao) { // 부모를 받으면 모든 자식을 입력할 수 있다.
        this.dao = dao;
    }

    @Override
    public void addName(String name) {
        try {
            dao.insertName(name); // dao를 사용하면 입력받은 자식의 method를 호출 (객체 다형성- )
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
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
