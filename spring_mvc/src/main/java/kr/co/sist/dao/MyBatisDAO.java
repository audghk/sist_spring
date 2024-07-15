package kr.co.sist.dao;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyBatisDAO {
  //private static MyBatisDAO mbDAO;
  private static SqlSessionFactory ssf;// singleton ������ => �������, �ϰ��� ����, ��������

  private MyBatisDAO() {
    org.apache.ibatis.logging.LogFactory.useLog4J2Logging();
  }

//  public static MyBatisDAO getInstance() {
//    if (mbDAO == null) {
//      mbDAO = new MyBatisDAO();
//    }
//    return mbDAO;
//  }// getInstance

  /**
   * SqlSessionFactory�� �������, �ϰ��� ����, ������ ���̼��� ���ؼ� Singleton Pattern���� ���.
   * 
   * @return SqlSessionFactory
   */
  // private static SqlSessionFactory getSessionFactory() {
  static {// static ���� : ȣ������ �ʰ� Ŭ������ �����Ǹ� �ڵ� ȣ��Ǵ� ����.
      org.apache.ibatis.logging.LogFactory.useLog4J2Logging();
    if (ssf == null) {
      try {
        // 1. �������ϰ� ����
        Reader reader = Resources.getResourceAsReader("kr/co/sist/dao/mybatis-config.xml");
        // 2. MyBatis Framework ����
        ssf = new SqlSessionFactoryBuilder().build(reader);
        // 3. stream �ݱ�
        if (reader != null) {
          reader.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    // return ssf;
  }// getSessionFactory

  public SqlSession getMyBatisHandler(boolean autoCommit) {
    // SqlSession ss=null;
    // ss=ssf.openSession(autoCommit);// => ss=getSessionFactory().openSession(autoCommit);
    return ssf.openSession(autoCommit);
  }

  public void closeHandler(SqlSession ss) {
    if (ss != null) {
      ss.close();
    }
  }// closeHandler

}// class
