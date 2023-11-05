package stock.bois.stockbois.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stock.bois.stockbois.model.Client;


@Repository

public interface ClientRepository extends JpaRepository<Client,Long> {
}