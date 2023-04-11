package com.kyros.test.apiclient.controller.impl;

import com.kyros.test.apiclient.controller.ClientController;
import com.kyros.test.apiclient.dto.ClientDto;
import com.kyros.test.apiclient.exception.ClientNotFoundException;
import com.kyros.test.apiclient.model.Client;
import com.kyros.test.apiclient.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@AllArgsConstructor
public class ClientControllerImpl implements ClientController {
    @Autowired
    private ClientService service;

    @GetMapping
    public List<Client> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        ResponseEntity<?> response;
        try {
            Client cliente = service.findById(id);
            response = ResponseEntity.ok(new ClientDto(cliente));
        } catch (ClientNotFoundException e) {
            response = ResponseEntity.noContent().build();

        }
        return response;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping
    public Client update(@RequestBody Client client) {
        return service.update(client);
    }

    @PostMapping
    public Client save(@RequestBody Client client) {
        return service.save(client);
    }
}
