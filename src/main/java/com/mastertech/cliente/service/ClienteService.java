package com.mastertech.cliente.service;

import com.mastertech.cliente.exceptions.ClienteNaoEncontradoException;
import com.mastertech.cliente.model.Cliente;
import com.mastertech.cliente.repository.ClienteRepository;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Optional<Cliente> buscarClientePorId(int id){
        Optional<Cliente> response = repository.findById(id);

        if(!response.isPresent()) {
            throw new ClienteNaoEncontradoException();
        }

        return repository.findById(id);
    }

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public List<Cliente> buscarTodos() {
        return repository.findAll();
    }

}

