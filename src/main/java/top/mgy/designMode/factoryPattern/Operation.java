package top.mgy.designMode.factoryPattern;

/**
 * 运算类  基类
 */
public abstract class Operation {

    private Double numberA = 0.0;
    private Double numberB = 0.0;


    public Double getNumberA() {
        return numberA;
    }

    public void setNumberA(Double numberA) {
        this.numberA = numberA;
    }

    public Double getNumberB() {
        return numberB;
    }

    public void setNumberB(Double numberB) {
        this.numberB = numberB;
    }

    public Double getResult(){

        Double result = 0.0;
        return result;
    }
}
