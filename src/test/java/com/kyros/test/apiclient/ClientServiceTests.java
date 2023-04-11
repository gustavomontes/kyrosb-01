package com.kyros.test.apiclient;

import com.kyros.test.apiclient.model.Client;
import com.kyros.test.apiclient.service.ClientService;
import com.kyros.test.apiclient.repository.ClientRespository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ClientServiceTests {
    @Mock
    ClientRespository clientRepository;

    @InjectMocks
    ClientService clientService;

    @Before
    public void setup(){
        when(clientRepository.findAll()).thenReturn(fakeClientList());
    }

    @Test
    public void findAllTest(){
        List<Client> clientList = clientService.findAll();
        Assert.notEmpty(clientList, "Não foi encontrado nenhum cliente");
    }

    private static List<Client> fakeClientList() {
        List<Client> clientes = new ArrayList<>();
        Client c = new Client();
        c.setTelefone("34989898989");
        c.setCpf("00000000000");
        c.setEmail("teste@teste.com");
        c.setNome("João Teste");
        c.setDataNascimento(new Date());
        clientes.add(new Client());
        return clientes;
    }
}
