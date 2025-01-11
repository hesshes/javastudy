/* 
 * https://inpa.tistory.com/entry/GOF-%F0%9F%92%A0-%ED%94%84%EB%A1%9D%EC%8B%9CProxy-%ED%8C%A8%ED%84%B4-%EC%A0%9C%EB%8C%80%EB%A1%9C-%EB%B0%B0%EC%9B%8C%EB%B3%B4%EC%9E%90#proxy_pattern
 */
package javastudy.p;

import javastudy.p.module.proxy.Proxy;
import javastudy.p.module.proxy.ProxyRealSubject;
import javastudy.p.module.proxy.VirtualProxy;
import javastudy.p.module.proxy.IProxySubject;
import javastudy.p.module.proxy.LoggingProxy;
import javastudy.p.module.proxy.ProtectedProxy;

public class ProxyClient {
    public static void main(String[] args) {
        IProxySubject sub = new Proxy(new ProxyRealSubject());
        sub.action();

        IProxySubject vsub = new VirtualProxy();
        vsub.action();
        
        IProxySubject psub = new ProtectedProxy(new ProxyRealSubject(), true);
        psub.action();
        
        IProxySubject lsub = new LoggingProxy(new ProxyRealSubject());
        lsub.action();
    }

}
