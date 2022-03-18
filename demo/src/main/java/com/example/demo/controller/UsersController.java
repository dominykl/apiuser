package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.demo.model.Users;
import com.example.demo.service.UserServices;
import com.example.demo.dto.UsersDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin("http://localhost:8083/")
@RestController
public class UsersController {
  @Autowired
    UserServices usersService;
    
@GetMapping(value="/users")
    public List<Users>listarUsuarios(){
       return usersService.listAll(); 
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Users> getUser(@PathVariable("id") Long id) {
        try {
            return ResponseEntity.ok().body(usersService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }

    }
    @PostMapping("/new_user")
    public ResponseEntity<UsersDto> salvar(@RequestBody UsersDto dto) {
        return ResponseEntity.ok().body(usersService.salvar(dto));
    }



}
