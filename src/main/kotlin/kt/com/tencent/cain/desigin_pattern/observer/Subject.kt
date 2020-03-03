package kt.com.tencent.cain.desigin_pattern.observer

/**
 * @author : jiangyu
 * @date   : 2020/3/3
 * @desc   : xxx
 */
interface Subject {
    fun addObserver(observer: Observer)

    fun remove(observer: Observer)

    fun removeAll()

    fun notifyAll(data: Any)

    fun notify(observer: Observer, data: Any)
}