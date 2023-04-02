package com.realstate.realState.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Sale {
    @Id
    private long clientId;
    private long agentId;
    private long propertyId;
    private Date saleDate;
   @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="client_id")
    private ClientReg clientReg;
}
