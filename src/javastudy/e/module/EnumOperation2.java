package javastudy.e.module;

//�Լ��� �������̽� ����Ʈ
import java.util.function.DoubleBinaryOperator;

public enum EnumOperation2 {
    PLUS("+", (x, y) -> x + y), MINUS("-", (x, y) -> x - y), TIMES("*", (x, y) -> x * y), DIVIDE("/", (x, y) -> x / y);

    private final DoubleBinaryOperator op; // ���ٽ��� ������ �ʵ�

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
