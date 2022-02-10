## JTE with Java Classes 2: ArrayList
---
### Description
In this lab we will cover how to iterate through an ArrayList of Java Objects using JTE.

---
### Steps

1. In src -> main -> java -> objects -> SeaCreature.java add at least three fields. One should be the name of the animal, the other two are left to you to decide. You can look at the sample output for ideas.
2. Create a constructor for the class.
3. Create getters for all the fields. These getters should be public so other files can access them.
4. In src -> main -> java -> Main.java, create an ArrayList of SeaCreature objects. This arraylist should be static and be created outside the main method.
5. Add at least 4 SeaCreature objects to your list. This should be done in the main method. See the ShoppingItems reference example in the same file.
6. Create a handler that will render seaCreatures.jte and send it your list of SeaCreature objects.
7. Create a route for the handler.
8. In src -> main -> jte -> seaCreatures.jte add the required imports and parameters. 
    * Remember to import java.util.* for the arraylist. 
    * Remember to use the same name for the parameter and the key for the singletonMap.
9.  Add a for loop inside the body tag that will loop through the sea creatures and display some text about them.
    * Remember to use the correct for loop syntax. 
    * Remember to use the getters to display the information about sea creatures (For example: ${seaCreature.getName()})

---
### Sample Output
Some facts about my favorite sea creatures:
* Blue Whales have a size of 90 feet and are blue-gray in color.
* Starfish have a size of 3.33 feet and are orange in color.
* Anglerfish have a size of 1.1 feet and are black in color.
* Bottlenose Dolphins have a size of 8.9 feet and are gray in color.
---
