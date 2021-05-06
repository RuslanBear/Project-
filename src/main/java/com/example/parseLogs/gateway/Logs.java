package com.example.parseLogs.gateway;

import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "logs",
        url = "http://www.dsdev.tech/logs"
)
public interface Logs {

    @GetMapping(value = "/{value}")
    Response getLogs(@RequestParam String value);

}
