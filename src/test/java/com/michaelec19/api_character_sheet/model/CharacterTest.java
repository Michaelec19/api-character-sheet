package com.michaelec19.api_character_sheet.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 * Unit tests for the main Character entity and its composite components (BasicInfo, Stats, CombatStats).
 * These tests ensure proper functioning of constructors and adherence to encapsulation principles.
 * @author Michaelec19
 * @since 1.0
 */
public class CharacterTest {

    /**
     * Tests the No-argument constructor.
     * This is essential for JSON deserialization (Jackson) and JDBC object mapping.
     */
    @Test
    public void testNoArgsConstructor() {
        // When an instance of the character is created using the no-arg constructor
        Character character = new Character();

        // Then, the instance must not be null
        assertNotNull("Character instance must not be null", character);

        // Primitive fields (like ID) must be initialized to their default values (0 for long)
        assertEquals("Default ID must be 0L", 0L, character.getId());
        
        // Composite objects must be null before being set
        assertNull("BasicInfo should be null by default", character.getBasicInfo());
        assertNull("Stats should be null by default", character.getStats());
    }

    /**
     * Tests the Full constructor to ensure all fields and composite objects are initialized correctly.
     */
    @Test
    public void testFullConstructor() {
        // 1. Test Data setup
        BasicInfo info = new BasicInfo("Therival", "Druid", 10, "Elf");
        Stats stats = new Stats(46000, 16, 14, 15, 8, 12, 10);
        CombatStats combat = new CombatStats(18, 5, 30, 80, 4);

        // 2. When the character is created using the full constructor
        Character character = new Character(1L, info, stats, combat);

        // 3. Assertions (Verifications)
        
        // ID verification
        assertEquals("The ID should match the input value", 1L, character.getId());
        
        // BasicInfo Composition verification
        assertNotNull("BasicInfo should not be null", character.getBasicInfo());
        assertEquals("The BasicInfo name should match the input", "Therival", character.getBasicInfo().getName());
        
        // Stats Composition verification
        assertNotNull("Stats should not be null", character.getStats());
        assertEquals("The Strength score should match the input", 16, character.getStats().getStrength());
        
        // CombatStats Composition verification
        assertNotNull("CombatStats should not be null", character.getCombatStats());
        assertEquals("The AC score should match the input", 18, character.getCombatStats().getArmorClass());
    }

    /**
     * Tests the correct functioning of all getters and setters for the main Character class.
     */
    @Test
    public void testSettersAndGetters() {
        // 1. Create a base instance
        Character character = new Character();
        
        // 2. Data to set
        long newId = 2L;
        BasicInfo newInfo = new BasicInfo("Calem", "Elf", 5, "Elf");
        Stats newStats = new Stats(500, 10, 20, 12, 12, 12, 12);
        
        // 3. Invoke Setters
        character.setId(newId);
        character.setBasicInfo(newInfo);
        character.setStats(newStats);
        
        // 4. Verification using Getters
        assertEquals("The ID setter/getter failed", newId, character.getId());
        
        assertNotNull("The BasicInfo setter failed (object is null)", character.getBasicInfo());
        assertEquals("The BasicInfo setter/getter failed (Name).", "Calem", character.getBasicInfo().getName());
        
        assertNotNull("The Stats setter failed (object is null)", character.getStats());
        assertEquals("The Stats setter/getter failed (DEX)", 20, character.getStats().getDexterity());
    }
}