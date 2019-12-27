package top.mgy.designMode.factoryPattern;

/**
 * 加法类  继承运算类
 */
public class OperationAdd extends Operation{


    @Override
    public Double getResult() {
       return  getNumberA() + getNumberB();
    }
}
