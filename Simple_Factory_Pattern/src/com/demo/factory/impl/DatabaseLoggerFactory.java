package com.demo.factory.impl;

import com.demo.factory.LoggerFactory;
import com.demo.product.Logger;
import com.demo.product.impl.DatabaseLogger;

/**
 * Created by HuangYog on 2015/2/7.
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //...
        Logger logger = new DatabaseLogger();
        //...
        return logger;
    }
}
