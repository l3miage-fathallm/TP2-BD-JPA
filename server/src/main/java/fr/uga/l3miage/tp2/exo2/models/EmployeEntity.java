package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.*;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "poste")
public abstract class EmployeEntity {
    @Id
    private Long id;
    private String nom;
    private String email;
    private double salaire;
}
