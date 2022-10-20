package TPOblig2.src.main.java.pil;

import TPOblig2.src.main.java.exceptions.ExistingKeyExc;
import TPOblig2.src.main.java.exceptions.NonexistentKeyExc;

import java.util.ArrayList;
import java.util.HashMap;

public class EpicDoubleHashMap<K extends Number, V, T> {
    private HashMap<K, V> firstType;
    private HashMap<K, T> secondType;

    private int vValueCounter;
    private int tValueCounter;
    private ArrayList <V> valueCounterV = new ArrayList<>();
    private ArrayList <T> valueCounterT = new ArrayList<>();

    private boolean repmap ;

    public EpicDoubleHashMap() {
        firstType = new HashMap<>();
        secondType = new HashMap<>();
        vValueCounter = 0;
        tValueCounter = 0;
    }

    public void addFirstType(K key, V value) {
        try {
            if (firstType.containsKey(key)) {
                throw new ExistingKeyExc();
            }
            valueCounterV.add(value);
            firstType.put(key, value);
            vValueCounter++;
        } catch (ExistingKeyExc e) {
            System.out.println(e.getMessage());
        }
    }

    public void addSecondType(K key, T value) {
        try {
            if (secondType.containsKey(key)) {
                throw new ExistingKeyExc();
            }
            valueCounterT.add(value);
            secondType.put(key, value);
            tValueCounter++;
        } catch (ExistingKeyExc e) {
            System.out.println(e.getMessage());
        }
    }

    public void addThirdType(K key, V value, T value2) {
        try {
            if (secondType.containsKey(key)) {
                throw new ExistingKeyExc();
            }
            firstType.put(key, value);
            secondType.put(key, value2);
            vValueCounter++;
            tValueCounter++;
        } catch (ExistingKeyExc e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeItemFirstType(K key) {
        try {
            if (firstType.containsKey(key)) {
                firstType.remove(key);
            } else if (!firstType.containsKey(key)) {
                throw new NonexistentKeyExc();
            }
        } catch (NonexistentKeyExc e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeItemSecondType(K key) {
        try {
            if (secondType.containsKey(key)) {
                secondType.remove(key);
            } else if (!secondType.containsKey(key)) {
                throw new NonexistentKeyExc();
            }
        } catch (NonexistentKeyExc e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeItemThirdType(K key){
        try {
            if (firstType.containsKey(key) && secondType.containsKey(key)) {
                firstType.remove(key);
                secondType.remove(key);
            } else if (!firstType.containsKey(key) && !secondType.containsKey(key)) {
                throw new NonexistentKeyExc();
            }
        } catch (NonexistentKeyExc e) {
            System.out.println(e.getMessage());
        }
    }
    public V getValueFirstType(K key) {
        String storeKey = key.toString();
        return (V) ("Key: " + storeKey + " Value: " + this.firstType.get(key));
    }

    public T getValueSecondType(K key) {
        String storeKey = key.toString();
        return (T) ("Key: " + storeKey + " Value: " + this.secondType.get(key));
    }

    public void getValuesThirdType(K key) {
        String storeKey = key.toString();
        System.out.println("Key: " + storeKey + " FirstValue: " + firstType.get(key) + " SecondValue: " + secondType.get(key));
    }

    public HashMap<K, V> getAllValuesFirstType() {
        return this.firstType;
    }

    public HashMap<K, T> getAllValuesSecondType() {
        return this.secondType;
    }

    public String valuesCounter(){
        String resultMessage = "";
        if (vValueCounter < tValueCounter){
            resultMessage = "There are more T values than V values in the hashmap.";
        } else if (vValueCounter > tValueCounter) {
            resultMessage ="There are more V values than T values in the hashmap.";
        }else if (vValueCounter == tValueCounter){
            resultMessage ="There are the same amount of T and V values in the hashmap.";
        }
        return resultMessage;
    }

    public boolean isRepmap() {
        return repmap;
    }

    private void setRepmap(boolean repmap) {
        this.repmap = repmap;
    }

    public void rMap(){

        for (int i =0 ; i<valueCounterT.size(); i++ ) {
            int counteres = 0;
            T vari ;
            vari = valueCounterT.get((Integer) i);

            for (int k = i + 1; k<valueCounterT.size(); k++ ) {
                    if (vari ==  valueCounterT.get((Integer) k+1)){
                        counteres ++;
                    }
            }
            if (counteres != 0) {
                repmap =  true;
                }
            else  {
                repmap = false;

            }
        }

    }
}
