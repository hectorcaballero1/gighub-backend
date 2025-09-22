package org.example.gighub.artist.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.gighub.user.domain.User;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "artists")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Artist extends User {

    @NotBlank(message = "Artist name is required")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    @Column(nullable = false, length = 100)
    private String name;

    @Size(max = 1000, message = "Description must not exceed 1000 characters")
    @Column(length = 1000)
    private String description;

    @NotBlank(message = "Genre is required")
    @Size(max = 50, message = "Genre must not exceed 50 characters")
    @Column(nullable = false, length = 50)
    private String genre;

    @Size(max = 500, message = "Profile photo URL must not exceed 500 characters")
    @Column(name = "profile_photo_url", length = 500)
    private String profilePhotoUrl;

    @Size(max = 20, message = "Phone must not exceed 20 characters")
    @Column(length = 20)
    private String phone;

    @ElementCollection
    @CollectionTable(
        name = "artist_videos",
        joinColumns = @JoinColumn(name = "artist_id")
    )
    @Column(name = "youtube_url", length = 500)
    @Size(max = 5, message = "Maximum 5 YouTube URLs allowed")
    private List<@Size(max = 500, message = "YouTube URL must not exceed 500 characters") String> youtubeUrls = new ArrayList<>();

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