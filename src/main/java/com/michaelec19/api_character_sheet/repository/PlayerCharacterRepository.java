package com.michaelec19.api_character_sheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.michaelec19.api_character_sheet.model.PlayerCharacter;

/**
 * Data access layer for PlayerCharacter entities.
 * Provides standard CRUD operations and custom query methods 
 * through Spring Data JPA's proxy implementation.
 */
@Repository
public interface  PlayerCharacterRepository extends JpaRepository<PlayerCharacter, Long> {

}
