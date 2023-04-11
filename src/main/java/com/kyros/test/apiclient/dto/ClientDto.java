package com.kyros.test.apiclient.dto;

import com.kyros.test.apiclient.model.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private Date dataNascimento;
    private String telefone;

    public ClientDto(Client client) {
        this.id = client.getId();
        this.cpf = client.getCpf();
        this.dataNascimento = client.getDataNascimento();
        this.nome = client.getNome();
        this.email = client.getEmail();
        this.telefone = client.getTelefone();
    }
}
