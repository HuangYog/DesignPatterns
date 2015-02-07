package com.demo.product.impl;

import com.demo.product.Logger;

/**
 * Created by HuangYog on 2015/2/7.
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}
