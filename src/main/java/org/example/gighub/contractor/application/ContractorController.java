package org.example.gighub.contractor.application;

import org.example.gighub.contractor.dto.ContractorCreateRequestDTO;
import org.example.gighub.contractor.dto.ContractorResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contractors")
public class ContractorController {

    @PostMapping
    public ResponseEntity<ContractorResponseDTO> createContractor(@RequestBody ContractorCreateRequestDTO request) {
        // TODO: implementar - Crear Contractor
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContractorResponseDTO> getContractorProfile(@PathVariable Long id) {
        // TODO: implementar - Ver Perfil Público de Contractor
        return null;
    }
}