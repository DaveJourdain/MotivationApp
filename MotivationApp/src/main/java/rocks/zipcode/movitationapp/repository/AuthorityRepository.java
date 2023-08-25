package rocks.zipcode.movitationapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rocks.zipcode.movitationapp.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
