package top.mgy.designMode.factoryPattern;

/**
 * 场景：设计一个合理、可扩展的、业务渲染相分离的计算器  并实现+、-、*、/功能
 *
 * 拓展：
 *      要求在不改变其他计算类的情况下，新增一个开平方功能
 *
 * 使用的设计模式：工厂模式
 */
public class CalculatorClient {



    public static void main(String[] args) {
        /**
         * Test
         */
        // 加法
        Operation operation = OperationFactory.createOperation('+');
        operation.setNumberA(20.0);
        operation.setNumberB(17.2);
        System.out.println(operation.getResult());

        //减法
        Operation operation1 = OperationFactory.createOperation('-');
        operation1.setNumberA(56.0);
        operation1.setNumberB(16.0);
        System.out.println(operation1.getResult());

        //乘法
        Operation operation2 = OperationFactory.createOperation('*');
        operation2.setNumberA(3.2);
        operation2.setNumberB(5.6);
        System.out.println(operation2.getResult());

        //除法
        Operation operation3 = OperationFactory.createOperation('/');
        operation3.setNumberA(25.0);
        operation3.setNumberB(5.0);
        System.out.println(operation3.getResult());

    }


}
