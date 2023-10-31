package com.cybersoft.demospringboot03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller: dùng để định nghĩa đường dẫn mà nội dung đường dẫn trả ra HTML
 * @ResponseBody: Giúp cho @Controller có thể trả ra kiểu String dùng để viết API
 *
 * @RestController: Là sự kết hợp của @Controller và @ResponseBody => Viết API
 */
@RestController
@RequestMapping("/hello")
public class helloController {
    @GetMapping("")
    public String hello(){
        return "Hello Spring boot";
        }
        @GetMapping("/cybersoft")
        public String helloCybersoft(){
        return "Hello Spring Cybersoft";
        }
}
