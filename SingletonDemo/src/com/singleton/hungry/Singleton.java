package com.singleton.hungry;

/**
 * @author LiSheng
 *
 * 饿汉模式
 * 优点：线程安全代码简单
 * 缺点：不是延迟加载，如果用不到这个类，也会实例化。
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (null == singleton) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
