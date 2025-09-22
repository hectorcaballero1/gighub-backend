package org.example.gighub.event.infrastructure;

import org.example.gighub.event.domain.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    Page<Event> findByIsActiveTrue(Pageable pageable);

    Page<Event> findByContractorId(Long contractorId, Pageable pageable);

    Page<Event> findByGenreRequestedContainingIgnoreCaseAndIsActiveTrue(String genre, Pageable pageable);

    Page<Event> findByEventDateAfterAndIsActiveTrue(LocalDate date, Pageable pageable);
}