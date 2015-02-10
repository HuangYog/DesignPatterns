package com.builder.demo;

import com.builder.model.Actor;

/**
 * Created by HuangYog on 2015/2/10.
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();
    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    public Actor createActor(){
        return actor;
    }
}
