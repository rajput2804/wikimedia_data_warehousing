package com.example.database;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class WikimeadiaDatabase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    lob annotation is used for handling large amount of the data
    @Lob
    private String wikiEventData;
}
