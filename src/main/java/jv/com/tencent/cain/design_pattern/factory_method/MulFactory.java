package jv.com.tencent.cain.design_pattern.factory_method;

import jv.com.tencent.cain.design_pattern.simple_factory.MulOperation;
import jv.com.tencent.cain.design_pattern.simple_factory.Operation;

/**
 * @author cainjiang
 * @date 2019-05-20
 */
public class MulFactory implements IOperationFactory {
    @Override
    public Operation createOpration() {
        MulOperation mulOperation = new MulOperation();
        mulOperation.operationSymbol = "*";
        mulOperation.operationName = "乘法";
        return mulOperation;
    }

    @Override
    public String getOperationSymbol() {
        return "*";
    }

    @Override
    public String getOperationName() {
        return "乘法";
    }
}
