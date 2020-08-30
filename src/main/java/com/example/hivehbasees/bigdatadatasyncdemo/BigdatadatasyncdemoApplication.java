package com.example.hivehbasees.bigdatadatasyncdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableFeignClients
@EnableCaching
@EnableAsync
@EnableScheduling
@SpringBootApplication
public class BigdatadatasyncdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigdatadatasyncdemoApplication.class, args);
    }

}
