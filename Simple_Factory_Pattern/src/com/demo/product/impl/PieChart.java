package com.demo.product.impl;

import com.demo.product.Chart;

/**
 * Created by HuangYog on 2015/2/7.
 */
public class PieChart implements Chart {
    @Override
    public void display() {
        System.out.println("显示饼状图！");
    }

    public PieChart() {
        System.out.println("创建饼状图！");
    }
}
