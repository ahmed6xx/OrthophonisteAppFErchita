package models.models;

import java.time.LocalDate;
import java.util.Date;

public class Adulte extends Patient{
    private String diplome;
    private String profession;
    public Adulte(String nom, String prenom, LocalDate dateDeNaissance, String adresse, String telephone, String email, String LieuDeNaissance, String diplome, String profession){
        super( nom,  prenom,dateDeNaissance, adresse,telephone, email,LieuDeNaissance);
        this.diplome=diplome;
        this.profession=profession;;
    }
}
