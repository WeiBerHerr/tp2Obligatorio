package pil;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        EpicDoubleHashMap<Integer,String,Integer> map = new EpicDoubleHashMap<>();

        map.addFirstType(1, "Test");
        map.addSecondType(2, 7);
        map.addThirdType(3,"TestString",299);

        HashMap<Integer,String> hashMapFirstType = map.getFirstType();

        System.out.println(map.getFirstType());
        System.out.println(map.getSecondType());
        System.out.println(map.getThirdType());
    }
}
