package javastudy.e.module;

//함수형 인터페이스 임포트
import java.util.function.DoubleBinaryOperator;

public enum EnumOperation2 {
    PLUS("+", (x, y) -> x + y), MINUS("-", (x, y) -> x - y), TIMES("*", (x, y) -> x * y), DIVIDE("/", (x, y) -> x / y);

    private final DoubleBinaryOperator op; // 람다식을 저장할 필드

    private final String symbol;

    EnumOperation2(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    }
}
