package jjfactory.foodstore.service.food;

import jjfactory.foodstore.repo.food.FoodStoreRepo;
import jjfactory.foodstore.repo.food.FoodTypeQueryRepo;
import jjfactory.foodstore.repo.food.FoodTypeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class FoodService {
    private final FoodTypeQueryRepo foodTypeQueryRepo;
    private final FoodStoreRepo foodStoreRepo;
    private final FoodTypeRepo foodTypeRepo;
}
