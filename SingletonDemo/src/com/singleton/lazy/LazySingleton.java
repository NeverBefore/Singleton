package com.singleton.lazy;

/**
 * @author LiSheng
 *
 * 懒汉模式，首次需要使用的时候在实例化，需要考虑线程安全
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {

    }

    private static LazySingleton getInstance() {
        if (null == singleton) {
            singleton = new LazySingleton();
        }

        return singleton;
    }
}