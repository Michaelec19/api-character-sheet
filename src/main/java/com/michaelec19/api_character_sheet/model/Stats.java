package com.michaelec19.api_character_sheet.model;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * Manages the six core ability scores and progression metrics.
 * This component tracks Strength, Dexterity, Constitution, Intelligence, 
 * Wisdom, and Charisma, which form the mathematical basis for most 
 * character actions and saving throws.
 * and the Experience Points of the character.
 * @author Michaelec19
 * @since 2.0
 */
@Embeddable
public class Stats {

    @Column(name = "experience_points")
    private int experiencePoints;

    private int strength;

    private int dexterity;

    private int constitution; 

    private int intelligence; 

    private int wisdom;
    
    private int charisma;


    public Stats() {
    } 

    public Stats(int experiencePoints, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.experiencePoints = experiencePoints;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }
    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    
    public int getConstitution() {
        return constitution;
    }
    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }
    
    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    
    public int getCharisma() {
        return charisma;
    }
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
}
