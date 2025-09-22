package org.example.gighub.contractor.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.gighub.user.domain.User;

@Entity
@Table(name = "contractors")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Contractor extends User {

    @NotBlank(message = "Contractor name is required")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    @Column(nullable = false, length = 100)
    private String name;

    @Size(max = 1000, message = "Description must not exceed 1000 characters")
    @Column(length = 1000)
    private String description;

    @Size(max = 500, message = "Profile photo URL must not exceed 500 characters")
    @Column(name = "profile_photo_url", length = 500)
    private String profilePhotoUrl;

    @Size(max = 20, message = "Phone must not exceed 20 characters")
    @Column(length = 20)
    private String phone;

    @NotNull(message = "Rating average is required")
    @DecimalMin(value = "0.0", message = "Rating average must be at least 0.0")
    @DecimalMax(value = "5.0", message = "Rating average must not exceed 5.0")
    @Column(name = "rating_average", nullable = false, precision = 2, scale = 1)
    private Double ratingAverage = 0.0;

    @NotNull(message = "Rating count is required")
    @Min(value = 0, message = "Rating count must be at least 0")
    @Column(name = "rating_count", nullable = false)
    private Integer ratingCount = 0;
}