package jjfactory.foodstore.repo;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jjfactory.foodstore.domain.food.FoodType;
import jjfactory.foodstore.repo.food.FoodStoreRepo;
import jjfactory.foodstore.repo.food.FoodTypeRepo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static jjfactory.foodstore.d.QFoodType.*;

@ExtendWith(SpringExtension.class) //junit5에서는 runwith 대신 extendsWith 사용
@DataJpaTest
public class FoodStoreRepoTest {

    @Autowired
    FoodTypeRepo foodTypeRepo;
    @Autowired
    FoodStoreRepo foodStoreRepo;
    @Autowired
    JPAQueryFactory queryFactory;

//    @BeforeAll
//    static void set(){
//        FoodType korean = new FoodType("한식",1);
//        FoodType chinese = new FoodType("중식",2);
//        FoodType western = new FoodType("양식",3);
//
//        foodTypeRepo.saveAll(List.of(korean,chinese,western));
//    }

    @Test
    @DisplayName("저장")
    void save(){
        FoodType korean = new FoodType("한식",1);
        FoodType chinese = new FoodType("중식",2);
        FoodType western = new FoodType("양식",3);

        foodTypeRepo.saveAll(List.of(korean,chinese,western));

        Assertions.assertThat(foodTypeRepo.findAll().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("쿼리 dsl 카운트 쿼리")
    void count(){

        FoodType korean = new FoodType("한식",1);
        FoodType chinese = new FoodType("중식",2);
        FoodType western = new FoodType("양식",3);

        foodTypeRepo.saveAll(List.of(korean,chinese,western));

        List<FoodType> result = queryFactory.selectFrom(foodType1)
                .fetch();

        Assertions.assertThat(result.size()).isEqualTo(3);
    }
}
