package day0618;

import java.sql.SQLException;
import java.util.List;
import day0617.di.DAO;
import day0617.di.Service;
import lombok.Setter;

/**
 * singleton pattern이 적용된 클래스
 * @author user
 *
 */
public class SingletonServiceImpl implements Service {
    
    @Setter
    private DAO dao;
    
    private static SingletonServiceImpl ssi;
    
    private SingletonServiceImpl() {
        System.out.println("SingletonServiceImpl의 private 생성자");
    }

    public static SingletonServiceImpl getInstance() {
        if(ssi==null) {
            ssi=new SingletonServiceImpl();
        }
        System.out.println("singleton getInstance");
        return ssi;
    }
    
    @Override
    public void addName(String name) {
        try {
            dao.insertName(name);
        }catch(SQLException se) {
            se.printStackTrace();
        }
    }

    @Override
    public List<String> searchName() {
        List<String> list=null;
        
        try {
            list=dao.selectNames();
        }catch(SQLException se) {
            se.printStackTrace();
        }
        
        return list;
    }

}
