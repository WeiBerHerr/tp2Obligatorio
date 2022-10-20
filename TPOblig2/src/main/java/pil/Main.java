package TPOblig2.src.main.java.pil;

public class Main {
    public static void main(String[] args) {

        EpicDoubleHashMap<Integer,String,Integer> map = new EpicDoubleHashMap<>();

        //Add an item to first type hashmap
        map.addFirstType(1, "Test");
        //Tries to add an existent key to first type hashmap.
        map.addFirstType(1, "ExceptionTest");

        //Add an item to second type hashmap
        map.addSecondType(2, 15);
        //Tries to add an existent key to second type hashmap.
        map.addSecondType(2, 76);

        //Add an item to third type hashmap
        map.addThirdType(3,"TestString",299);
        //Tries to add an existent key to third type hashmap.
        map.addThirdType(3,"TestException", 500);

        //Prints the item with the key 1 from first type.
        System.out.println(map.getValueFirstType(1));
        //Prints the item with the key 2 from second type.
        System.out.println(map.getValueSecondType(2));
        //Prints the item with the key 3 from third type.
        map.getValuesThirdType(3);

        //Gets all keys and values from first type.
        System.out.println("ValuesFirstMap " + map.getAllValuesFirstType());
        //Gets all keys and values from second type.
        System.out.println("ValuesSecondMap " + map.getAllValuesSecondType());

        //Remove the item with the key 1 from first map.
        map.removeItemFirstType(1);
        //Remove the item with the key 3 from third map.
        map.removeItemThirdType(3);

        //Gets all keys and values from first type.
        System.out.println("ValuesFirstMap " + map.getAllValuesFirstType());
        //Gets all keys and values from second type.
        System.out.println("ValuesSecondMap " + map.getAllValuesSecondType());

        //Tries to remove an item with an inexistent key.
        map.removeItemSecondType(4);

        map.addSecondType(6,5);
        System.out.println(map.valuesCounter());
    }
}
