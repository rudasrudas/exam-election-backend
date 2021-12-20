package com.example.examelectionbackend.Repositories;

import com.example.examelectionbackend.Entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
    List<Candidate> findAll();
    List<Candidate> findCandidatesByParty(int partyId);
    Candidate findCandidateById(int id);
}
