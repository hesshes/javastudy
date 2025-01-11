package javastudy.p.module.strategy;

public class StrategyContext {
    IStrategyPattern strategy;

    public void setStrategy(IStrategyPattern strategy) {
        this.strategy = strategy;
    }
    
    public void doSomething() {
        this.strategy.doSomething();
    }
}
