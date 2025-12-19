package com.michaelec19.api_character_sheet.model;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
/**
 * Manages the six core ability scores and progression metrics.
 * This component tracks Strength, Dexterity, Constitution, Intelligence, 
 * Wisdom, and Charisma, which form the mathematical basis for most 
 * character actions and saving throws.
 * @author Michaelec19
 * @since 2.0
 */

@Embeddable
public class CombatStats {

    @Column(name = "armor_class")
    private int armorClass;

    private int initiative;

    private int speed;

    @Column(name = "hit_points")
    private int hitPoints;
    
    @Column(name = "proficiency_bonus")
    private int proficiencyBonus;


    public CombatStats() {
    }
    
    public CombatStats(int armorClass, int initiative, int speed, int hitPoints, int proficiencyBonus) {
        this.armorClass = armorClass;
        this.initiative = initiative;
        this.speed = speed;
        this.hitPoints = hitPoints;
        this.proficiencyBonus = proficiencyBonus;
    }

    public int getArmorClass() {
        return armorClass;
    }
    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getInitiative() {
        return initiative;
    }
    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHitPoints() {
        return hitPoints;
    }
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }
    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

}
