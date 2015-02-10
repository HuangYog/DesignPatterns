package com.prototype.demo.impl;

import com.prototype.demo.Prototype;

/**
 * Created by HuangYog on 2015/2/9.
 */
public class ConcretePrototype implements Prototype {
    private String attr;

    public void setAttr(String attr){
        this.attr = attr;
    }

    public String getAttr(){
        return this.attr;
    }
    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype();
        //prototype.setAttr(this.attr);
        return prototype;
    }
}
