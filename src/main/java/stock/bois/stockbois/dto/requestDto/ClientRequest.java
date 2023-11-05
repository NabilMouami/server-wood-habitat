package stock.bois.stockbois.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ClientRequest {
    private String fullname;
    private String phone;
    private String ville;
    private String adresse;

    private String cne;

    public String getFullname() {
        return fullname;
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
