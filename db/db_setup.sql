-- SCRIPT: db_setup.sql

-- 1. creation of the database and main table for D&D character sheets
-- drop existing database if exists and create a new one for testing
DROP DATABASE IF EXISTS dnd_db;
CREATE DATABASE dnd_db;
USE dnd_db;

-- 2. creation of the main table (characters)

CREATE TABLE characters (
    -- Identity (Map Character.id)
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    
    -- Basic Info (Map BasicInfo)
    character_name VARCHAR(100) NOT NULL,
    class VARCHAR(50) NOT NULL,
    character_level INT NOT NULL,
    race VARCHAR(50) NOT NULL,
    
    -- Stats (MapStats)
    experience_Points INT,
    strength INT NOT NULL,
    dexterity INT NOT NULL,
    constitution INT NOT NULL,
    intelligence INT NOT NULL,
    wisdom INT NOT NULL,
    charisma INT NOT NULL,
    
    -- Combat Stats (Map CombatStats)
    armor_class INT,
    initiative INT,
    speed INT,
    hit_point INT,
    proficiency_bonus INT,

);

-- 3. first test data insertion
-- 
INSERT INTO characters 
    (character_name, class, character_level, race, strength, dexterity, constitution, intelligence, wisdom, charisma, experience_Points, armor_class, initiative, speed, hit_point, proficiency_bonus)
VALUES
    ('Therival', 'Druid', 5, 'Elf', 18, 10, 16, 8, 14, 12, 12000, 16, 0, 25, 45, 3),
    ('Calem', 'Warlock', 8, 'Tiefling', 10, 14, 13, 18, 16, 15, 30000, 12, 2, 30, 60, 3);