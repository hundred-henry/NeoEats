package com.sky;

import io.github.cdimascio.dotenv.Dotenv;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement //开启注解方式的事务管理
@Slf4j
@EnableCaching
@EnableScheduling
public class SkyApplication {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure()
                .directory("sky-server/src/main/resources")
                .load();

        // 例如将 .env 中的变量设置到系统属性中
        System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
        System.setProperty("ALI_ACCESS_KEY_ID", dotenv.get("ALI_ACCESS_KEY_ID"));
        System.setProperty("ALI_ACCESS_KEY_SECRET", dotenv.get("ALI_ACCESS_KEY_SECRET"));
        System.setProperty("WECHAT_APPID", dotenv.get("WECHAT_APPID"));
        System.setProperty("WECHAT_KEY_SECRET", dotenv.get("WECHAT_KEY_SECRET"));
        System.setProperty("BAIDU_AK", dotenv.get("BAIDU_AK"));

        SpringApplication.run(SkyApplication.class, args);
        log.info("server started");
    }
}
