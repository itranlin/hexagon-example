package com.itranlin.hexagonexample.plugin.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author itranlin
 * @since 2024/9/19
 */
@RestController
@RequestMapping("test")
public class PluginController {
    @GetMapping
    public String test() {
        return "hello world";
    }
}
