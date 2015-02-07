package com.demo.test;

import com.demo.factory.ChartFactory;
import com.demo.factory.LoggerFactory;
import com.demo.factory.impl.FileLoggerFactory;
import com.demo.product.Chart;
import com.demo.product.Logger;
import com.demo.util.XMLUtil;
import org.junit.Test;

/**
 * Created by HuangYog on 2015/2/7.
 *
 */
public class Client {

    @Test
    public void testFactory() {
        Chart chart;
        chart = ChartFactory.getChart("histogram");
        chart.display();
    }
    //通过配置xml来改变值
    @Test
    public void testFactory2XML(){
        String type = XMLUtil.getChartType();
        Chart chart = ChartFactory.getChart(type);
        chart.display();
    }

    @Test
    public void testLogger(){
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
