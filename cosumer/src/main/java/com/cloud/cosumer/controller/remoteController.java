package com.cloud.cosumer.controller;
import com.cloud.cosumer.service.RemoteService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class remoteController {

    @Autowired
    private RemoteService remoteService;


    @HystrixCommand(fallbackMethod="error",commandProperties={@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1000")})//fallbackMethod如果发生熔断，调用error()方法
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return remoteService.hello(name);
    }

    public String error(String name){
        return "sorry , method is not running";
    }
}
