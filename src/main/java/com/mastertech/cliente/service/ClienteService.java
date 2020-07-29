package com.mastertech.cliente.service;

import com.mastertech.cliente.model.Cliente;
import com.mastertech.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Optional<Cliente> findById(int id){
        return repository.findById(id);
    }

    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

    public List<Cliente> findAll() {
        return repository.findAll();
    }

}

