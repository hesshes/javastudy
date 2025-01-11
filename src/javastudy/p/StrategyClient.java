package javastudy.p;

import javastudy.p.module.strategy.StrategyConcreteA;
import javastudy.p.module.strategy.StrategyConcreteB;
import javastudy.p.module.strategy.StrategyContext;

public class StrategyClient {
    public static void main(String[] args) {
        StrategyContext ctx = new StrategyContext();

        System.out.println("====== �������� A ���� =======");
        ctx.setStrategy(new StrategyConcreteA());
        ctx.doSomething();

        System.out.println("====== �������� B ���� =======");
        ctx.setStrategy(new StrategyConcreteB());
        ctx.doSomething();
    }

}
