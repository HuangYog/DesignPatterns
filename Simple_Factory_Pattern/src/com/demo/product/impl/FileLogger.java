package com.demo.product.impl;

import com.demo.product.Logger;

/**
 * Created by HuangYog on 2015/2/7.
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
