package com.kyros.test.apiclient.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Client {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String email;
    private String telefone;

}
