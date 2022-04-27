package com.muly.logwave.function;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONUtil;
import com.muly.logwave.model.Order;
import com.mzt.logapi.service.IParseFunction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author: bozhou
 * @Date: 2022/4/27 10:34
 */
@Slf4j
@Component
public class OrderParseFunction implements IParseFunction {

    /**
     * true：这个函数解析在注解方法执行之前运行，false：方法执行之后
     * 默认方法之后执行
     * @return
     */
    @Override
    public boolean executeBefore() {
        return IParseFunction.super.executeBefore();
    }

    @Override
    public String functionName() {
        return "OrderParse";
    }

    @Override
    public String apply(Object value) {
        log.info("order parse function,value:[{}]", JSONUtil.toJsonStr(value));
        if (ObjectUtil.isEmpty(value)) {
            return "";
        }
        Order order = (Order) value;
        return order.getOrderNo() + "-" + order.getPurchaseName() + "-" + order.getProductName();
    }
}
