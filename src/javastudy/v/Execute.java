package javastudy.v;

import java.util.Arrays;

import javastudy.v.module.VarAgrs;

public class Execute {
    public static void main(String[] args) {
        print(1, true, "ABC", "EFG", "WXY");
        String[] s = VarAgrs.pick("1", "2", "3");
        // Object[] Ÿ���� String[] Ÿ������ �ٿ�ĳ������ �Ұ���
    }

    public static void print(int num, boolean bool, String... str) {
        System.out.println("number : " + num);
        System.out.println("bool : " + bool);
        System.out.println("rest parameters : " + Arrays.toString(str));
    }
    
    
}
