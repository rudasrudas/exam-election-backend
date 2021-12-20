package com.example.examelectionbackend.Controllers;

import com.example.examelectionbackend.Entities.Candidate;
import com.example.examelectionbackend.Services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

//    SETUP
    CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService){
        this.candidateService = candidateService;
    }

//    REQUIRED ENDPOINTS

    //Return a list with all candidates
    @GetMapping("/")
    public List<Candidate> getAllCandidates(){
        return candidateService.getAllCandidates();
    }

    //Return a list of all candidates for a given party
    @GetMapping("/party/{id}")
    public List<Candidate> getPartyCandidates(@PathVariable Integer id){
        return candidateService.getPartyCandidates(id);
    }

    //Create candidates for a given party
    @PostMapping("/")
    public Candidate addCandidate(@RequestBody Candidate candidate){
        return candidateService.addCandidate(candidate);
    }

    //Edit candidates for a given party
    @PutMapping("/")
    public Candidate editCandidate(@RequestBody Candidate candidate){
        return candidateService.editCandidate(candidate);
    }

    //Delete candidates for a given party
    @DeleteMapping("/{id}")
    public void removeCandidate(@PathVariable Integer id){
        candidateService.removeCandidate(id);
    }
}
