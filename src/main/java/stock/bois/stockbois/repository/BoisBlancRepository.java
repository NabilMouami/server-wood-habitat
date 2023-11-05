package stock.bois.stockbois.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stock.bois.stockbois.model.BoisBlanc;

@Repository

public interface BoisBlancRepository extends JpaRepository<BoisBlanc,Long> {
}
