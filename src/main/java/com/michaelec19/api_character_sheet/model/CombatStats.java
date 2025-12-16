package com.michaelec19.api_character_sheet.model;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
/**
 * Represents the primary combat-related statistics of a character,
 * including Armor Class, Initiative, Speed, Hit Points and ProficiencyBonus.
 * @author Michaelec19
 * @since 1.0
 */

@Embeddable
public class CombatStats {

    // INSTANCE FIELDS

    @Column(name = "armor_Class")
    private int armorClass;

    @Column(name = "initiative")
    private int initiative;

    @Column(name = "speed")
    private int speed;

    @Column(name = "hit_Points")
    private int hitPoints;
    
    @Column(name = "proficiency_Bonus")
    private int proficiencyBonus;


    // CONSTRUCTORS

    /**
     * No-argument constructor required for serialization/deserialization.
     */
    public CombatStats() {
    }
    /**
     * Full constructor for initializing all combat stats.
     * @param armorClass The Armor Class (AC) value.
     * @param initiative The Initiative modifier.
     * @param speed The movement speed.
     * @param hitPoints The total Hit Points (HP).
     * @param proficiencyBonus The Proficiency Bonus.
     */
    public CombatStats(int armorClass, int initiative, int speed, int hitPoints, int proficiencyBonus) {
        this.armorClass = armorClass;
        this.initiative = initiative;
        this.speed = speed;
        this.hitPoints = hitPoints;
        this.proficiencyBonus = proficiencyBonus;
    }

    // GETTER  AND SETTERS

    /**
     * Retrieves the Armor Class (AC) value.
     * @return The Armor Class.
     */
    public int getArmorClass() {
        return armorClass;
    }

    /**
     * Sets the Armor Class (AC).
     * @param armorClass The AC score to set.
     */
    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    /**
     * Retrieves the Initiative modifier.
     * @return The Initiative value.
     */
    public int getInitiative() {
        return initiative;
    }

    /**
     * Sets the Initiative score.
     * @param initiative The Initiative score to set.
     */
    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    /**
     * Retrieves the movement speed.
     * @return The Speed value.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the movement speed.
     * @param speed The Speed value to set.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Retrieves the total Hit Points (HP).
     * @return The Hit Points value.
     */
    public int getHitPoints() {
        return hitPoints;
    }
    
    /**
     * Sets the total Hit Points (HP).
     * @param hitPoints The Hit Points value to set.
     */
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    /**
     * Retrieves the Proficiency Bonus.
     * @return The Proficiency Bonus value.
     */
    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    /**
     * Sets the Proficiency Bonus.
     * @param proficiencyBonus The Proficiency Bonus value to set.
     */
    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

}
