package jjfactory.foodstore.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class FoodStore {
    @Id @GeneratedValue
    private Long id;

    private String storeName;
    private int rate;
    private String orderName;

    @JoinColumn(name = "food_type_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private FoodType foodType;


    public FoodStore(String storeName, int rate, String orderName, FoodType foodType) {
        this.storeName = storeName;
        this.rate = rate;
        this.orderName = orderName;
        changeFoodType(foodType);
    }

    private void changeFoodType(FoodType foodType) {
        this.foodType = foodType;
        foodType.getFoodStores().add(this);
    }

    @Override
    public String toString() {
        return "FoodStore{" +
                "id=" + id +
                ", storeName='" + storeName + '\'' +
                ", rate=" + rate +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
