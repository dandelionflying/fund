package cn.running4light.demo.task;

import cn.running4light.demo.web.service.FundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * @author running4light
 * @description
 * @createTime 2021/6/28 17:33
 */
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling
public class FundTask {
    @Autowired
    private FundService service;
    @Scheduled(cron = "0/10 * * * * ?")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)
    private void configureTasks() {
        service.print();
        System.err.println("||");
        System.err.println("||");
        System.err.println("||");
    }
}
