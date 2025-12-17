package com.michaelec19.api_character_sheet.controller;

import com.michaelec19.api_character_sheet.model.PlayerCharacter;
import com.michaelec19.api_character_sheet.service.PlayerCharacterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController 
@RequestMapping(path = "/api/v1/characters") 
public class PlayerCharacterController {

    private final PlayerCharacterService playerCharacterService;

    public PlayerCharacterController(PlayerCharacterService playerCharacterService) {
        this.playerCharacterService = playerCharacterService;
    }

    @GetMapping
    public List<PlayerCharacter> getAll() {
        return playerCharacterService.getAllPlayerCharacters();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlayerCharacter> getById(@PathVariable("id") Long id) {
        return playerCharacterService.getPlayerCharacterById(id)
                .map(character -> new ResponseEntity<>(character, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<PlayerCharacter> save(@RequestBody PlayerCharacter character) {
        PlayerCharacter savedCharacter = playerCharacterService.saveOrUpdate(character);
        return new ResponseEntity<>(savedCharacter, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlayerCharacter> update(@PathVariable Long id, @RequestBody PlayerCharacter character) {
        try {
            PlayerCharacter updated = playerCharacterService.updatePlayerCharacter(id, character);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        playerCharacterService.deletePlayerCharacter(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}