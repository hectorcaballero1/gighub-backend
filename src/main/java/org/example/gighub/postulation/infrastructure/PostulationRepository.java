package org.example.gighub.postulation.infrastructure;

import org.example.gighub.postulation.domain.Postulation;
import org.example.gighub.postulation.domain.PostulationStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostulationRepository extends JpaRepository<Postulation, Long> {

    Page<Postulation> findByEventId(Long eventId, Pageable pageable);

    Page<Postulation> findByArtistId(Long artistId, Pageable pageable);

    boolean existsByEventIdAndArtistId(Long eventId, Long artistId);

    Page<Postulation> findByEventIdAndStatus(Long eventId, PostulationStatus status, Pageable pageable);
}