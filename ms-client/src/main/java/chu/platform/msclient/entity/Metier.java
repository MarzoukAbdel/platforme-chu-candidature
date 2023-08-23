//package chu.platform.msclient.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.List;
//
//@Entity
//@Data
//public class Metier {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private  long Id;
//    private  String NomMetier;
//    private  String Email;
//    private String Description;
//    private  int NbrStagiaire;
//
//    @OneToMany
//    private List<Candidature> candidatures ;
//
//}
