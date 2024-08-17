package javastudy.g;

import javastudy.g.module.GCalc;
import javastudy.g.module.GFruitBox;
import javastudy.g.module.GFruitBox2;
import javastudy.g.module.GIFuncSample;
import javastudy.g.module.GISampleImpl;
import javastudy.g.module.GSample;

public class Execute {
    public static void main(String[] args) {
        // Generic Ŭ���� ��� ��
        GSample<Integer> s1 = new GSample<Integer>();
        s1.setValue(1);

        GSample<Double> s2 = new GSample<Double>();
        s2.setValue(1.0);

        GSample<String> s3 = new GSample<String>();
        s3.setValue("���ڿ�");

        // Generic �������̽� ��� ��
        GISampleImpl<String> giSample = new GISampleImpl<String>();

        giSample.addElement("this is string", 5);
        giSample.getElement(5);

        // Generic �Լ��� �������̽� ��� ��
        // Generic�� ���� �Լ��� Ÿ���� ����
        GIFuncSample<Integer> n = (x, y) -> x + y;

        int result = n.add(10, 20);
        System.out.println(result);

        // Generic �޼��� ȣ�� ����
        // �Լ�ȣ�� �ÿ� �Լ��� �տ� ���׸� Ÿ���� ��ġ
        GFruitBox.<Integer>addBoxStatic(1, 2);
        GFruitBox.<String>addBoxStatic("�ȳ�", "�߰�");

        // Generic �޼��� ȣ�� ����2
        // �����Ϸ��� ���׸� Ÿ�Կ� �� ������ Ÿ���� �޼ҵ��� �Ű������� ���� ������
        // �� �ֱ� ������, ��κ��� ��� ���׸� �޼����� Ÿ�� �Ķ���͸� �����ϰ� ȣ�� ����
        GFruitBox.addBoxStatic(1, 2);
        GFruitBox.addBoxStatic("�ȳ�", "�߰�");

        // Generic �޼��� ȣ�� ����3
        // �ν��Ͻ� �����ÿ� Ÿ�� �Ķ���͸� ����
        GFruitBox2<Integer, Long> box1 = new GFruitBox2<Integer, Long>();
        box1.printBox(1, 1);

        // Generic �޼��忡 �ٸ� Ÿ�� �Ķ���͸� �����ϸ� ���������� ����
        box1.<String, Double>printBox("hello", 5.55);
        // ���� ������ ���
        box1.printBox("hello", 5.55); 
        
        // Generic Ŭ���� ���� ���� ��
        GCalc<Number> cal1 = new GCalc<Number>();
        GCalc<Integer> cal2 = new GCalc<Integer>(); // ���� ����
        GCalc<Double> cal3 = new GCalc<Double>();   // ���� ����
        
        //GCalc<Number> cal1 = new GCalc<Number>();
        
    }

}
