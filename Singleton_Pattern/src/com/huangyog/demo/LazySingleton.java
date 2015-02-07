package com.huangyog.demo;

/**
 * Created by HuangYog on 2015/2/7.
 * 使用双重检查锁定实现的懒汉式单例类
 */
public class LazySingleton {

    private volatile static LazySingleton intence= null;
    private LazySingleton(){}

    public static LazySingleton getInstence(){

        if (intence==null){
            //双重检查锁定
            synchronized (LazySingleton.class){
                if (intence==null){
                    intence = new LazySingleton();
                }
            }
        }
        return intence;
    }
}
