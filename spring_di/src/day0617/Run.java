package day0617;

/**
 * ������ ���Թ��� ��ü�� �� ����ϴ� Ŭ����
 * 
 * @author user
 *
 */
public class Run {

    public static void main(String[] args) {
        Assembly as = new Assembly();
        Service service = as.getBean();

        service.addName("�ڽ���");
        System.out.println(service.searchName());
    }

}
