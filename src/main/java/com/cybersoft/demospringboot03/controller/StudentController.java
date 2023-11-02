package com.cybersoft.demospringboot03.controller;

import com.cybersoft.demospringboot03.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private List<Student> list = new ArrayList<>();
    @PostMapping("")
    public ResponseEntity<?> insertGet (Student student){
        // 400Bad Request : Lỗi chưa truyền tham số
        list.add(student);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping("/addstudent")
    public ResponseEntity<?> insertPost(@RequestBody Student student){
        list.add(student);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    // 400Bad Request : Lỗi chưa truyền tham số


    @PutMapping("/{name}/{tuoi}")
    public ResponseEntity<?> insertPath (@PathVariable String name , @PathVariable int tuoi){
        Student student = new Student();
        student.setHoten(name);
        student.setTuoi(tuoi);

        list.add(student);

        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}



