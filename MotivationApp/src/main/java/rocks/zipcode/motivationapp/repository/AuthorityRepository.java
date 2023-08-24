package rocks.zipcode.motivationapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rocks.zipcode.motivationapp.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
