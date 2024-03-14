package fr.uga.l3miage.tp2.exo3;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class CategorieDeProduit {
@Id
    private Long id;
private String nom;
@ManyToOne
    private Produit produit;
@OneToMany(mappedBy = "categorieDeProduit")
    private Set<Produit>produits;
}
