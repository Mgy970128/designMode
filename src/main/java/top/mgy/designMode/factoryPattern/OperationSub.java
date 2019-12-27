package top.mgy.designMode.factoryPattern;

/**
 * 减法类  继承运算类
 */
public class OperationSub extends Operation {

    @Override
    public Double getResult() {

        return getNumberA() - getNumberB();
    }
}
