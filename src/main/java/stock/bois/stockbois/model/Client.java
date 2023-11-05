package stock.bois.stockbois.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.*;


import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "client")

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullname;
    private String phone;

    private String ville;
    private  String adresse;

    public Long getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getVille() {
        return ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getCne() {
        return cne;
    }

    private String cne;

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }
}