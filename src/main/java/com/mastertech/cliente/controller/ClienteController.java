package com.mastertech.cliente.controller;


import com.mastertech.cliente.model.Cliente;
import com.mastertech.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping("/cliente")
    public ResponseEntity salvarCliente(@RequestBody Cliente cliente){
        return ResponseEntity.ok(service.salvar(cliente));
    }

    @GetMapping("/cliente/{id}")
    public Optional<Cliente> buscaCliente(@PathVariable String id){
        return service.buscarClientePorId(Integer.valueOf(id));
    }

    @GetMapping("/clientes")
    public List<Cliente> buscaTodosClientes() {
        return service.buscarTodos();
    }
}
