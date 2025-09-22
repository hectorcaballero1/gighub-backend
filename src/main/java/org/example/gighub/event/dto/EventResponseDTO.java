package org.example.gighub.event.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.gighub.artist.dto.ArtistResponseDTO;
import org.example.gighub.contractor.dto.ContractorResponseDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class EventResponseDTO {

    private Long id;
    private String title;
    private String description;
    private LocalDate eventDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private String eventType;
    private String genreRequested;
    private Double budget;
    private String address;
    private Boolean isActive;
    private ContractorResponseDTO contractor;
    private ArtistResponseDTO selectedArtist;
    private LocalDateTime createdAt;
}