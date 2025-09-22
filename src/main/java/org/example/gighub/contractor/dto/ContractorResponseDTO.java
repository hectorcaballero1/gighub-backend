package org.example.gighub.contractor.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class ContractorResponseDTO {

    private Long id;
    private String email;
    private String name;
    private String description;
    private String phone;
    private String profilePhotoUrl;
    private Double ratingAverage;
    private Integer ratingCount;
    private String subscriptionType;
    private LocalDateTime createdAt;
}