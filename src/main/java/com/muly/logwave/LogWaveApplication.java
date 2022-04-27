package com.muly.logwave;

import com.mzt.logapi.starter.annotation.EnableLogRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableLogRecord(tenant = "log-wave")
@EnableAsync
public class LogWaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogWaveApplication.class, args);
    }

}
