package jv.com.tencent.cain.design_pattern.simple_factory;

/**
 * @author cainjiang
 * @date 2019-02-21
 * 操作的基类
 */
abstract public class Operation {
    /**
     * 操作数a
     */
    public double numA;
    /**
     * 操作数b
     */
    public double numB;

    public double getNumA() {
        return numA;
    }

    public double getNumB() {
        return numB;
    }

    /**
     * 获取操作结果
     *
     * @return
     */
    protected abstract double getResult();
}
