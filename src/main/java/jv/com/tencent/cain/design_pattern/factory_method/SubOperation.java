package jv.com.tencent.cain.design_pattern.factory_method;

/**
 * @author cainjiang
 * @date 2019-02-21
 * 减法操作类
 */
public class SubOperation extends Operation {
    @Override
    public double getResult() {
        return numA - numB;
    }
}
