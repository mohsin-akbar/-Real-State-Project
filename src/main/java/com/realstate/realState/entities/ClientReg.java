package com.realstate.realState.entities;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data

public class ClientReg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientId;

    private String clientName;
    private String phoneNumber;
    private String email;
    private String gender;
    private String username;
    private String password;
    @OneToOne(mappedBy ="clientReg",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Sale sale;


}
