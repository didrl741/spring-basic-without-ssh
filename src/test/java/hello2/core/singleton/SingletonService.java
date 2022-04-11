package hello2.core.singleton;

public class SingletonService {

    // static 영역에 객체 딱 1개 생성해둔다
    private static final SingletonService instance = new SingletonService();

    // 조회만 허용
    public static SingletonService getInstance() {
        return instance;
    }

    // 생성자 private선언 -> 외부에서 new로 객체 생성 불가.
    private SingletonService(){}

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출!");
    }
}
