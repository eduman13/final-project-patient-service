package com.ironhack.finalprojectpatientservice.client;

import com.ironhack.finalprojectpatientservice.model.logging.Log;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name="logging-service")
public interface LogClient {

    @PostMapping("/logging/post_log")
    void postLog(@RequestBody Log log);

}
