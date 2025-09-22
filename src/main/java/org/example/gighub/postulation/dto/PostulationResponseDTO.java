package org.example.gighub.postulation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.gighub.artist.dto.ArtistResponseDTO;
import org.example.gighub.event.dto.EventResponseDTO;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class PostulationResponseDTO {

    private Long id;
    private EventResponseDTO event;
    private ArtistResponseDTO artist;
    private String status; // "PENDING" | "ACCEPTED" | "REJECTED"
    private LocalDateTime createdAt;
}