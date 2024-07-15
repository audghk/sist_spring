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
        System.out.println("정수 생성자");
    }
    
    public InjectionTest(String name) {
        super();
        this.name = name;
        System.out.println("문자열 생성자");
    }

    public InjectionTest(List<String> list) {
        super();
        this.list = list;
        System.out.println("List의존성 주입 생성자");
    }

    public InjectionTest(Map<String, String> map) {
        super();
        this.map = map;
        System.out.println("Map의존성 주입 생성자");
    }
    
    
}
