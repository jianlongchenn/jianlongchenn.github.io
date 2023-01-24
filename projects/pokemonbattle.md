---
layout: project
type: project
image: img/battle.webp
title: "Pokemonbattle"
date: 2023
published: true
labels:
  - java
summary: "A project made in 2021 at KCC"
---


  <img width="400px" src="../img/pokemonbattle.jpeg" >


Pokémon Battle is a program in which two Pokémon are selected to fight with each other. First set the attributes of the Pokémon, including HP, attack power, defense power and so on. The Pokémon of both sides will fight until the HP reaches zero. It also includes attribute restraint. For example, water-type Pokémon will cause more damage to fire-type Pokémon, and electric-type Pokémon will cause more damage to water-type Pokémon.

Here is some code that illustrates how we read values from the line sensors:

```cpp
public class Charmeleon extends Charmander {

   /** The minimum attack power for species. */
   static final int BASE_ATTACK_POWER = 158;
   /** The minimum defense power for species. */
   static final int BASE_DEFENSE_POWER = 126;
   /** The minimum stamina power for species. */
   static final int BASE_STAMINA_POWER = 151;
   
   /** Constructor with no name. */
   public Charmeleon() {
      super("Charmeleon", "Charmeleon", 5, 1.1, 19.0, FIRE_TYPE, "", BASE_ATTACK_POWER, 
          BASE_DEFENSE_POWER, BASE_STAMINA_POWER);   
   }
   
   /** Constructor with name.
   * @param name The user-defined name.
   */
   public Charmeleon(String name) {
         super("Charmeleon", name, 5, 1.1, 19.0, FIRE_TYPE, "", BASE_ATTACK_POWER, 
             BASE_DEFENSE_POWER, BASE_STAMINA_POWER);
   }
```

You can learn more at the [UH Micromouse News Announcement](https://github.com/jianlongchenn/jianlongchenn.github.io/blob/main/Charmeleon.java).
