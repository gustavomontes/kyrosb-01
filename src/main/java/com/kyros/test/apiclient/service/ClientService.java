package com.kyros.test.apiclient.service;

import com.kyros.test.apiclient.exception.ClientNotFoundException;
import com.kyros.test.apiclient.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> findAll();

    Client findById(Long id) throws ClientNotFoundException;

    Client save(Client client);

    Client update(Client clientDTO);

    void delete(Long id);

}
