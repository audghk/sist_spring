package day0620;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * DBMS���� ��Ͽ� ���� �ڵ� ����
 * 
 * @author user
 */
@Component
public class OracleDAO {

    public OracleDAO() {
        System.out.println("Oracle DAO �⺻������");
    }

    public void insertName(String name) throws SQLException {
        System.out.println(name + "�� Oracle DBMS�� �߰��Ǿ����ϴ�.");

    }// insert

    public List<String> selectNames() throws SQLException {
        List<String> list = new ArrayList<String>();
        list.add("ȫ����");
        list.add("��̿�");
        list.add("����ȣ");
        list.add("�ڽ���");
        return list;
    }// selectNames

}// class
