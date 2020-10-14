package com.cloud.cosumer.service;


import com.cloud.cosumer.imp.RemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//断路器判断 当服务不可用时 调用fallback所在的类方法
@FeignClient(name= "spring-cloud-provider",fallback = RemoteHystrix.class)
public interface RemoteService {
    @RequestMapping(value = "/hello")
     String hello(@RequestParam(value = "name") String name);
}