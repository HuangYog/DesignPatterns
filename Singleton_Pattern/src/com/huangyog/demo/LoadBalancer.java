package com.huangyog.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by HuangYog on 2015/2/7.
 * 负载均衡器LoadBalancer：单例类，真实环境下该类将非常复杂，
 * 包括大量初始化的工作和业务方法，考虑到代码的可读性和易理解性，
 * 只列出部分与模式相关的核心代码
 */
public class LoadBalancer {
    private static LoadBalancer instence = null;
    private List<String> serverList = null;
    /* 私有构造 */
    private LoadBalancer(){
        serverList = new ArrayList<String>();
    }
    /* 添加 */
    public void addServer(String server){
        serverList.add(server);
    }
    /* 移除 */
    public void removeServer(String server){
        serverList.remove(server);
    }

    public String getServer(){
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return serverList.get(i);
    }

    public int getServerNumber(){
        Random random = new Random();
        return random.nextInt(serverList.size());
    }
    /* 共有静态成员方法，返回唯一实例 */
    public static LoadBalancer getInstence(){
        if (instence==null){
            instence = new LoadBalancer();
        }
        return instence;
    }
}
