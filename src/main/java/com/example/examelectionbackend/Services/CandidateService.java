package com.example.examelectionbackend.Services;

import com.example.examelectionbackend.Entities.Candidate;
import com.example.examelectionbackend.Entities.Party;
import com.example.examelectionbackend.Repositories.CandidateRepository;
import com.example.examelectionbackend.Repositories.PartyRepository;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;
    private final PartyRepository partyRepository;

    @Autowired
    public CandidateService(CandidateRepository candidateRepository, PartyRepository partyRepository){
        this.candidateRepository = candidateRepository;
        this.partyRepository = partyRepository;
    }

    public List<Candidate> getAllCandidates(){
        return candidateRepository.findAll();
    }

    public List<Candidate> getPartyCandidates(int partyId){
        return candidateRepository.findCandidatesByPartyId(partyId);
    }

    public Candidate addCandidate(ObjectNode cc){
        Party party = partyRepository.findById(cc.get("party").asInt());
        Candidate candidate = new Candidate(cc.get("name").asText(), cc.get("surname").asText(), party);
        return candidateRepository.save(candidate);
    }

    public Candidate editCandidate(ObjectNode cc){
        Candidate candidate = candidateRepository.findCandidateById(cc.get("id").asInt());
        Party party = partyRepository.findById(cc.get("party").asInt());

        candidate.setName(cc.get("name").asText());
        candidate.setSurname(cc.get("surname").asText());
        candidate.setParty(party);
        return candidateRepository.save(candidate);
    }

    public void removeCandidate(int candidateId){
        Candidate candidate = candidateRepository.findCandidateById(candidateId);
        candidateRepository.delete(candidate);
    }
}
