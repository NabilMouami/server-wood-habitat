package stock.bois.stockbois.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import stock.bois.stockbois.model.Panneau;

@Repository

public interface PanneauRepository extends JpaRepository<Panneau,Long> {
}
