package com.demo.product.impl;

import com.demo.product.Chart;

/**
 * Created by HuangYog on 2015/2/7.
 */
public class LineChart implements Chart {
    @Override
    public void display() {
        System.out.println("显示折线图！");
    }

    public LineChart() {
        System.out.println("创建折线图！");
    }
}
