package javastudy.p.module;

public class StrategyContext {
    IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void doSomething() {
        this.strategy.doSomething();
    }
}
