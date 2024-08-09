package rodneycom.login_auth_api_orda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rodneycom.login_auth_api_orda.domain.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
