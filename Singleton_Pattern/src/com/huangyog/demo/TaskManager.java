package com.huangyog.demo;

/**
 * Created by HuangYog on 2015/2/7.
 * 单例模式(Singleton Pattern)：确保某一个类只有一个实例，
 * 而且自行实例化并向整个系统提供这个实例，这个类称为单例类，
 * 它提供全局访问的方法。单例模式是一种对象创建型模式。
 */
public class TaskManager {
    private static TaskManager tm = null;

    private TaskManager() {}

    public void displayProcesses(){}

    public void displayServices(){}

    public static TaskManager getInstance(){
        if (tm==null){
            tm = new TaskManager();
        }
        return tm;
    }
    /**
     * ****单例模式有三个要点****
     * 一是某个类只能有一个实例；
     * 二是它必须自行创建这个实例；
     * 三是它必须自行向整个系统提供这个实例。
     */
}
