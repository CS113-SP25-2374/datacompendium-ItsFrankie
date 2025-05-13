package CS113.Other.HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap<K,V> implements MapInterface<K,V>
{
    final int BUCKET_COUNT = 16;
    LinkedList[] buckets = new LinkedList[BUCKET_COUNT];

    // Arraylist[linkedlist]
    //
    // [0, 1, 2, 3, 4, 5, 6, 7]
    //  1  1
    //  2  2
    //  3  3

    public HashMap()
    {
        for(int i = 0; i < buckets.length; i++)
        {
            buckets[i] = new LinkedList<>();
        }
    }

    public int size()
    {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public ArrayList<K> keySet() {
        return null;
    }

    @Override
    public ArrayList<V> values() {
        return null;
    }

//    class Entry<K,V> implements MapInterface.Entry<K,V>
//    {
//        // Returns the number of key-value mappings in this map
//        @Override
//        int size()
//        {
//            return this.count;
//        }
//
//        // Returns true if this map contains no key-value mappings
//        @Override
//        boolean isEmpty()
//        {
//
//        }
//
//        // Returns true if this map contains a mapping for the specified key
//        @Override
//        public boolean containsKey(K key)
//        {
//
//        }
//
//        // Returns true if this map maps one or more keys to the specified value
//        @Override
//        public boolean containsValue(V value)
//        {
//
//        }
//
//        // Returns the value to which the key is mapped, or null if not found
//        @Override
//        V get(K key)
//        {
//            return this.key;
//        }
//
//        // Associates the specified value with the specified key in this map
//        @Override
//        V put(K key, V value)
//        {
//            //int index1 = getHash(key);
//            return null;
//        }
//
//        // Removes the mapping for a key from this map if it is present
//        @Override
//        V remove(K key)
//        {
//            return null;
//        }
//
//        // Removes all of the mappings from this map
//        @Override
//        void clear()
//        {
//
//        }
//
//        // Returns an ArrayList of the keys contained in this map
//        @Override
//        ArrayList<K> keySet()
//        {
//
//        }
//
//        // Returns an ArrayList of the values contained in this map
//        @Override
//        ArrayList<V> values()
//        {
//
//        }
//
//        // Interface for a single key-value pair (used in entrySet)
//        @Override
//        interface Entry<K, V>
//        {
//
//        }
//    }
}