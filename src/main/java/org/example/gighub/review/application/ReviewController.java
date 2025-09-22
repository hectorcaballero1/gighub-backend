package org.example.gighub.review.application;

import org.example.gighub.review.dto.ReviewCreateRequestDTO;
import org.example.gighub.review.dto.ReviewResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @PostMapping
    public ResponseEntity<ReviewResponseDTO> createReview(@RequestBody ReviewCreateRequestDTO request) {
        // TODO: implementar - Crear Reseña
        // Lógica: Actualiza automáticamente el ratingAverage del usuario reviewed
        return null;
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Page<ReviewResponseDTO>> getReviewsByUser(@PathVariable Long userId, Pageable pageable) {
        // TODO: implementar - Ver Reseñas de un Usuario (Paginado)
        return null;
    }
}