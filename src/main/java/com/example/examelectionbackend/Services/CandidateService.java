package com.example.examelectionbackend.Services;

import com.example.examelectionbackend.Entities.Candidate;
import com.example.examelectionbackend.Entities.Party;
import com.example.examelectionbackend.Repositories.CandidateRepository;
import com.example.examelectionbackend.Repositories.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    @Autowired
    public CandidateService(CandidateRepository candidateRepository){
        this.candidateRepository = candidateRepository;
    }

    public List<Candidate> getAllCandidates(){
        return candidateRepository.findAll();
    }

    public List<Candidate> getPartyCandidates(int partyId){
        return candidateRepository.findCandidatesByPartyId(partyId);
    }

    public Candidate addCandidate(Candidate candidate){
        return candidateRepository.save(candidate);
    }

    public Candidate editCandidate(Candidate updatedCandidate){
        Candidate candidate = candidateRepository.findCandidateById(updatedCandidate.getId());
        candidate = updatedCandidate;
        return candidateRepository.save(candidate);
    }

    public void removeCandidate(int candidateId){
        Candidate candidate = candidateRepository.findCandidateById(candidateId);
        candidateRepository.delete(candidate);
    }
}
