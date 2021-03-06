package jv.com.tencent.cain.design_pattern.mediator;

/**
 * @author cainjiang
 * @date 2020/8/13
 */
public class MediatorPattern {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
        mediator.setColleague1(colleague1).setColleague2(colleague2);

        colleague1.send("吃饭了吗？");
        colleague2.send("还没有呢，你打算请客嘛？");

    }
}
