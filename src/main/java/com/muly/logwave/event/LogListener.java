/*
 * Copyright (c) 2020 pig4cloud Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.muly.logwave.event;

import cn.hutool.json.JSONUtil;
import com.mzt.logapi.beans.LogRecord;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


/**
 * @author wave-muly 异步监听日志事件
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class LogListener {

	// 这里用的是自定义的线程池
	@Async("logPoolTaskExecutor")
	@Order
	@EventListener(LogEvent.class)
	public void saveSysLog(LogEvent event) {
		LogRecord sysLog = (LogRecord) event.getSource();
		log.info("async record log :[{}]", JSONUtil.toJsonStr(sysLog));
		// todo 这里可以将记录的日志保存到数据库里

	}

}
