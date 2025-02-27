package day0617.di;

import java.sql.SQLException;
import java.util.List;

/**
 * DBMS업무에 대한 목록만 기술
 * 
 * @author user
 */
public interface DAO {
    public void insertName(String name) throws SQLException;

    public List<String> selectNames() throws SQLException;
}
