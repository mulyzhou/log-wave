package com.muly.logwave.service.impl;

import com.muly.logwave.model.Order;
import com.muly.logwave.service.OrderService;
import com.mzt.logapi.context.LogRecordContext;
import com.mzt.logapi.starter.annotation.LogRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: wave-muly
 * @Date: 2022/4/27 10:04
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    @LogRecord(
            type = "order",
            subType = "add",
            // 这个值不能为空
            bizNo = "{{#order.orderNo}}",
            fail = "创建订单失败，失败原因：「{{#_errorMsg}}」",
            success = "[{{#order.purchaseName}}]创建订单[{{#order.orderNo}}-{{#order.productName}}]成功" +
                    ",函数解析结果[{OrderParse{#order}}]" +
                    ",内部变量[{{#innerOrder.productName}}]",
            extra = "{{#order.toString()}}"
    )
    public Order create(Order order) {

        // 可以给日志调用
        LogRecordContext.putVariable("innerOrder", Order.builder()
                .orderNo("INNER-T001")
                .productName("INNER-苹果11")
                .purchaseName("INNER-张三")
                .build());
        return order;
    }
}
