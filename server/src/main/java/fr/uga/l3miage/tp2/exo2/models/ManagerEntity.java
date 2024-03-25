package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
public class ManagerEntity extends EmployeEntity {
    private String niveauGestion;
}
