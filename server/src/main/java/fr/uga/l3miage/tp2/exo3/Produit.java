package fr.uga.l3miage.tp2.exo3;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Produit {
@Id
    private Long id;
private String nom;
private double prix;
private int quantite;
@ManyToOne
    private Commande commande;
@OneToMany(mappedBy = "produit")
    private Set<CategorieDeProduit>categorieDeProduits;
@ManyToOne
    private CategorieDeProduit categorieDeProduit;
}
