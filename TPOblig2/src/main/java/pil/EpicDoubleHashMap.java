package TPOblig2.src.main.java.pil;

import java.util.HashMap;

public class EpicDoubleHashMap<K extends Number, V, T> {
    HashMap<K,V> firstType;
    HashMap<K,T> secondType;

    public EpicDoubleHashMap(){
        firstType = new HashMap<>();
        secondType = new HashMap<>();
    }

    public void addFirstType(K key, V value){
        firstType.put(key,value);
    }

    public void addSecondType(K key, T value){
        secondType.put(key,value);
    }

    public void addThirdType(K key, V value, T value2){
        firstType.put(key,value);
        secondType.put(key,value2);
    }

    public void remove(K key){
        firstType.remove(key);
        secondType.remove(key);
    }

    public HashMap<K,V> getFirstType(){
        return this.firstType;
    }

    public HashMap<K,T> getSecondType(){
        return this.secondType;
    }

    // public EpicDoubleHashMap<K,T,V> getThirdType(){}
    //TODO

}
