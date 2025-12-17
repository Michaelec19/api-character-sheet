package com.michaelec19.api_character_sheet.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.michaelec19.api_character_sheet.model.PlayerCharacter;

@Repository

public interface  PlayerCharacterRepository extends JpaRepository<PlayerCharacter, Long> {

}
