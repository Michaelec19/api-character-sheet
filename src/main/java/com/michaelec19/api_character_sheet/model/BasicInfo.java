package com.michaelec19.api_character_sheet.model;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * Represents the fundamental identity and metadata of a character
 * (Name, Class, Level, Race). This class is composed within the
 * main Character entity.
 * @author Michaelec19
 * @since 1.0
 */

@Embeddable
public class BasicInfo {

    // INSTANCE FIELDS
    @Column(name = "character_name")
    private  String name;

    @Column(name = "class")
    private  String characterClass;

    @Column(name = "character_level")
    private  int level;
    
    @Column(name = "race")
    private  String race;


    // CONSTRUCTORS

    /**
     * No-argument constructor required for serialization/deserialization.
     */
    public BasicInfo() {
    }

    /**
     * Full constructor to create an instance with all data fields.
     * @param name The character's name.
     * @param characterClass The class or profession (e.g "Wizard").
     * @param level The current level of the character.
     * @param race The character's race (e.g "Human", "Elf").
     */
    public BasicInfo(String name, String characterClass, int level, String race) {
        this.name = name;
        this.characterClass = characterClass;
        this.level = level;
        this.race = race;
    }


    // GETTER  AND SETTERS
    
    /**
     * Retrieves the character's name.
     * @return The character's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the character's name.
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the character's class.
     * @return The class string.
     */
    public String getCharacterClass() {
        return characterClass;
    }

    /**
     * Sets the character's class.
     * @param characterClass The class string to set.
     */
    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    /**
     * Retrieves the character's level.
     * @return The level as an integer.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the character's level.
     * @param level The level to set.
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Retrieves the character's race.
     * @return The race string.
     */
    public String getRace() {
        return race;
    }

    /**
     * Sets the character's race.
     * @param race The race string to set.
     */
    public void setRace(String race) {
        this.race = race;
    }

}



