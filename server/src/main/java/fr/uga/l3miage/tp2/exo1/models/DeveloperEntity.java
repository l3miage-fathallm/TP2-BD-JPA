package fr.uga.l3miage.tp2.exo1.models;

import fr.uga.l3miage.tp2.exo1.models.ProjetEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "developer_miage")
public class DeveloperEntity {
    @Id
    @Column(name = "last_name")
    private String lastname;
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "email")
    private String email;
    @ManyToMany
    private Set<ProjetEntity>projet;
}
