package fr.uga.l3miage.tp2.exo1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "Étudiant")
public class EtudiantEntity {
    @Id
    private Long agalan;
    private String nom;
    private String email;
    @ManyToMany(mappedBy = "etudiants")
    private Set<ClubSportifEntity>clubSportifs;
}
