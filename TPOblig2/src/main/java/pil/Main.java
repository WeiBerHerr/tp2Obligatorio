package pil;

public class Main {
    public static void main(String[] args) {

        EpicDoubleHashMap<Integer,String,Integer> map = new EpicDoubleHashMap<>();

        map.addFirstType(1, "Test");
        map.addSecondType(2, 7);
        map.addThirdType(3,"TestString",299);

        System.out.println(map.getValueFirstType(1));
        System.out.println(map.getValueSecondType(2));
        map.getValuesThirdType(3);

    }
}
