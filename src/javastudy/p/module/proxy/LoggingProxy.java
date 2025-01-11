package javastudy.p.module.proxy;

public class LoggingProxy implements IProxySubject {

    private IProxySubject realSubject;

    public LoggingProxy(IProxySubject realSubject) {
        this.realSubject = realSubject;
    }

    public void action() {
        System.out.println("Logging......");
        realSubject.action();

        System.out.println("LoggingProxy Object Action");
        System.out.println("logging......");

    }

}
