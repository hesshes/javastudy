package javastudy.p.module.proxy;

public class VirtualProxy implements IProxySubject {

    private ProxyRealSubject realSubject;

    public VirtualProxy() {
    };

    public void action() {
        if (realSubject == null) {
            realSubject = new ProxyRealSubject();
        }
        realSubject.action();
        System.out.println("VirtualProxy  Object Action");
    }
}
