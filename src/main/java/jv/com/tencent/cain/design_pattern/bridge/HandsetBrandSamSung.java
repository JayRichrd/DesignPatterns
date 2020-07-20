package jv.com.tencent.cain.design_pattern.bridge;

/**
 * @author : jiangyu
 * @date : 2020/7/11
 * @desc : xxx
 */
public class HandsetBrandSamSung extends HandsetBrand {
    public HandsetBrandSamSung(String brand) {
        super(brand);
    }

    @Override
    void run() {
        System.out.println("这是" + brand + "手机");
        if (soft != null) {
            soft.run();
        }
    }
}
