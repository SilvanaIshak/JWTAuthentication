package com.example.posts.aspect.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//defining custom annotation
@Target({ElementType.METHOD})
public @interface ExecutionTime {
}
