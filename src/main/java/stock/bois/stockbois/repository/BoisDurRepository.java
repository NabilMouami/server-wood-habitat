package stock.bois.stockbois.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stock.bois.stockbois.model.BoisDur;

@Repository

public interface BoisDurRepository extends JpaRepository<BoisDur,Long> {
}