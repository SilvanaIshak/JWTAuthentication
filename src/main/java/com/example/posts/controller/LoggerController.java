package com.example.posts.controller;

import com.example.posts.domain.Logger;
import com.example.posts.service.LoggerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class LoggerController {

    @Autowired
    LoggerService loggerService;

    public void saveLog(Logger log) {
        loggerService.saveLog(log);
    }
}
