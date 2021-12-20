package com.example.examelectionbackend.Controllers;

import com.example.examelectionbackend.Entities.Party;
import com.example.examelectionbackend.Services.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parties")
public class PartyController {
    PartyService partyService;

    @Autowired
    public PartyController(PartyService partyService){
        this.partyService = partyService;
    }

    @GetMapping("/")
    public List<Party> getAllParties(){
        return partyService.getAllParties();
    }
}
