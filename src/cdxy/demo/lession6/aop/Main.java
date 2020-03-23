package cdxy.demo.lession6.aop;

public class Main {
    public static void main(String[] args) {
        CalculatorImpl calculatorImpl = new CalculatorImpl();
        ICalculator calculator = (ICalculator) new CalculatorLoggingProxyImpl(calculatorImpl).getProxy();
        calculator.mul(1,2);
    }
}
