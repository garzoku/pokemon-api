package com.garzoku.pokemonapi.pokemon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.Data;

@Entity
@Data
@Table(name = "pokemon")
public class Pokemon {
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "imageUrl")
    private String imageUrl;
}
