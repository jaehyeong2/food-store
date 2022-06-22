package jjfactory.foodstore.repo;

import jjfactory.foodstore.domain.FoodType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodTypeRepo extends JpaRepository<FoodType,Long> {
}
