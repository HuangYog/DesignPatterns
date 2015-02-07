package com.demo.factory.impl;

import com.demo.factory.LoggerFactory;
import com.demo.product.Logger;
import com.demo.product.impl.FileLogger;

/**
 * Created by HuangYog on 2015/2/7.
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger = new FileLogger();
        return logger;
    }
}
