package javastudy.r.module;

public class ReflectionParent {
    private String str1 = "1";
    private String str2 = "2";

    public ReflectionParent() {

    }

    private void method1() {
        System.out.println("method1");
    }

    private void method2(int n) {
        System.out.println("method2: " + n);
    }

    private void method3() {
        System.out.println("method3");
    }
}
