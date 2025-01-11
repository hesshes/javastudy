package javastudy.p.module.proxy;

public class Proxy implements IProxySubject {
    private ProxyRealSubject realSubject;

    public Proxy(ProxyRealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void action() {
        realSubject.action();
        System.out.println("proxy object action");
    }
}
