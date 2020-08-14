package jv.com.tencent.cain.design_pattern.fly_weight;

import java.util.HashMap;
import java.util.Locale;

/**
 * @author cainjiang
 * @date 2020/8/14
 */
public class FlyWeightFactory {
    private HashMap<String, AbstractFlyWeight> flyWeights = new HashMap<>();
    private AbstractFlyWeight unSharedFlyWeight = new UnSharedFlyWeight();

    public AbstractFlyWeight getUnSharedFlyWeight() {
        return unSharedFlyWeight;
    }

    public FlyWeightFactory() {
        flyWeights.put("X", new ConcretFlyWeight());
        flyWeights.put("Y", new ConcretFlyWeight());
        flyWeights.put("Z", new ConcretFlyWeight());
    }

    public AbstractFlyWeight getFlyWeight(String key) {
        key = key.toUpperCase(Locale.ENGLISH);
        AbstractFlyWeight flyWeight = null;
        flyWeight = flyWeights.get(key);
        return flyWeight;
    }

    int getFlyWeightCount() {
        return flyWeights.size() + 1;
    }

}
