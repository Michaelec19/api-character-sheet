package com.michaelec19.api_character_sheet.service;

import com.michaelec19.api_character_sheet.model.PlayerCharacter;
import com.michaelec19.api_character_sheet.repository.PlayerCharacterRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerCharacterService {

    private final PlayerCharacterRepository repository;

    public PlayerCharacterService(PlayerCharacterRepository repository) {
        this.repository = repository;
    }

    public List<PlayerCharacter> getAllPlayerCharacters() {
        return repository.findAll();
    }

    public Optional<PlayerCharacter> getPlayerCharacterById(Long id) {
        return repository.findById(id);
    }

    public PlayerCharacter saveOrUpdate(PlayerCharacter character) {
        return repository.save(character);
    }

    public PlayerCharacter updatePlayerCharacter(Long id, PlayerCharacter updatedCharacter) {
    return repository.findById(id)
            .map(character -> {
    
                updatedCharacter.setId(id);
                return repository.save(updatedCharacter);
            })
            .orElseThrow(() -> new RuntimeException("Personaje no encontrado con id: " + id));
}

    public void deletePlayerCharacter(Long id) {
        repository.deleteById(id);
    }
}