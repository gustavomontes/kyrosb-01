package com.kyros.test.apiclient.controller;

import com.kyros.test.apiclient.model.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public interface ClientController {

    @GetMapping
    List<Client> findAll();

    @GetMapping("/{id}")
    ResponseEntity<?> findById(@PathVariable Long id);

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id);

    @PutMapping
    Client update(@RequestBody Client client);

    @PostMapping
    Client save(@RequestBody Client client);


}
