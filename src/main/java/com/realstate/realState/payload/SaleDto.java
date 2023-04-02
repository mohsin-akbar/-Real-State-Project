package com.realstate.realState.payload;

import com.realstate.realState.entities.ClientReg;
import lombok.Data;

import java.util.Date;
@Data
public class SaleDto {
    private long clientId;
    private long agentId;
    private long propertyId;
    private Date saleDate;
    private ClientReg clientReg;
}
