package com.michaelec19.api_character_sheet.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.michaelec19.api_character_sheet.model.PlayerCharacter;
import com.michaelec19.api_character_sheet.service.PlayerCharacterService;

/**
 * REST Controller providing endpoints for character sheet management.
 * Maps HTTP actions to business logic defined in PlayerCharacterService.
 */
@RestController 
@RequestMapping(path = "/api/v1/characters") 
public class PlayerCharacterController {

    private final PlayerCharacterService playerCharacterService;

    public PlayerCharacterController(PlayerCharacterService playerCharacterService) {
        this.playerCharacterService = playerCharacterService;
    }

    /**
     * Retrieves all character records.
     */
    @GetMapping
    public ResponseEntity<List<PlayerCharacter>> getAll() {
        return ResponseEntity.ok(playerCharacterService.getAllPlayerCharacters());
    }

    /**
     * Retrieves a single character by ID.
     * @return 200 OK with the character, or 404 Not Found.
     */
    @GetMapping("/{id}")
    public ResponseEntity<PlayerCharacter> getById(@PathVariable Long id) {
        return playerCharacterService.getPlayerCharacterById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * Creates a new character sheet.
     * @return 201 Created status with the saved entity.
     */
    @PostMapping
    public ResponseEntity<PlayerCharacter> save(@RequestBody PlayerCharacter character) {
        PlayerCharacter savedCharacter = playerCharacterService.createPlayerCharacter(character);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCharacter);
    }

    /**
     * Updates an existing character's data.
     * @return 200 OK or 404 Not Found on failure.
     */
    @PutMapping("/{id}")
    public ResponseEntity<PlayerCharacter> update(@PathVariable Long id, @RequestBody PlayerCharacter character) {
        try {
            PlayerCharacter updated = playerCharacterService.updatePlayerCharacter(id, character);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * Deletes a character from the database.
     * @return 204 No Content upon success.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        playerCharacterService.deletePlayerCharacter(id);
        return ResponseEntity.noContent().build();
    }
}