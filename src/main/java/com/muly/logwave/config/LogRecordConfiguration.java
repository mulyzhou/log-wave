package com.muly.logwave.config;

import com.muly.logwave.utils.LoginUtils;
import com.mzt.logapi.beans.Operator;
import com.mzt.logapi.service.IOperatorGetService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

/**
 * 日志记录配置类
 *
 * @Author: wave-muly
 * @Date: 2022/4/26 17:21
 */
@Configuration
public class LogRecordConfiguration {

    /**
     * 设置默认的操作人
     * @return
     */
    @Bean
    public IOperatorGetService operatorGetService() {
        return () -> Optional.of(LoginUtils.getCurrentUser())
                .map(a -> new Operator(a.getAccount()))
                .orElseThrow(() -> new IllegalArgumentException("user is null"));
    }

}
