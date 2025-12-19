package com.michaelec19.api_character_sheet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.michaelec19.api_character_sheet.model.PlayerCharacter;
import com.michaelec19.api_character_sheet.repository.PlayerCharacterRepository;

/**
 * Service layer responsible for handling the business logic of character sheets.
 * It acts as an intermediary between the REST controller and the data access layer.
 */
@Service
public class PlayerCharacterService {

    private final PlayerCharacterRepository repository;

    public PlayerCharacterService(PlayerCharacterRepository repository) {
        this.repository = repository;
    }

    /**
     * Retrieves all characters stored in the database.
     */
    public List<PlayerCharacter> getAllPlayerCharacters() {
        return repository.findAll();
    }

    /**
     * Finds a specific character by its unique identifier.
     */
    public Optional<PlayerCharacter> getPlayerCharacterById(Long id) {
        return repository.findById(id);
    }

    /**
     * Registers a new character in the system.
     */
    public PlayerCharacter createPlayerCharacter(PlayerCharacter character) {
        return repository.save(character);
    }

    /**
     * Updates the information of an existing character.
     * This method performs a field-by-field mapping to the persisted entity 
     * to ensure data integrity and preserve the original identifier.
     */
    public PlayerCharacter updatePlayerCharacter(Long id, PlayerCharacter updatedCharacter) {
        return repository.findById(id)
            .map(existingCharacter -> {
                existingCharacter.setBasicInfo(updatedCharacter.getBasicInfo());
                existingCharacter.setStats(updatedCharacter.getStats());
                existingCharacter.setCombatStats(updatedCharacter.getCombatStats());
                return repository.save(existingCharacter);
            })
            .orElseThrow(() -> new RuntimeException("Character not found with id: " + id));
    }

    /**
     * Removes a character record from the database by its unique ID.
     */
    public void deletePlayerCharacter(Long id) {
        repository.deleteById(id);
    }
}