package pil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class EpicDoubleHashMap<K extends Number, V, T> {
    private HashMap<K,V> firstType;
    private HashMap<K,T> secondType;

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

    public ArrayList getThirdType(){
        ArrayList list = new ArrayList();
        HashMap has = this.firstType;
        list.add(getFirstType().get(3));
        list.add(getSecondType().get(3));
        return list;

    }
    //TODO

}
