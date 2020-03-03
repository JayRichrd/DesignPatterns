package jv.com.tencent.cain.design_pattern.observer;

/**
 * @author : jiangyu
 * @date : 2020/3/3
 * @desc : xxx
 */
public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void removeAll();

    void notifyAllObserver(Object data);

    void notify(Observer observer, Object data);
}
