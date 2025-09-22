package org.example.gighub.postulation.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class PostulationCreateRequestDTO {

    @NotNull(message = "Event ID is required")
    private Long eventId;

    @NotNull(message = "Artist ID is required")
    private Long artistId;
}