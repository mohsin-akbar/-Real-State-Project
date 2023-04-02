package com.realstate.realState.payload;

import com.realstate.realState.entities.Sale;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
@Data
public class ClientDto {
    private long clientId;

    private String clientName;
    private String phoneNumber;
    private String email;
    private String gender;
    private String username;
    private String password;

    private Sale sale;
}
