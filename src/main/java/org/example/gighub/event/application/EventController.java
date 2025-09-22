package org.example.gighub.event.application;

import org.example.gighub.event.dto.EventCreateRequestDTO;
import org.example.gighub.event.dto.EventResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @PostMapping
    public ResponseEntity<EventResponseDTO> createEvent(@RequestBody EventCreateRequestDTO request) {
        // TODO: implementar - Crear Evento
        return null;
    }

    @GetMapping
    public ResponseEntity<Page<EventResponseDTO>> getAvailableEvents(Pageable pageable) {
        // TODO: implementar - Listar Eventos Disponibles (Paginado)
        // Solo eventos donde isActive = true
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventResponseDTO> getEventDetail(@PathVariable Long id) {
        // TODO: implementar - Ver Detalle de Evento
        return null;
    }

    @GetMapping("/contractor/{contractorId}")
    public ResponseEntity<Page<EventResponseDTO>> getEventsByContractor(@PathVariable Long contractorId, Pageable pageable) {
        // TODO: implementar - Ver Eventos de un Contractor (Paginado)
        // Todos los eventos de ese contractor (activos e inactivos)
        return null;
    }
}