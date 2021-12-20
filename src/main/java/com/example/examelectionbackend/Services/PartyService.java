package com.example.examelectionbackend.Services;

import com.example.examelectionbackend.Entities.Party;
import com.example.examelectionbackend.Repositories.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyService {

    PartyRepository partyRepository;

    @Autowired
    public PartyService(PartyRepository partyRepository){
        this.partyRepository = partyRepository;
    }

    public List<Party> getAllParties(){
        return partyRepository.findAll();
    }
}
