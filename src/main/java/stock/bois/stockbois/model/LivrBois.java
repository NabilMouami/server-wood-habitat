package stock.bois.stockbois.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "livraison_bois")

public class LivrBois {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String marque;
    private Double pieces;
    private Double quantity;
    private Integer qte;
    private Integer prix_unity;
    private Integer prix_total;
    private Double longueur;
    private Double remise;
    private Integer num_bon;

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

    public Double getPieces() {
        return pieces;
    }

    public void setPieces(Double pieces) {
        this.pieces = pieces;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public Integer getPrix_unity() {
        return prix_unity;
    }

    public void setPrix_unity(Integer prix_unity) {
        this.prix_unity = prix_unity;
    }

    public Integer getPrix_total() {
        return prix_total;
    }

    public void setPrix_total(Integer prix_total) {
        this.prix_total = prix_total;
    }

    public Double getLongueur() {
        return longueur;
    }

    public void setLongueur(Double longueur) {
        this.longueur = longueur;
    }

    public Double getRemise() {
        return remise;
    }

    public void setRemise(Double remise) {
        this.remise = remise;
    }

    public Integer getNum_bon() {
        return num_bon;
    }

    public void setNum_bon(Integer mum_bon) {
        this.num_bon = mum_bon;
    }


}
