package javastudy.e;

import java.util.Arrays;

import javastudy.e.module.EnumWeek;

public class ExcuteEnum {
    public static void main(String[] args) {
        EnumWeek w1 = EnumWeek.FRIDAY;
        EnumWeek w2 = EnumWeek.SATURDAY;
        EnumWeek w3 = EnumWeek.valueOf("MONDAY");
        EnumWeek[] w4 = EnumWeek.values();
        String wn = w1.name();
        int wo = w1.ordinal();
        int wc = w1.compareTo(w2);

        System.out.println(wn);
        System.out.println(wo);
        System.out.println(wc);
        System.out.println(w3);
        System.out.println(Arrays.deepToString(w4));
        for (EnumWeek t : EnumWeek.values()) {
            System.out.println(t);
        }
    }

}
