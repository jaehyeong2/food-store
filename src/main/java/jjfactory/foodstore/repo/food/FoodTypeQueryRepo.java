package jjfactory.foodstore.repo.food;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class FoodTypeQueryRepo {
    private final JPAQueryFactory queryFactory;
}
