package com.builder.test;

import com.builder.demo.ActorBuilder;
import com.builder.demo.ActorController;
import com.builder.demo.AngelBuilder;
import com.builder.model.Actor;
import com.builder.model.XMLPasreUtil;
import org.junit.Test;

/**
 * Created by HuangYog on 2015/2/10.
 */
public class TestClient {

    @Test
    public void testClient(){
        //ActorBuilder ab = (ActorBuilder) XMLPasreUtil.getBean();
        ActorBuilder ab = new AngelBuilder();
        ActorController ac = new ActorController();
        Actor actor = ac.construct(ab);

        String type = actor.getType();
        System.out.println(type+"的外观;");
        System.out.println("性别："+actor.getSex());
        System.out.println("面容：" +actor.getFace());
        System.out.println("服饰："+actor.getCostume());
        System.out.println("发型："+actor.getHairstyle());
    }
}
