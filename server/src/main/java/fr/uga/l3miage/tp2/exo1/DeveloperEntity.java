package fr.uga.l3miage.tp2.exo1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity(name = "developer_miage")
public class DeveloperEntity {
    @Id
    private String lastname;
    private String firstname;
    private String email;
    @ManyToMany(mappedBy = "developers")
    private Set<ProjetEntity>projets;
}
