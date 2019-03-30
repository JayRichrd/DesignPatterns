package kt.com.tencent.cain.desigin_pattern.strategy

/**
 * @author : jiangyu
 * @date   : 2019-03-30
 * @desc   : xxx
 */
abstract class AbstractCashier {
    /**
     * 结账算法
     */
    enum class CashierStrategy(val desc: String, val strategyType: String) {
        CASHIER_DISCOUNT("打折促销", "打折策略"),
        CASHIER_MONEY_OFF("满减", "满减策略")
    }

    /**
     * 结账
     *
     * @param totalPrice 商品总价
     * @return 返回真正需要支付的金额
     */
    abstract fun onCash(totalPrice: Double): Double
}