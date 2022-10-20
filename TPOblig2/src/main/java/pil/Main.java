package pil;

import Models.Cat;
import Models.Dog;

public class Main {
    public static void main(String[] args) {

        EpicDoubleHashMap<Integer, Cat, Dog> map = new EpicDoubleHashMap<>();

        Cat cat1 = new Cat("Milo",5);
        Dog dog1 = new Dog("Luna",2);
        Cat cat2 = new Cat("Milo",5);
        Dog dog2 = new Dog("Luna",2);

        //Add an item to first type hashmap
        map.addFirstType(1,cat1);
        map.addFirstType(2,cat1);
        map.addFirstType(3,cat1);

        //Add an item to second type hashmap
        map.addSecondType(4, dog1);


        //Add an item to third type hashmap
        map.addThirdType(5,cat1,dog1);

        System.out.println(map.valuesRepeated(5));


        //Prints the item with the key 1 from first type.
        System.out.println("First Type (K, V)");
        map.getValueFirstType(1);
        //Prints the item with the key 2 from second type.
        System.out.println("Second Type (K, T)");
        map.getValueSecondType(4);
        //Prints the item with the key 3 from third type.
        System.out.println("Third Type (K, V, T)");
        map.getValuesThirdType(5);

        System.out.println();

        //Gets all keys and values from first type.
        System.out.println("ValuesFirstMap " + map.getAllValuesFirstType());
        //Gets all keys and values from second type.
        System.out.println("ValuesSecondMap " + map.getAllValuesSecondType());

        //Remove the item with the key 1 from first map.
        map.removeItem(1);


        //Gets all keys and values from first type.
        System.out.println("ValuesFirstMap " + map.getAllValuesFirstType());
        //Gets all keys and values from second type.
        System.out.println("ValuesSecondMap " + map.getAllValuesSecondType());

        System.out.println();

        //More T or V values
        System.out.println(map.valuesCounter());

        //Exceptions triggers

        //Tries to remove an item with an inexistent key.
        System.out.println("---------------------------------");
        System.out.println("Trigger nonexistent key exception:");
        map.removeItem(99);

        //Tries to add an existent key to first type hashmap.
        System.out.println("---------------------------------");
        System.out.println("Trigger existent key exception:");
        map.addFirstType(3, cat2);

        //Tries to get a value that does not exist.
        System.out.println("---------------------------------");
        System.out.println("Trigger nonexistent value exception:");
        map.getValueFirstType(45);

    }
}
