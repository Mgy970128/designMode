package top.mgy.designMode.factoryPattern;

/**
 * 除法类  继承运算类
 */
public class OperationDiv extends Operation{

    @Override
    public Double getResult() {

        if(getNumberB() == 0){
            throw new ArithmeticException("除数不能为0！");
        }

        return getNumberA() / getNumberB();
    }
}
