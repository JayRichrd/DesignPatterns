package jv.com.tencent.cain.design_pattern.factory_method;

import jv.com.tencent.cain.design_pattern.simple_factory.AddOperation;
import jv.com.tencent.cain.design_pattern.simple_factory.Operation;

/**
 * @author cainjiang
 * @date 2019-05-20
 */
public class AddFactory implements IOperationFactory {
    @Override
    public Operation createOpration() {
        AddOperation addOperation = new AddOperation();
        addOperation.operationSymbol = "+";
        addOperation.operationName = "加法";
        return addOperation;
    }

    @Override
    public String getOperationSymbol() {
        return "+";
    }

    @Override
    public String getOperationName() {
        return "加法";
    }
}
