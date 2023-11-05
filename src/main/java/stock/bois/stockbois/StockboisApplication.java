package stock.bois.stockbois;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import stock.bois.stockbois.repository.RoleRepository;
import stock.bois.stockbois.repository.UserRepository;
import stock.bois.stockbois.model.Role;
import stock.bois.stockbois.model.ApplicationUser;

@SpringBootApplication
public class StockboisApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockboisApplication.class, args);
	}
	@Bean
	CommandLineRunner run(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder passwordEncode){
		return args ->{
			if(roleRepository.findByAuthority("ADMIN").isPresent()) return;
			Role adminRole = roleRepository.save(new Role("ADMIN"));
			roleRepository.save(new Role("USER"));

			Set<Role> roles = new HashSet<>();
			roles.add(adminRole);

			ApplicationUser admin = new ApplicationUser(1,"nabil","mouami", "test.admin@gmail", passwordEncode.encode("test"), roles,"ADMIN");

			userRepository.save(admin);
		};
	}

}
