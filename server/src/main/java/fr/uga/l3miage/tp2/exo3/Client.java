package fr.uga.l3miage.tp2.exo3;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Client {
@Id
    private Long id;
private String nom;
private String email;
@OneToMany(mappedBy = "client")
    private Set<Commande>commandes;
@OneToOne(mappedBy = "cllient")
    private Adresse adresse;

}
