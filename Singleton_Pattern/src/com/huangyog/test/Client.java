package com.huangyog.test;

import com.huangyog.demo.LoadBalancer;

/**
 * Created by HuangYog on 2015/2/7.
 * 编写如下客户端测试代码
 */
public class Client {
    public static void main(String[] args) {
        LoadBalancer balancer1,balancer2,balancer3,balancer4;
        balancer1 = LoadBalancer.getInstence();
        balancer2 = LoadBalancer.getInstence();
        balancer3 = LoadBalancer.getInstence();
        balancer4 = LoadBalancer.getInstence();

        if (balancer1 == balancer2 &&balancer2==balancer3&&
                balancer3==balancer4){
            System.out.println("服务器负载均衡器具有唯一性！");
        }
        LoadBalancer.getInstence().addServer("server1");
        LoadBalancer.getInstence().addServer("server2");
        LoadBalancer.getInstence().addServer("server3");
        LoadBalancer.getInstence().addServer("server4");

        //System.out.println("共有："+LoadBalancer.getInstence().getServerNumber()+"台服务器");
        for(int i=0;i<10;i++){
            String  server = LoadBalancer.getInstence().getServer();
            System.out.println("分发请求至服务器：" + server);
        }
    }



}
