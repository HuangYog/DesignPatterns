package com.demo.factory;

import com.demo.product.Chart;
import com.demo.product.impl.HistogramChart;
import com.demo.product.impl.LineChart;
import com.demo.product.impl.PieChart;

/**
 * Created by HuangYog on 2015/2/7.
 * 图表工厂类：工厂类
 */
public class ChartFactory {
    public static Chart getChart(String type){
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")){
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图！");
        }else if (type.equalsIgnoreCase("pie")){
            chart = new PieChart();
            System.out.println("初始化设置饼状图！");
        }else if (type.equalsIgnoreCase("line")){
            chart = new LineChart();
            System.out.println("初始化设置折线图！");
        }
        return chart;
    }
}
