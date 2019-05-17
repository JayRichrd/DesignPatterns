package jv.com.tencent.cain.design_pattern.proxy;

/**
 * @author cainjiang
 * @date 2019-05-17
 * 代理者
 */
public class Proxy implements GiveGift {
    SchoolGirl schoolGirl;
    Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
        if (pursuit == null) {
            pursuit = new Pursuit(schoolGirl);
        }
    }

    public Proxy() {
        if (pursuit == null) {
            pursuit = new Pursuit();
        }
    }


    @Override
    public void GiveDolls() {

    }

    @Override
    public void GiveFlowers() {

    }

    @Override
    public void GiveChocolate() {

    }
}
