package org.example.gighub.review.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.gighub.event.dto.EventResponseDTO;
import org.example.gighub.user.dto.UserResponseDTO;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class ReviewResponseDTO {

    private Long id;
    private EventResponseDTO event;
    private UserResponseDTO reviewer;
    private UserResponseDTO reviewed;
    private Integer rating;
    private String comment;
    private LocalDateTime createdAt;
}