package jjfactory.foodstore.repo.review;

import jjfactory.foodstore.domain.review.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Review,Long> {
}
