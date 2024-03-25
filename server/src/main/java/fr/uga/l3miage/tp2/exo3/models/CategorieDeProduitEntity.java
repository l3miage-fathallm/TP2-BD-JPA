package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CategorieDeProduitEntity {
@Id
    private Long id;
private String nom;
@ManyToOne
    private ProduitEntity produit;
@OneToMany(mappedBy = "categorieDeProduit")
    private Set<ProduitEntity>produits;
}
