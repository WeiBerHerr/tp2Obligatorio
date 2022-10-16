package PackageProyect;

import java.util.HashMap;

public class double_hash <K extends Number, V, T> {
    HashMap<K, V> mp1;
    HashMap<K, T> mp2;

    public double_hash() {
        mp1 = new HashMap<>();
        mp2 = new HashMap<>();
    }
    public void addFirst (K key, V value){
        mp1.put(key, value);

    }
    public void removeFirst (K key, V value){
        mp1.remove(key, value);

    }
    public void addSecond(K key, T value){
        mp2.put(key, value);

    }
    public void removeSecond(K key, T value){
        mp2.remove(key, value);

    }









}
