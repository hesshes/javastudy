package javastudy.p.module.proxy;

public class ProtectedProxy implements IProxySubject {

    private ProxyRealSubject realSubject;
    protected boolean access;

    public ProtectedProxy(ProxyRealSubject realSubject, boolean access) {
        this.realSubject = realSubject;
        this.access = access;
    }

    public void action() {
        if(access) {
            realSubject.action();
            System.out.println("ProtectedProxy Object Action");
        }
    }

}
