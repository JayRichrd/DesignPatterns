package kt.com.tencent.cain.desigin_pattern.simple_factoty

/**
 * @author cainjiang
 * @date 2019-02-22
 * 操作的基类
 */
abstract class Operation {
    var numA: Double = 0.0
    var numB: Double = 0.0
    abstract fun getResult(): Double
}