package jv.com.tencent.cain.design_pattern.simple_factory;

/**
 * @author cainjiang
 * @date 2019-02-21
 * 减法操作类
 */
public class SubOperation extends Operation {
    @Override
    protected double getResult() {
        return numA - numB;
    }
}
