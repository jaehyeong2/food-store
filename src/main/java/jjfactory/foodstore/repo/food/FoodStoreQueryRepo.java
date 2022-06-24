package jjfactory.foodstore.repo.food;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Repository
public class FoodStoreQueryRepo {
    private final JPAQueryFactory queryFactory;
}
