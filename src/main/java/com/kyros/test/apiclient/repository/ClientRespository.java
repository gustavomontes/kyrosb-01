package com.kyros.test.apiclient.repository;

import com.kyros.test.apiclient.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClientRespository extends JpaRepository<Client, Long> {
}
