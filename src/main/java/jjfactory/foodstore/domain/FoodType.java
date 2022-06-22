package jjfactory.foodstore.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class FoodType {
    @Id @GeneratedValue
    @Column(name = "food_type_id")
    private Long id;

    private String foodType;
    private int foodOrder;

    @OneToMany(mappedBy = "foodType")
    private List<FoodStore> foodStores = new ArrayList<>();

    public FoodType(String foodType, int foodOrder) {
        this.foodType = foodType;
        this.foodOrder = foodOrder;
    }

    @Override
    public String toString() {
        return "FoodType{" +
                "id=" + id +
                ", foodType='" + foodType + '\'' +
                ", foodOrder=" + foodOrder +
                '}';
    }
}
