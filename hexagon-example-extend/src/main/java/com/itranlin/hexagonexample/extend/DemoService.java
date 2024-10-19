package com.itranlin.hexagonexample.extend;


import com.itranlin.hexagon.document.api.HexagonExtApiInterface;

@HexagonExtApiInterface(description = "DemoService 服务", createTime = "2024/10/14")
public interface DemoService {

    String sayHello(String name);
}
