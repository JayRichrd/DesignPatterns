package jv.com.tencent.cain.design_pattern.simple_factory;

/**
 * @author cainjiang
 * @date 2019-02-21
 * 加法操作类
 */
public class AddOperation extends Operation {

    @Override
    double getResult() {
        return numA + numA;
    }
}
