package javastudy.e.module;

import java.util.Arrays;
import java.util.List;

public enum EnumCreditCard {

    SHINHAN("����", Arrays.asList("Mr.Life ī��", "Deep Dream ī��", "Deep Oil ī��")),
    KB("����", Arrays.asList("����D ī��", "ƼŸ�� ī��", "�ٴ� ī��")),
    NH("����", Arrays.asList("�ùٸ� FLEX ī��", "����ũ 5 ī��", "NH �ÿ� ����ī��"));

    private final String Enterprise;
    private final List<String> cards;

    EnumCreditCard(String name, List<String> cards) {
        this.Enterprise = name;
        this.cards = cards;
    }

    EnumCreditCard getCard(String cardName) throws Exception {
        return Arrays.stream(EnumCreditCard.values()).filter(enumCreditCard -> enumCreditCard.equals(cardName))
                .findFirst().orElseThrow(Exception::new);
    }
}
