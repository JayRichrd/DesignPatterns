package jv.com.tencent.cain.design_pattern.proxy;

/**
 * @author cainjiang
 * @date 2019-05-17
 * RealSubject
 */
public class Pursuit implements GiveGift {
    SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    public Pursuit() {
    }

    @Override
    public void GiveDolls() {
        System.out.println(schoolGirl.getName() + "送你洋娃娃");
    }

    @Override
    public void GiveFlowers() {
        System.out.println(schoolGirl.getName() + "送你鲜花💐");
    }

    @Override
    public void GiveChocolate() {
        System.out.println(schoolGirl.getName() + "巧克力🍫");

    }
}
