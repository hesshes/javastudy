package javastudy.d.module;

//06 이넘 활용
public enum EnumSingleTon {
    INSTANCE;

    private final Client dbClient;

    EnumSingleTon() {
        dbClient = Database.getClient();
    }

    public static EnumSingleTon getInstance() {
        return INSTANCE;
    }

    public Client getClient() {
        return dbClient;
    }

}

/*
 * [Enum 이용]
 * 
 * 권장되는 두가지 방법중 하나 enum은 애초에 멤버를 만들때 private로 만들고 한번만 초기화 하기 때문에 thread safe함.
 * enum 내에서 상수 뿐만 아니라, 변수나 메서드를 선언해 사용이 가능하기 때문에, 이를 이용해 싱글톤 클래스 처럼 응용이 가능 위의
 * Bill Pugh Solution 기법과 달리, 클라이언트에서 Reflection을 통한 공격에도 안전 하지만 만일 싱글톤 클래스를
 * 멀티톤(일반적인 클래스)로 마이그레이션 해야할때 처음부터 코드를 다시 짜야 되는 단점이 존재한다. (개발 스펙은 언제어디서 변경 될수 있기
 * 때문에) 클래스 상속이 필요할때, enum 외의 클래스 상속은 불가능하다. 출처:
 * https://inpa.tistory.com/entry/GOF -싱글톤Singleton-패턴-꼼꼼하게-알아보자
 */