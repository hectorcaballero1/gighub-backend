package org.example.gighub.event.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class EventCreateRequestDTO {

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Description is required")
    private String description;

    @NotNull(message = "Event date is required")
    @Future(message = "Event date must be in the future")
    private LocalDate eventDate;

    @NotNull(message = "Start time is required")
    private LocalTime startTime;

    @NotNull(message = "End time is required")
    private LocalTime endTime;

    @NotBlank(message = "Event type is required")
    private String eventType;

    @NotBlank(message = "Genre requested is required")
    private String genreRequested;

    @NotNull(message = "Budget is required")
    @Min(value = 0, message = "Budget must be at least 0")
    private Double budget;

    @NotBlank(message = "Address is required")
    private String address;

    @NotNull(message = "Contractor ID is required")
    private Long contractorId;
}