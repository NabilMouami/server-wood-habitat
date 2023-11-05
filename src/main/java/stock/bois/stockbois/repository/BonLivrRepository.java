package stock.bois.stockbois.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stock.bois.stockbois.model.LivrBois;

@Repository

public interface BonLivrRepository extends JpaRepository<LivrBois,Long> {
}
