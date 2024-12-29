package com.example.api_payroll.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class user {
    // Rota GET para listar usuários
    @GetMapping
    public String getAllUsers() {
        return "Listando todos os usuários";
    }

    // Rota POST para criar um novo usuário
    @PostMapping
    public String createUser(@RequestBody String user) {
        return "Usuário criado: " + user;
    }

    // Rota GET para buscar um usuário pelo ID
    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id) {
        return "Usuário com ID: " + id;
    }

    // Rota PUT para atualizar um usuário
    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody String user) {
        return "Usuário atualizado: ID = " + id + ", Dados = " + user;
    }

    // Rota DELETE para deletar um usuário
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        return "Usuário deletado com ID: " + id;
    }
}
