package org.example.gighub.artist.application;

import org.example.gighub.artist.dto.ArtistCreateRequestDTO;
import org.example.gighub.artist.dto.ArtistResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/artists")
public class ArtistController {

    @PostMapping
    public ResponseEntity<ArtistResponseDTO> createArtist(@RequestBody ArtistCreateRequestDTO request) {
        // TODO: implementar - Crear Artist
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArtistResponseDTO> getArtistProfile(@PathVariable Long id) {
        // TODO: implementar - Ver Perfil Público de Artist
        return null;
    }
}