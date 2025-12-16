package com.michaelec19.api_character_sheet.model;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * Represents the six core Ability Scores (Strength, Dexterity, Constitution,
 * Intelligence, Wisdom, Charisma)
 * and the Experience Points of the character.
 * @author Michaelec19
 * @since 1.0
 */
@Embeddable
public class Stats {

    // INSTANCE FIELDS
    @Column(name = "experience_Points")
    private int experiencePoints;

    @Column(name = "strength")
    private int strength;

    @Column(name = "dexterity")
    private int dexterity;

    @Column(name = "constitution")
    private int constitution; 

    @Column(name = "intelligence")
    private int intelligence; 

    @Column(name = "wisdom")
    private int wisdom;
    
    @Column(name = "charisma")
    private int charisma;

   // CONSTRUCTORS

    /**
     * No-argument constructor required for serialization/deserialization.
     */
    public Stats() {
    } 

    /**
     * Full constructor for initializing all ability scores and XP.
     * @param experiencePoints The current total experience points.
     * @param strength The Strength ability score.
     * @param dexterity The Dexterity ability score.
     * @param constitution The Constitution ability score.
     * @param intelligence The Intelligence ability score.
     * @param wisdom The Wisdom ability score.
     * @param charisma The Charisma ability score.
     */
    public Stats(int experiencePoints, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.experiencePoints = experiencePoints;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    // GETTER  AND SETTERS

    /**
     * Retrieves the current experience points (XP).
     * @return The experience points.
     */
    public int getExperiencePoints() {
        return experiencePoints;
    }

    /**
     * Sets the current experience points (XP).
     * @param experiencePoints The new XP value.
     */
    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    /**
     * Retrieves the Strength ability score.
     * @return The Strength score.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Sets the Strength ability score.
     * @param strength The Strength score to set.
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Retrieves the Dexterity ability score.
     * @return The Dexterity score.
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * Sets the Dexterity ability score.
     * @param dexterity The Dexterity score to set.
     */
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    
    /**
     * Retrieves the Constitution ability score.
     * @return The Constitution score.
     */
    public int getConstitution() {
        return constitution;
    }

    /**
     * Sets the Constitution ability score.
     * @param constitution The Constitution score to set.
     */
    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }
    
    /**
     * Retrieves the Intelligence ability score.
     * @return The Intelligence score.
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * Sets the Intelligence ability score.
     * @param intelligence The Intelligence score to set.
     */
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    /**
     * Retrieves the Wisdom ability score.
     * @return The Wisdom score.
     */
    public int getWisdom() {
        return wisdom;
    }

    /**
     * Sets the Wisdom ability score.
     * @param wisdom The Wisdom score to set.
     */
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    
    /**
     * Retrieves the Charisma ability score.
     * @return The Charisma score.
     */
    public int getCharisma() {
        return charisma;
    }

    /**
     * Sets the Charisma ability score.
     * @param charisma The Charisma score to set.
     */
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
}
