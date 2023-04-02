package com.realstate.realState.controllers;

import com.realstate.realState.payload.ClientDto;
import com.realstate.realState.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/client")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<String> createClient(@RequestBody ClientDto clientDto){
        clientService.createClient(clientDto);
        return new ResponseEntity<>("User Created Sucsessfully!", HttpStatus.OK);
    }
}
