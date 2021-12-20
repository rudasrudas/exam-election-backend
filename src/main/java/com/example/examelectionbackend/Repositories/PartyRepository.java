package com.example.examelectionbackend.Repositories;

import com.example.examelectionbackend.Entities.Candidate;
import com.example.examelectionbackend.Entities.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartyRepository extends JpaRepository<Party, Integer> {
    List<Party> findAll();
    Party findById(int id);
}
