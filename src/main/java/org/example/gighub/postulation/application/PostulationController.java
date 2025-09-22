package org.example.gighub.postulation.application;

import org.example.gighub.postulation.dto.PostulationCreateRequestDTO;
import org.example.gighub.postulation.dto.PostulationResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/postulations")
public class PostulationController {

    @PostMapping
    public ResponseEntity<PostulationResponseDTO> createPostulation(@RequestBody PostulationCreateRequestDTO request) {
        // TODO: implementar - Crear Postulación
        return null;
    }

    @GetMapping("/event/{eventId}")
    public ResponseEntity<Page<PostulationResponseDTO>> getPostulationsByEvent(@PathVariable Long eventId, Pageable pageable) {
        // TODO: implementar - Ver Postulaciones de un Evento (Paginado)
        // Para que el contractor vea quién se postuló
        return null;
    }

    @PutMapping("/{id}/select")
    public ResponseEntity<PostulationResponseDTO> selectArtist(@PathVariable Long id) {
        // TODO: implementar - Seleccionar Artist
        // Lógica:
        // 1. Cambiar status de esa postulación a ACCEPTED
        // 2. Cambiar status de todas las otras postulaciones del mismo evento a REJECTED
        // 3. Actualizar Event.selectedArtist
        return null;
    }

    @GetMapping("/artist/{artistId}")
    public ResponseEntity<Page<PostulationResponseDTO>> getPostulationsByArtist(@PathVariable Long artistId, Pageable pageable) {
        // TODO: implementar - Ver Postulaciones de un Artist (Paginado)
        return null;
    }
}