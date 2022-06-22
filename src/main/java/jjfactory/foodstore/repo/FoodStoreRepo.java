package jjfactory.foodstore.repo;

import jjfactory.foodstore.domain.FoodStore;
import jjfactory.foodstore.domain.FoodType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodStoreRepo extends JpaRepository<FoodStore,Long> {
}
