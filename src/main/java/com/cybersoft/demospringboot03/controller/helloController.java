package com.cybersoft.demospringboot03.controller;

import com.cybersoft.demospringboot03.payload.request.LoginRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Controller: dùng để định nghĩa đường dẫn mà nội dung đường dẫn trả ra HTML
 * @ResponseBody: Giúp cho @Controller có thể trả ra kiểu String dùng để viết API
 *
 * @RestController: Là sự kết hợp của @Controller và @ResponseBody => Viết API
 */
@RestController
@RequestMapping("/hello")
public class helloController {
    // Tham số truyền trên trình duyệt : @RequestParam
    // Tham số truyền ngầm: @RequestParam
    // Tham số đóng vai trò như là một đường dẫn : @PathVariable
    // Tham số truyền ngầm là đối tượng:  @ResquestBody
    @GetMapping("")
    public String hello(@RequestParam String hoten, @RequestParam int tuoi){
        // 400Bad Request : Lỗi chưa truyền tham số
        return "Hello Spring boot " + hoten + "- tuoi: " + tuoi;
        }
            @PostMapping("/cybersoft")
        public String helloCybersoft(@RequestBody LoginRequest loginRequest){
        return "Hello Spring Cybersoft " + loginRequest.getUsername() + " - " + loginRequest.getPassword();
        /**
         * form data :  có hỗ trơ truyền file
         * x-www-form-urlen: không hỗ trọ truyền file
         * raw :
         */
        }
        @PutMapping("/update/{id}")
        public ResponseEntity<?> update (@PathVariable int id){

        return new ResponseEntity<>(  " Update " + id, HttpStatus.OK);
        }
}
