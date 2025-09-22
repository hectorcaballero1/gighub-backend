package org.example.gighub.postulation.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.gighub.artist.domain.Artist;
import org.example.gighub.event.domain.Event;

import java.time.LocalDateTime;

@Entity
@Table(
    name = "postulations",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"event_id", "artist_id"})
    }
)
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Postulation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Event is required")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @NotNull(message = "Artist is required")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artist_id", nullable = false)
    private Artist artist;

    @NotNull(message = "Status is required")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private PostulationStatus status = PostulationStatus.PENDING;

    @NotNull(message = "Created at is required")
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        if (status == null) {
            status = PostulationStatus.PENDING;
        }
    }
}