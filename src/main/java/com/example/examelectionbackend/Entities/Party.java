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

    @Basic
    @Column(name = "color")
    private String color; //Color code in Hexadecimal

    @Basic
    @Column(name = "votes", nullable = false)
    private int votes;

//    CONSTRUCTORS

    public Party(String title, String initial, String color, int votes) {
        this.title = title;
        this.initial = initial;
        this.color = color;
        this.votes = votes;
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
