package org.example.gighub.artist.infrastructure;

import org.example.gighub.artist.domain.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {

    Page<Artist> findByGenreContainingIgnoreCase(String genre, Pageable pageable);

    Page<Artist> findByOrderByRatingAverageDesc(Pageable pageable);
}