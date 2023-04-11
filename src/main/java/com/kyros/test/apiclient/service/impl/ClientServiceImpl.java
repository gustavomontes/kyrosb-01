package com.kyros.test.apiclient.service.impl;

import com.kyros.test.apiclient.exception.ClientNotFoundException;
import com.kyros.test.apiclient.model.Client;
import com.kyros.test.apiclient.repository.ClientRespository;
import com.kyros.test.apiclient.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRespository repository;

    @Override
    public List<Client> findAll(){
        return repository.findAll();
    }

    @Override
    public Client findById(Long id) throws ClientNotFoundException {
        Optional<Client> clientOptional = repository.findById(id);
        if(clientOptional.isPresent()) {
            return clientOptional.get();
        }
        throw new ClientNotFoundException();
    }

    @Override
    public Client save(Client client){
        return repository.save(client);
    }

    @Override
    public Client update(Client clientDTO){
        Optional<Client> clientOptional = repository.findById(clientDTO.getId());

        if(clientOptional.isPresent()){
            Client client = clientOptional.get();
            client.setCpf(clientDTO.getCpf());
            client.setNome(clientDTO.getNome());
            client.setEmail(clientDTO.getEmail());
            client.setDataNascimento(clientDTO.getDataNascimento());
            client.setTelefone(clientDTO.getTelefone());
            return repository.save(client);
        }
        return null;
    }

    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
}
