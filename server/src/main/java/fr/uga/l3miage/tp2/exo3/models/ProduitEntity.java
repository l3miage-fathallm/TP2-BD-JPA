package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ProduitEntity {
@Id
    private Long id;
private String nom;
private double prix;
private int quantite;

@OneToMany(mappedBy = "produit")
    private Set<CategorieDeProduitEntity>categorieDeProduits;
@ManyToOne
    private CategorieDeProduitEntity categorieDeProduit;
}
