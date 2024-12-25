package javastudy.e.module;

public enum EnumOperation {
    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTI("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };

    // Ŭ���� �����ڿ� ���
    private final String symbol;

    EnumOperation(String symbol) {
        this.symbol = symbol;
    }

    // toString�� �������Ͽ� ���� ��ü�� ���ε� ���ڿ��� ��ȯ�ϵ���
    @Override
    public String toString() {
        return symbol;
    }

    // ���� ��ü�� �޼ҵ忡 ���� �߻� �޼ҵ� ����
    public abstract double apply(double x, double y);
}
