package day0620;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ���������� �����ϴ� Ŭ���� : DB�� ����ϴ� ������ �׷��� ���� ���� ����
 * 
 * @author user
 */
@Component
public class ServiceImpl {
    
      //field injection
//    @Autowired(required = false)
    private OracleDAO dao; // ������ ������ �޾Ƽ� ������ ��ü

    public ServiceImpl() {//�θ� ������ : ��� �ڽ��� �Է��� �� �ִ�.
        System.out.println("ServiceImpl �⺻ ������");
    }
    
    //Constructor Injection
//    @Autowired(required = false)
    public ServiceImpl(OracleDAO dao) { // �θ� ������ ��� �ڽ��� �Է��� �� �ִ�.
        this.dao = dao;
        System.out.println("ServiceImpl �Ű����� ������");
    }
    
    @Autowired(required = false)
    public void setDao(OracleDAO dao) {
        this.dao = dao;
        System.out.println("setDao method");
    }
    
    public void addName(String name) {
        try {
            dao.insertName(name); // dao�� ����ϸ� �Է¹��� �ڽ��� method�� ȣ�� (��ü ������- )
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
