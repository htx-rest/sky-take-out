package com.htx.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.Date;

/**
 * 微信搜索「二哈学习之路」
 * 自定义定时任务类
 * @author htx
 * @date 2024/8/28 22:09
 */
@Component
@Slf4j
public class MyTask {

    /**
     * 定时任务 每隔5秒触发一次
     */
    //@Scheduled(cron = "0/5 * * * * ?")
    public void executeTask(){
        log.info("定时任务开始执行：{}", new Date());
    }

}
