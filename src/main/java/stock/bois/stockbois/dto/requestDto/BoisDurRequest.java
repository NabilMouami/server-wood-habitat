package stock.bois.stockbois.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class BoisDurRequest {
    private String marque;
    private String fornisseur;

    private String n_fardou;
    private  Double pieces;
    private  Double longueur;
    private  Double larg;
    private  Double epaisseur;
    private  Double volume;

    private  Double prix_unity;

    private  String date_creation;

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

    public String getN_fardou() {
        return n_fardou;
    }

    public void setN_fardou(String n_fardou) {
        this.n_fardou = n_fardou;
    }

    public Double getPieces() {
        return pieces;
    }

    public void setPieces(Double pieces) {
        this.pieces = pieces;
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

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getPrix_unity() {
        return prix_unity;
    }

    public void setPrix_unity(Double prix_unity) {
        this.prix_unity = prix_unity;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }
}
