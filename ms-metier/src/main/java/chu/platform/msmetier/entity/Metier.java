package chu.platform.msmetier.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Entity
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public class Metier {

        @jakarta.persistence.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  long Id;
        private  String NomMetier;
        private  String Email;
        private  int NbrStagiaire;



}


