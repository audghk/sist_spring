package day0617.di;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * DBMS���� ��Ͽ� ���� �ڵ� ����
 * 
 * @author user
 */
public class MySqlDAO implements DAO {

    public MySqlDAO() {
        System.out.println("MySqlDAO�� ������");
    }

    @Override
    public void insertName(String name) throws SQLException {
        System.out.println(name + "�� Mysql DBMS�� �߰��Ǿ����ϴ�.");

    }// insert

    @Override
    public List<String> selectNames() throws SQLException {
        List<String> list = new ArrayList<String>();
        list.add("�赿��");
        list.add("�躴��");
        list.add("�ּ���");
        list.add("������");
        list.add("������");
        return list;
    }// selectNames

}// class
