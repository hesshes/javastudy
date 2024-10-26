package javastudy.d;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javastudy.d.module.LazySingleTon;

public class Execute {
    public static void main(String[] args) {
        // 1. 싱글톤 객체를 담을 배열
        LazySingleTon[] singleton = new LazySingleTon[10];

        // 2. 스레드 풀 생성
        ExecutorService service = Executors.newCachedThreadPool();

        // 3. 반복문을 통해 10개의 스레드가 동시에 인스턴스 생성
        for (int i = 0; i < 10; i++) {
            final int num = i;
            service.submit(() -> {
                singleton[num] = LazySingleTon.getInstance();
            });
        }

        // 4. 종료
        service.shutdown();

        // 5. 싱글톤 객체 주소 출력
        for (LazySingleTon s : singleton) {
            System.out.println(s.toString());
        }
    }
}
