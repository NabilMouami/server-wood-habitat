package stock.bois.stockbois.dto.requestDto;
public class RegistrationDTO {
    private String nom;
    private String prenom;

    private String email;
    private String password;

    public RegistrationDTO(String nom, String prenom, String email, String password, String role) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private String role;


    public RegistrationDTO(){
        super();
    }

    public RegistrationDTO(String email, String password){
        super();
        this.email = email;
        this.password = password;
    }

    public String getUsername(){
        return this.email;
    }

    public void setUsername(String username){
        this.email = username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String toString(){
        return "Registration info: username: " + this.email + " password: " + this.password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
