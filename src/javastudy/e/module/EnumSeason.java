package javastudy.e.module;

public enum EnumSeason {
    SPRING("��"), SUMMER("����"), FALL("����"), WINTER("�ܿ�");

    // ���ڿ��� ������ �ʵ�
    private String enumSeason;

    // ������ (�̱���)
    private EnumSeason(String season) {
        this.enumSeason = season;
    }

    // Getter
    public String getEnumSeason() {
        return this.enumSeason;
    }
}
