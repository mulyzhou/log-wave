package com.muly.logwave.model;

import lombok.Builder;
import lombok.Data;

/**
 * @Author: wave-muly
 * @Date: 2022/4/27 9:57
 */
@Data
@Builder
public class Order {

    private String orderNo;
    private String purchaseName;
    private String productName;

}
