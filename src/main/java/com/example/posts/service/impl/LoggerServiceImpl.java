package com.example.posts.service.impl;

import com.example.posts.domain.Logger;
import com.example.posts.repo.LoggerRepo;
import com.example.posts.service.LoggerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoggerServiceImpl implements LoggerService {

    @Autowired
    LoggerRepo loggerRepo;

    @Override
    public void saveLog(Logger logger) {
        loggerRepo.save(logger);
    }
}
