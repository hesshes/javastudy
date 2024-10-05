package javastudy.d;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javastudy.d.module.LazySingleTone;

public class Execute {
    public static void main(String[] args) {
        // 1. �̱��� ��ü�� ���� �迭
        LazySingleTone[] singleton = new LazySingleTone[10];

        // 2. ������ Ǯ ����
        ExecutorService service = Executors.newCachedThreadPool();

        // 3. �ݺ����� ���� 10���� �����尡 ���ÿ� �ν��Ͻ� ����
        for (int i = 0; i < 10; i++) {
            final int num = i;
            service.submit(() -> {
                singleton[num] = LazySingleTone.getInstance();
            });
        }

        // 4. ����
        service.shutdown();

        // 5. �̱��� ��ü �ּ� ���
        for (LazySingleTone s : singleton) {
            System.out.println(s.toString());
        }
    }
}
