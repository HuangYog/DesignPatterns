package com.demo.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by HuangYog on 2015/2/7.
 */
public class XMLUtil {
    public static String getChartType(){
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc ;
            doc = builder.parse(new File("src/com/demo/util/config.xml"));
            //获取包含图表类型的文本节点
            NodeList nl = doc.getElementsByTagName("chartType");
            Node classNode = nl.item(0).getFirstChild();
            String chartType = classNode.getNodeValue();
            return chartType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
