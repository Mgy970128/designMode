package top.mgy.designMode.factoryPattern;

/**
 * 乘法类  继承运算类
 */
public class OperationMul extends Operation {

    @Override
    public Double getResult() {

        return getNumberA() * getNumberB();
    }
}
