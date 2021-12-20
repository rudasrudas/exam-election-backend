package com.example.examelectionbackend.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="candidate", schema="election")
public class Candidate {
//    VARIABLES
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="candidate_id", nullable = false)
    private int id;

    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    @Basic
    @Column(name = "surname", nullable = false)
    private String surname;

    @ManyToOne
    @JoinColumn(name = "party", referencedColumnName = "party_id", nullable = false)
    private Party party;

//    CONSTRUCTORS

    public Candidate(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

//    METHODS

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Party getParty() {
        return party;
    }
}
