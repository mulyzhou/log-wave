package com.muly.logwave.event;

import com.mzt.logapi.beans.LogRecord;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

/**
 * @Author: wave-muly
 * @Date: 2021/8/30 11:39
 */
@Getter
@Setter
@ToString
public class LogEvent extends ApplicationEvent {

    public LogEvent(LogRecord source) {
        super(source);
    }
}
