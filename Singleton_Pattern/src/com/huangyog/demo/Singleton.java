package com.huangyog.demo;

/**
 * Created by HuangYog on 2015/2/7.
 * Initialization Demand Holder (IoDH)的技术
 * 在IoDH中，我们在单例类中增加一个静态(static)内部类，
 * 在该内部类中创建单例对象，再将该单例对象通过getInstance()方法返回给外部使用
 */
public class Singleton {
    private Singleton(){}
    private static class HolderClass {
        private static final Singleton instence= new Singleton();
    }

    public static Singleton getInstence(){
        return HolderClass.instence;
    }

    public static void main(String[] args) {
        Singleton s1,s2;
        s1 = Singleton.getInstence();
        s2 = Singleton.getInstence();
        System.out.println(s1==s2);
    }
}
