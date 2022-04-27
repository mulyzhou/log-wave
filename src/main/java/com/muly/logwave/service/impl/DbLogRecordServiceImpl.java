package com.muly.logwave.service.impl;

import cn.hutool.json.JSONUtil;
import com.muly.logwave.event.LogEvent;
import com.muly.logwave.utils.SpringContextHolder;
import com.mzt.logapi.beans.LogRecord;
import com.mzt.logapi.service.ILogRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wave-muly
 * @Date: 2022/4/27 9:54
 */
@Service
@Slf4j
public class DbLogRecordServiceImpl implements ILogRecordService {

    @Override
    public void record(LogRecord logRecord) {
        log.info("record log info:[{}]", JSONUtil.toJsonStr(logRecord));
        // todo 异步记录日志
        SpringContextHolder.publishEvent(new LogEvent(logRecord));
    }

    @Override
    public List<LogRecord> queryLog(String bizNo, String type) {
        return null;
    }

    @Override
    public List<LogRecord> queryLogByBizNo(String bizNo, String type, String subType) {
        return null;
    }

}
