package com.builder.demo;

import com.builder.model.Actor;

/**
 * Created by HuangYog on 2015/2/10.
 */
public class ActorController {
    public Actor construct(ActorBuilder ab){
        Actor actor;
        ab.buildCostume();
        ab.buildType();
        ab.buildFace();
        ab.buildSex();
        ab.buildHairstyle();
        actor = ab.createActor();
        return actor;
    }

}
