package com.muly.logwave.utils;


import com.muly.logwave.model.User;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: wave-muly
 * @Date: 2021/4/28 17:23
 */
@Slf4j
@UtilityClass
public class LoginUtils {

    /**
     * 获取登录账户
     * @return
     */
    public User getCurrentUser() {
        return User.builder().account("DEFAULT_USER").userName("DEFAULT_ADMIIN").build();
    }

}
