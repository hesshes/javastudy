package javastudy.p;

import javastudy.p.module.StrategyConcreteA;
import javastudy.p.module.StrategyConcreteB;
import javastudy.p.module.StrategyContext;

public class StrategyClient {
    public static void main(String[] args) {
        StrategyContext ctx = new StrategyContext();

        System.out.println("====== 전략패턴 A 세팅 =======");
        ctx.setStrategy(new StrategyConcreteA());
        ctx.doSomething();

        System.out.println("====== 전략패턴 B 세팅 =======");
        ctx.setStrategy(new StrategyConcreteB());
        ctx.doSomething();
    }

}
