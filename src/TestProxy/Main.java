package TestProxy;

public class Main {
    public static void main(String[] args) {
        Test test=new Test();
        TestInterface testInterface= (TestInterface) new ProxyTest(test).getProxy();
        testInterface.test();
    }
}
