package jv.com.tencent.cain.design_pattern.factory_method;

import jv.com.tencent.cain.design_pattern.simple_factory.Operation;

/**
 * @author cainjiang
 * @date 2019-05-20
 */
public interface IOperationFactory {
    /**
     * 创建具体的操作方法实例
     *
     * @return
     */
    public Operation createOpration();

    /**
     * 返回运算的符号
     *
     * @return
     */
    String getOperationSymbol();

    /**
     * 返回运算的名字
     *
     * @return
     */
    String getOperationName();

}
