package top.mgy.designMode.factoryPattern;


/**
 * 简单运算工厂类
 */
public class OperationFactory {



    public static Operation createOperation(char operate){

        Operation  operation = null;

        switch (operate){
            case '+':
                operation = new OperationAdd();
                break;
            case '-':
                operation = new OperationSub();
                break;
            case '*':
                operation = new OperationMul();
                break;
            case '/':
                operation = new OperationDiv();
                break;
        }

        return operation;
    }
}
