package jjfactory.foodstore.repo.food;

import jjfactory.foodstore.domain.food.FoodType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodTypeRepo extends JpaRepository<FoodType,Long> {
}
