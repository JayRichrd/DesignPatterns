package jv.com.tencent.cain.design_pattern.factory_method;

import jv.com.tencent.cain.design_pattern.simple_factory.DivOperation;
import jv.com.tencent.cain.design_pattern.simple_factory.Operation;

/**
 * @author cainjiang
 * @date 2019-05-20
 */
public class DividFactory implements IOperationFactory {
    @Override
    public Operation createOpration() {
        DivOperation divOperation = new DivOperation();
        divOperation.operationSymbol = "/";
        divOperation.operationName = "除法";
        return divOperation;
    }

    @Override
    public String getOperationSymbol() {
        return "/";
    }

    @Override
    public String getOperationName() {
        return "除法";
    }
}
