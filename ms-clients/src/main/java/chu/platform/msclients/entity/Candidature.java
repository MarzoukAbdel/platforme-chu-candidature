package chu.platform.msclients.entity;//package chu.platform.msclient.entity;
//


import chu.platform.msclients.enumeration.CandidatureStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data

@NoArgsConstructor
public class Candidature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;


    @Enumerated(EnumType.STRING)
    private CandidatureStatus Status;

    @ManyToOne
    private Metier metier ;

    @OneToOne
    private Stagiaire stagiaire;

    @OneToMany
    private List<PieceJointe> pieceJointeList;




}
