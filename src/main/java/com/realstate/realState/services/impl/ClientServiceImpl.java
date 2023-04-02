package com.realstate.realState.services.impl;

import com.realstate.realState.entities.ClientReg;
import com.realstate.realState.payload.ClientDto;
import com.realstate.realState.repositories.ClientRepository;
import com.realstate.realState.services.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    private ModelMapper modelMapper;
    private PasswordEncoder passwordEncoder;
    private ClientRepository clientRepository;

    public ClientServiceImpl(ModelMapper modelMapper,PasswordEncoder passwordEncoder,ClientRepository clientRepository) {
        this.modelMapper = modelMapper;
        this.passwordEncoder=passwordEncoder;
        this.clientRepository=clientRepository;
    }

    @Override
    public void createClient(ClientDto clientDto) {
        ClientReg clientReg = mapToEntity(clientDto);
        clientRepository.save(clientReg);
    }

    ClientReg mapToEntity(ClientDto clientDto){
        ClientReg clientReg=new ClientReg();
        clientReg.setClientName(clientDto.getClientName());
        clientReg.setEmail(clientDto.getEmail());
        clientReg.setGender(clientDto.getGender());
        clientReg.setPhoneNumber(clientDto.getPhoneNumber());
        clientReg.setUsername(clientDto.getUsername());
        clientReg.setPassword(passwordEncoder.encode(clientDto.getPassword()));
        //  clientReg.setSale(clientDto.getSale());
        return clientReg;
    }
}
