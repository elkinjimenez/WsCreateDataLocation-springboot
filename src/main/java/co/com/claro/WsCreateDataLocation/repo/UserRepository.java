package co.com.claro.WsCreateDataLocation.repo;

import co.com.claro.WsCreateDataLocation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
