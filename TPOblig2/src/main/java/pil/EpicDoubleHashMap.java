package pil;

import exceptions.ExistingKeyExc;
import exceptions.NonexistentKeyExc;
import exceptions.NonexistentValueExc;
import exceptions.RepeatedValueExc;

import java.util.HashMap;

public class EpicDoubleHashMap<K extends Number, V, T> {
    private HashMap<K, V> firstType;
    private HashMap<K, T> secondType;
    private int vValueCounter;
    private int tValueCounter;
    private boolean flag;

    public EpicDoubleHashMap() {
        firstType = new HashMap<>();
        secondType = new HashMap<>();
        vValueCounter = 0;
        tValueCounter = 0;
        flag = false;
    }

    public void addFirstType(K key, V value) {
        int counter;
        try {
            if (firstType.containsKey(key) || secondType.containsKey(key)) {
                throw new ExistingKeyExc();
            }
            try {

                counter = 1;
                for (V valueIn : firstType.values()) {
                    if (valueIn.equals(value)) {
                        counter++;
                    }
                    if (counter > 2) {
                        throw new RepeatedValueExc();
                    }
                }
            } catch (RepeatedValueExc e) {
                System.out.println(e.getMessage());
            }

            firstType.put(key, value);
            vValueCounter++;
        } catch (ExistingKeyExc e) {
            System.out.println(e.getMessage());
        }
    }

    public void addSecondType(K key, T value) {
        int counter;
        try {
            if (secondType.containsKey(key) || firstType.containsKey(key)) {
                throw new ExistingKeyExc();
            }
            try {

                counter = 1;
                for (T valueIn : secondType.values()) {
                    if (valueIn.equals(value)) {
                        counter++;
                    }
                    if (counter > 2) {
                        throw new RepeatedValueExc();
                    }
                }
            } catch (RepeatedValueExc e) {
                System.out.println(e.getMessage());
            }
            secondType.put(key, value);
            tValueCounter++;
        } catch (ExistingKeyExc e) {
            System.out.println(e.getMessage());
        }
    }

    public void addThirdType(K key, V value, T value2) {
        int counter;
        try {
            if (secondType.containsKey(key) || firstType.containsKey(key)) {
                throw new ExistingKeyExc();
            }
            try {

                counter = 1;
                for (V valueIn : firstType.values()) {
                    if (valueIn.equals(value)) {
                        counter++;
                    }
                    if (counter > 2) {
                        throw new RepeatedValueExc();
                    }
                }
                for (T valueIn : secondType.values()) {
                    if (valueIn.equals(value)) {
                        counter++;
                    }
                    if (counter > 2) {
                        throw new RepeatedValueExc();
                    }
                }
            } catch (RepeatedValueExc e) {
                System.out.println(e.getMessage());
            }
            firstType.put(key, value);
            secondType.put(key, value2);
            vValueCounter++;
            tValueCounter++;
        } catch (ExistingKeyExc e) {
            System.out.println(e.getMessage());
        }
    }

    public void removeItem(K key) {
        try {
            if (!firstType.containsKey(key) && !secondType.containsKey(key)) {
                throw new NonexistentKeyExc();
            }
            firstType.remove(key);
            secondType.remove(key);
        } catch (NonexistentKeyExc e) {
            System.out.println(e.getMessage());
        }
    }

    public void getValueFirstType(K key) {
        try {
            if (!firstType.containsKey(key)) {
                throw new NonexistentValueExc();
            } else {
                System.out.println("Key: " + key + " Value: " + this.firstType.get(key));
            }
        } catch (NonexistentValueExc e) {
            System.out.println(e.getMessage());
        }
    }

    public void getValueSecondType(K key) {
        try {
            if (!secondType.containsKey(key)) {
                throw new NonexistentValueExc();
            } else {
                System.out.println("Key: " + key + " Value: " + this.secondType.get(key));
            }
        } catch (NonexistentValueExc e) {
            System.out.println(e.getMessage());
        }
    }

    public void getValuesThirdType(K key) {
        try {
            if (!firstType.containsKey(key) || !secondType.containsKey(key)) {
                throw new NonexistentValueExc();
            } else {
                System.out.println("Key: " + key + " FirstValue: " + firstType.get(key) +
                        " SecondValue: " + secondType.get(key));
            }
        } catch (NonexistentValueExc e) {
            System.out.println(e.getMessage());
        }
    }

    public HashMap<K, V> getAllValuesFirstType() {
        return this.firstType;
    }

    public HashMap<K, T> getAllValuesSecondType() {
        return this.secondType;
    }

    //aux
    public String valuesCounter() {
        String resultMessage = "";
        if (vValueCounter < tValueCounter) {
            resultMessage = "There are more T values than V values in the hashmap.";
        } else if (vValueCounter > tValueCounter) {
            resultMessage = "There are more V values than T values in the hashmap.";
        } else if (vValueCounter == tValueCounter) {
            resultMessage = "There are the same amount of T and V values in the hashmap.";
        }
        return resultMessage;
    }

    public int valuesRepeated(K key) {
        int valueCounter = 0;
        V vValues = firstType.get(key);
        T tValues = secondType.get(key);
        for (K k : firstType.keySet()) {
            if (firstType.get(key).equals(vValues)) {
                valueCounter++;
            }
        }
        for (K k : secondType.keySet()) {
            if (secondType.get(key).equals(tValues)) {
                valueCounter++;
            }
        }
        return valueCounter;
    }

    public boolean repMap() {
        int counter = 0;
        for (V valueOut : firstType.values()) {
            counter = 0;
            for (V valueIn : firstType.values()) {
                if (valueOut.equals(valueIn)) {
                    counter++;
                }
                if (counter > 1) {
                    return true;
                }
            }
        }

        for (V valueOut : firstType.values()) {
            counter = 0;
            for (V valueIn : firstType.values()) {
                if (valueOut.equals(valueIn)) {
                    counter++;
                }
                if (counter > 1) {
                    flag = true;
                }
            }
        }
        for (T valueOut : secondType.values()) {
            counter = 0;
            for (T valueIn : secondType.values()) {
                if (valueOut.equals(valueIn)) {
                    counter++;
                }
                if (counter > 1) {
                    flag = true;
                }
            }
        }
        return flag;
    }


}
