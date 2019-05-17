package jv.com.tencent.cain.design_pattern.proxy;

/**
 * @author cainjiang
 * @date 2019-05-17
 * 代理设计模式的Subject
 */
public interface GiveGift {
    /**
     * 送洋娃娃
     */
    void GiveDolls();

    /**
     * 送鲜花
     */
    void GiveFlowers();

    /**
     * 送巧克力
     */
    void GiveChocolate();
}
