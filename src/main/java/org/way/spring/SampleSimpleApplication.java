package org.way.spring;

/**
 * @author way
 * CommandLineRunner run方法启动时会被调用
 * @Value 配置文件中的值。
 * Created on 2016/1/7.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.way.spring.service.HelloWorldService;

@SpringBootApplication
public class SampleSimpleApplication implements CommandLineRunner {

    // Simple example shows how a command line spring application can execute an
    // injected bean service. Also demonstrates how you can use @Value to inject
    // command line args ('--name=whatever') or application properties

    @Autowired
    private HelloWorldService helloWorldService;

//    @Override
    public void run(String... args){
        System.out.println(this.helloWorldService.getHelloMessage());
    }

    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(
                SampleSimpleApplication.class);
        application.setApplicationContextClass(AnnotationConfigApplicationContext.class);
        SpringApplication.run(SampleSimpleApplication.class, args);
    }
}
