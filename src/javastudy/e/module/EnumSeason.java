package javastudy.e.module;

public enum EnumSeason {
    SPRING("봄"), SUMMER("여름"), FALL("가을"), WINTER("겨울");

    // 문자열을 저장할 필드
    private String enumSeason;

    // 생성자 (싱글톤)
    private EnumSeason(String season) {
        this.enumSeason = season;
    }

    // Getter
    public String getEnumSeason() {
        return this.enumSeason;
    }
}
