package fr.uga.l3miage.tp2.exo1.models;

import fr.uga.l3miage.tp2.exo1.models.EtudiantEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
public class ClubSportifEntity {
@Id
    private Long id;
private String nom;
private String description;
@ManyToMany
    private Set<EtudiantEntity>etudiants;
}
