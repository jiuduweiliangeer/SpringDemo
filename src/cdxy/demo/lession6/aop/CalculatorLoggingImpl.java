package cdxy.demo.lession6.aop;

public class CalculatorLoggingImpl implements ICalculator {
    @Override
    public int add(int i, int j) {
        System.out.println("The method add begin with arguments["+i+","+j+"]");
        int result = i+j;
        System.out.println("The method add end with result:"+result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("The method sub begin with arguments["+i+","+j+"]");
        int result = i-j;
        System.out.println("The method sub end with result:"+result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("The method mul begin with arguments["+i+","+j+"]");
        int result = i*j;
        System.out.println("The method mul end with result:"+result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("The method div begin with arguments["+i+","+j+"]");
        int result = i/j;
        System.out.println("The method div end with result:"+result);
        return result;
    }
}
