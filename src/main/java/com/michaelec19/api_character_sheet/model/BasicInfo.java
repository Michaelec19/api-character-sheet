package com.michaelec19.api_character_sheet.model;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * Represents the fundamental identity and metadata of a character
 *  Contains immutable-like traits such as name, race, and class. 
 * @author Michaelec19
 * @since 2.0
 */
@Embeddable
public class BasicInfo {

    @Column(name = "character_name")
    private String name;

    @Column(name = "character_class")
    private String characterClass;

    @Column(name = "character_level")
    private int level;
    
    private String race;


    public BasicInfo() {
    }

    public BasicInfo(String name, String characterClass, int level, String race) {
        this.name = name;
        this.characterClass = characterClass;
        this.level = level;
        this.race = race;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterClass() {
        return characterClass;
    }
    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }

}



