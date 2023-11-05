package stock.bois.stockbois.dto.requestDto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class PanneauRequest {
    private Long id;
    private String type;

    private String marque;
    private String fornisseur;

    private Double piece_total;
    private  Double longueur;
    private  Double larg;
    private  Double epaisseur;

    private  Double prix_unity;

    private  String date;
    private Integer code;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getFornisseur() {
        return fornisseur;
    }

    public void setFornisseur(String fornisseur) {
        this.fornisseur = fornisseur;
    }

    public Double getPiece_total() {
        return piece_total;
    }

    public void setPiece_total(Double piece_total) {
        this.piece_total = piece_total;
    }

    public Double getLongueur() {
        return longueur;
    }

    public void setLongueur(Double longueur) {
        this.longueur = longueur;
    }

    public Double getLarg() {
        return larg;
    }

    public void setLarg(Double larg) {
        this.larg = larg;
    }

    public Double getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(Double epaisseur) {
        this.epaisseur = epaisseur;
    }

    public Double getPrix_unity() {
        return prix_unity;
    }

    public void setPrix_unity(Double prix_unity) {
        this.prix_unity = prix_unity;
    }

    public String getDate_creation() {
        return date;
    }

    public void setDate_creation(String date) {
        this.date = date;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
