package cn.jun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"cn.jun.springcloud"})  //使用feign，如果出现服务器断掉的服务，请求多次没有反应之后，就不会再发送请求
@ComponentScan("cn.jun.springcloud")
public class DeptConsumer80_Feign_App {

   public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
   }
}
