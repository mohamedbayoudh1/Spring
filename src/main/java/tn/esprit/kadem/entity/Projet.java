package tn.esprit.kadem.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "T_PROJET")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Projet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PROJET_ID")
    private Long id; // Identifiant projet (Clé primaire)
    @Column(name = "PROJET_SUJET")
    private String sujet;
    @OneToOne
    private ProjetDetail projetDetail;
    @ManyToMany(mappedBy="projets", cascade = CascadeType.ALL)
    private Set<Equipe> equipes;

}

