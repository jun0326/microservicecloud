package cn.jun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringCloudApplication
@EnableEurekaServer  //EurekaServer服务器启动类，接受其它微服务注册进来
public class EurekaServer7002_App {

    public static void main(String[] args) {

        SpringApplication.run(EurekaServer7002_App.class,args);

    }
}
