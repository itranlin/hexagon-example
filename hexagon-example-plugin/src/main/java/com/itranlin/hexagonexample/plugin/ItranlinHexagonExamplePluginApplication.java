package com.itranlin.hexagonexample.plugin;

import com.itranlin.hexagon.plugin.depend.AbstractBoot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItranlinHexagonExamplePluginApplication extends AbstractBoot {

    public static void main(String[] args) {
        SpringApplication.run(ItranlinHexagonExamplePluginApplication.class, args);
    }

}
