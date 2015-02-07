package com.demo.product.impl;

import com.demo.product.Chart;

/**
 * Created by HuangYog on 2015/2/7.
 * 柱状图类：具体产品类
 */
public class HistogramChart implements Chart {

    @Override
    public void display() {
        System.out.println("显示柱状图！");

    }

    public HistogramChart() {
        System.out.println("创建柱状图！");
    }
}
