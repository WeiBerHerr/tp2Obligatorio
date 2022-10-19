package pil;

import java.util.HashMap;

public class EpicDoubleHashMap<K extends Number, V, T> {
    private HashMap<K, V> firstType;
    private HashMap<K, T> secondType;

    public EpicDoubleHashMap() {
        firstType = new HashMap<>();
        secondType = new HashMap<>();
    }

    public void addFirstType(K key, V value) {
        firstType.put(key, value);
    }

    public void addSecondType(K key, T value) {
        secondType.put(key, value);
    }

    public void addThirdType(K key, V value, T value2) {
        firstType.put(key, value);
        secondType.put(key, value2);
    }

    public void remove(K key) {
        firstType.remove(key);
        secondType.remove(key);
    }

    public V getValueFirstType(K key) {
        String storeKey = key.toString();
        return (V) ("Key: " + storeKey + " Value: " + this.firstType.get(key));
    }

    public T getValueSecondType(K key) {
        String storeKey = key.toString();
        return (T) ("Key: " + storeKey + " Value: " + this.secondType.get(key));
    }

    public void getValuesThirdType(K key){
        String storeKey = key.toString();
        System.out.println("Key: " + storeKey + " FirstValue: " + firstType.get(key) + " SecondValue: " +secondType.get(key));
    }

}
