package tn.esprit.kadem.entity;
import lombok.*;
import tn.esprit.kadem.entity.Domaine;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "T_Etudiant")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ETUDIANT")
    private Long idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;

    @Enumerated(EnumType.STRING)
    private Domaine domaine;
}