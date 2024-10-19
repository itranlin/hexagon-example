package com.itranlin.hexagonexample.master;

import com.itranlin.hexagon.core.HexagonAppContext;
import com.itranlin.hexagon.spi.HexagonAppContextSpiFactory;
import com.itranlin.hexagonexample.extend.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


/**
 * @author itranlin
 * @since 2024/9/19
 */
@RestController
@RequestMapping({"test2", "kkkk"})
@Slf4j
public class Controller {
    HexagonAppContext expAppContext = HexagonAppContextSpiFactory.getFirst();

    @GetMapping
    public String test() {
        log.debug("test");
        return "hello world";
    }

    @GetMapping("remove")
    public String remove() {
        log.debug("test");
        expAppContext.uninstall("example.plugin.empty_1.0.0");
        return "hello world";
    }

    @GetMapping("say")
    public String say() {
        List<?> userServices = expAppContext.streamOne(DemoService.class);
        // first 第一个就是这个租户优先级最高的.
        Optional<?> optional = userServices.stream().findFirst();
        if (optional.isPresent()) {
            if (optional.get() instanceof DemoService service) {
                return service.sayHello("小王");
            }
        }
        return "not found";
    }
}
