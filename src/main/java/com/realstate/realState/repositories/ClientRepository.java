package com.realstate.realState.repositories;

import com.realstate.realState.entities.ClientReg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientReg,Long> {
}
