package com.michaelec19.api_character_sheet.model;

/**
 * The core entity representing a Dungeons & Dragons 5th Edition character.
 * This model uses Composition to group related data into sub-classes 
 * (BasicInfo, Stats, CombatStats).
 *
 * This class is the primary resource managed by the API REST.
 * @author Michaelec19
 * @since 1.0
 */
public class PlayerCharacter {

    // INSTANCE FIELDS

    private  long id;
    
    /** Basic identifying information like Name, Class, Level, and Race.
     * Composited from the BasicInfo class.
     */
    private  BasicInfo basicInfo;
    
    /** Core ability scores (STR, DEX, CON, INT, WIS, CHA) and Experience Points (XP). 
     * Composited from the Stats class.
     */
    private Stats stats;
    
    /** * Combat-related values such as Armor Class, Initiative, Speed, Hit Points and ProficiencyBonus.
     * Composited from the CombatStats class.
     */
    private CombatStats combatStats;

    // CONSTRUCTORS

    /**
     * No-argument constructor required for JSON deserialization (Jackson)
     * and object mapping in the persistence layers (JDBC/JPA).
     */
    public PlayerCharacter() {  
    }

    /**
     * Full constructor for creating a complete Character instance.
     * @param id The unique identifier for the database.
     * @param basicInfo Object containing name, class, level, and race.
     * @param stats Object containing all six ability scores and XP.
     * @param combatStats Object containing Armor Class, Initiative, Speed, Hit Points and ProficiencyBonus.
     */
    public PlayerCharacter(long id, BasicInfo basicInfo, Stats stats, CombatStats combatStats) {
        this.id = id;
        this.basicInfo = basicInfo;
        this.stats = stats; 
        this.combatStats = combatStats;
    }

    // GETTER  AND SETTERS

    /**
     * Retrieves the unique identifier of the character.
     * @return The character's unique ID.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the character.
     * @param id The ID to set.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Retrieves the BasicInfo object containing fundamental character details.
     * @return The BasicInfo object.
     */
    public BasicInfo getBasicInfo() {
        return basicInfo;
    }
    
    /**
     * Sets the BasicInfo object for the character.
     * @param basicInfo The BasicInfo object to set.
     */
    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    /**
     * Retrieves the Stats object containing ability scores and XP.
     * @return The Stats object.
     */
    public Stats getStats() {
        return stats;
    }

    /**
     * Sets the Stats object for the character.
     * @param stats The Stats object to set.
     */
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    /**
     * Retrieves the CombatStats object containing combat-related values.
     * @return The CombatStats object.
     */
    public CombatStats getCombatStats() {
        return combatStats;
    }

    /**
     * Sets the CombatStats object for the character.
     * @param combatStats The CombatStats object to set.
     */
    public void setCombatStats(CombatStats combatStats) {
        this.combatStats = combatStats;
    }
}


