package org.example.gighub.artist.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class ArtistResponseDTO {

    private Long id;
    private String email;
    private String name;
    private String description;
    private String phone;
    private String profilePhotoUrl;
    private String genre;
    private List<String> youtubeUrls;
    private Double ratingAverage;
    private Integer ratingCount;
    private String subscriptionType;
    private LocalDateTime createdAt;
}