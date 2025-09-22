package org.example.gighub.review.infrastructure;

import org.example.gighub.review.domain.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    Page<Review> findByReviewedId(Long reviewedId, Pageable pageable);

    Page<Review> findByReviewerId(Long reviewerId, Pageable pageable);

    Page<Review> findByEventId(Long eventId, Pageable pageable);
}