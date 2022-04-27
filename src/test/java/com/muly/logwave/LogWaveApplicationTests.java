package com.muly.logwave;

import cn.hutool.json.JSONUtil;
import com.muly.logwave.model.Order;
import com.muly.logwave.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LogWaveApplicationTests {

    @Autowired
    private OrderService orderService;

    @Test
    void testCreateOrder(){
        orderService.create(Order.builder()
                .orderNo("T001")
                .productName("苹果11")
                .purchaseName("张三")
                .build()
        );
    }



}
