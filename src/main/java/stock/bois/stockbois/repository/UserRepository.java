package stock.bois.stockbois.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import stock.bois.stockbois.model.ApplicationUser;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser, Integer> {
    Optional<ApplicationUser> findByEmail(String username);
}
