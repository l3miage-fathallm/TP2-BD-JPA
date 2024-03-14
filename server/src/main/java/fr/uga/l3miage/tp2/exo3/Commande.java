package fr.uga.l3miage.tp2.exo3;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table
public class Commande {
    @Id
    private Long id;
    private Date date;
    private double montantTotal;
    @OneToMany(mappedBy = "commande")
    private Set<Produit>produits;
    @ManyToOne
    private Client client;
}
