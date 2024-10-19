package com.itranlin.hexagonexample.plugin;

import com.itranlin.hexagon.core.HexagonBean;
import com.itranlin.hexagonexample.extend.DemoService;


public class DemoServiceImpl implements DemoService , HexagonBean {
    @Override
    public String sayHello(String name) {
        return "你好" + name;
    }
}
