package com.singleton.lazy;


/**
 * @author LiSheng
 *
 * 使用静态内部类实现
 */
public class StaticInnerClassesSingleton {

    private StaticInnerClassesSingleton() {

    }

    public static StaticInnerClassesSingleton getInstance() {
        return SingletonHolder.SINGLETON;
    }

    private static class SingletonHolder {
        private static final StaticInnerClassesSingleton SINGLETON = new StaticInnerClassesSingleton();
    }
}
