package com.singleton.lazy;

/**
 * @author Lisheng
 *
 * 双重校验所模式的懒汉模式，线程安全
 */
public class DoubleCheckLockSingleton {

    /**
     * 为什么使用volatile修饰singleton变量
     *
     * 1.volatile的可见性
     * 2.防止重排序优化，如果不用volatile，多线程的情况下可能会出现线程A进入synchronized代码块，
     *   执行new Singleton();，首先给singleton分配内存，但是还没有初始化变量，这时候线程B进入getInstance方法，
     *   进行第一个判断，此时singleton已经不为空，直接返回singleton，然后肯定报错。
     *   使用volatile修饰之后禁止jvm重排序优化，所以就不会出现上面的问题
     */
    private static volatile DoubleCheckLockSingleton singleton;

    private DoubleCheckLockSingleton() {

    }

    private static DoubleCheckLockSingleton getInstance() {
        if (null == singleton) {
            synchronized ((Singleton.class)) {
                if (null == singleton) {
                    singleton = new DoubleCheckLockSingleton();
                }
            }
        }
        return singleton;
    }
}
