package jjfactory.foodstore.repo.food;

import jjfactory.foodstore.domain.food.FoodStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodStoreRepo extends JpaRepository<FoodStore,Long> {
}
