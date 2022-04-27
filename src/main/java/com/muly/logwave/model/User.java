package com.muly.logwave.model;

import lombok.Builder;
import lombok.Data;

/**
 * @Author: wave-muly
 * @Date: 2022/4/27 10:00
 */
@Data
@Builder
public class User {

    private String account;
    private String userName;

}
