package com.cloud.cosumer.imp;

import com.cloud.cosumer.service.RemoteService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
@Component
public class RemoteHystrix implements RemoteService {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello" +name+", this messge send failed ";
    }


}
