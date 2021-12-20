package com.example.examelectionbackend.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="party", schema="election")
public class Party {
//    VARIABLES
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="party_id", nullable = false)
    private int id;

    @Basic
    @Column(name = "title", nullable = false)
    private String title;

    @Basic
    @Column(name = "initial", nullable = false)
    private String initial;

//    CONSTRUCTORS

    public Party(String title, String initial) {
        this.title = title;
        this.initial = initial;
    }

//    METHODS

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getInitial() {
        return initial;
    }
}
