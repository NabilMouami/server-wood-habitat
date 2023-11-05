package stock.bois.stockbois.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stock.bois.stockbois.model.BonLivraison;

@Repository

public interface BonRepository extends JpaRepository<BonLivraison,Long> {
}
