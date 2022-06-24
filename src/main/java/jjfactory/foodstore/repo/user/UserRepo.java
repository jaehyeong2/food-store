package jjfactory.foodstore.repo.user;

import jjfactory.foodstore.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
