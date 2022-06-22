package jjfactory.foodstore.repo;

import jjfactory.foodstore.domain.FoodType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@ExtendWith(MockitoExtension.class) //junit5에서는 runwith 대신 extendsWith 사용
@SpringBootTest
public class FoodStoreRepoTest {

    @Mock
    static FoodTypeRepo foodTypeRepo;
    @Autowired
    static FoodStoreRepo foodStoreRepo;

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

    }
}
