package javastudy.d;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javastudy.d.module.LazySingleTon;

public class Execute {
    public static void main(String[] args) {
        // 1. �̱��� ��ü�� ���� �迭
        LazySingleTon[] singleton = new LazySingleTon[10];

        // 2. ������ Ǯ ����
        ExecutorService service = Executors.newCachedThreadPool();

        // 3. �ݺ����� ���� 10���� �����尡 ���ÿ� �ν��Ͻ� ����
        for (int i = 0; i < 10; i++) {
            final int num = i;
            service.submit(() -> {
                singleton[num] = LazySingleTon.getInstance();
            });
        }

        // 4. ����
        service.shutdown();

        // 5. �̱��� ��ü �ּ� ���
        for (LazySingleTon s : singleton) {
            System.out.println(s.toString());
        }
    }
}
