package jv.com.tencent.cain.design_pattern.strategy;

/**
 * @author : jiangyu
 * @date : 2019-03-30
 * @desc : xxx
 */
public abstract class AbstractCashier {

    /**
     * 结账算法
     */
    enum CashierStrategy {
        CASHIER_DISCOUNT("打折促销", "打折策略"),
        CASHIER_MONEY_OFF("满减", "满减策略");

        String strategyType;
        String desc;

        CashierStrategy(String strategyType, String desc) {
            this.strategyType = strategyType;
            this.desc = desc;
        }
    }

    /**
     * 结账
     *
     * @param totalPrice 商品总价
     * @return 返回真正需要支付的金额
     */
    abstract double onCash(double totalPrice);
}
