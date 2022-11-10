package com.example.posts.domain;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.hibernate.cfg.beanvalidation.GroupsPerOperation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.security.Principal;
import java.sql.Time;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Logger  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Transaction_Id;
    private LocalDate date;
    private Time time;
    private String principal;
    private String operation;

    public Logger(LocalDate date, Time time, String principal, String operation) {
    }
}
