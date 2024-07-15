package day0617.di;

import java.sql.SQLException;
import java.util.List;

/**
 * ���������� �����ϴ� Ŭ���� : DB�� ����ϴ� ������ �׷��� ���� ���� ����
 * 
 * @author user
 */
public class ServiceImpl implements Service {

    private DAO dao; // ������ ������ �޾Ƽ� ������ ��ü

    public ServiceImpl() {//�θ� ������ : ��� �ڽ��� �Է��� �� �ִ�.
        System.out.println("ServiceImpl �⺻ ������");
    }
    
    public ServiceImpl(DAO dao) { // �θ� ������ ��� �ڽ��� �Է��� �� �ִ�.
        this.dao = dao;
        System.out.println("ServiceImpl �Ű����� ������");
    }
    
    public void setDao(DAO dao) {
        this.dao = dao;
        System.out.println("setDao method");
    }
    
    @Override
    public void addName(String name) {
        try {
            dao.insertName(name); // dao�� ����ϸ� �Է¹��� �ڽ��� method�� ȣ�� (��ü ������- )
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
