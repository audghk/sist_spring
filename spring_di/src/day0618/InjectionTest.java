package day0618;

import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class InjectionTest {
    private int year;
    private String name;
    
    private List<String> list;
    private Map<String, String> map;
    
    public InjectionTest(int year) {
        super();
        this.year = year;
        System.out.println("���� ������");
    }
    
    public InjectionTest(String name) {
        super();
        this.name = name;
        System.out.println("���ڿ� ������");
    }

    public InjectionTest(List<String> list) {
        super();
        this.list = list;
        System.out.println("List������ ���� ������");
    }

    public InjectionTest(Map<String, String> map) {
        super();
        this.map = map;
        System.out.println("Map������ ���� ������");
    }
    
    
}
