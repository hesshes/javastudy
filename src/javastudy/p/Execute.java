package javastudy.p;

import javastudy.p.module.strategy.PolymorphismChildren;
import javastudy.p.module.strategy.PolymorphismParent;

public class Execute {
    public static void main(String[] args) {
          
        PolymorphismParent tv = new PolymorphismChildren();
        tv.powerOn_Off();
        tv.channelOn_Off();
        
        //PolymorphismChildren tv = new PolymorphismParent(); // ������ ����
        
        /*
         * ������ ���� ����
         * �ڽ� Ŭ������ �ν��Ͻ��� �����Ͽ� �θ� Ŭ������ ��ü(�޸𸮰���)�� ����(����)�ϴ� ���� �����ϳ�
         * �θ� Ŭ������ �ν��Ͻ��� �����Ͽ� �ڽ� Ŭ������ ��ü(�޸𸮰���)�� ����(����)�ϴ� ���� �Ұ���
         * 
         * [���� �ٽ� �����ؾ� ��]
         * C/C++�� �������� ���� �� Ŭ������ �� �޸� ���� �Ҵ�� 
         * ���ǵ� Ŭ������� �޸� �Ҵ��� �ϰ� �Ǵµ� 
         * 1. �θ� Ŭ������ �޸� ������ �ν��Ͻ��� ������ �ڽ� Ŭ������ ��ü�� �޸𸮸� ���� �� ����
         * 2. �ڽ� Ŭ������ �޸� ������ �ν��Ͻ��� ������ �θ� Ŭ������ ��ü�� �޸𸮸� ���� �� ����
         * ����, 1�� ���� �ٿ� ĳ������ ����� ��
         * 
         * */

    }

}
