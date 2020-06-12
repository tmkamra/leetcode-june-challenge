package com.ds.binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomizedSet {

	Map< Integer, Integer> hm;
	List<Integer> list;
	
	public static void main(String[] args) 
	{
		RandomizedSet obj = new RandomizedSet();
	}
	
	/** Initialize your data structure here. */
    public RandomizedSet() 
    {
    	hm = new HashMap<Integer, Integer>();
        list = new ArrayList<Integer>();
        boolean insert1 = insert(5);
        boolean insert2 = insert(5);
        boolean insert3 = insert(7);
        boolean insert4 = insert(8);
		boolean remove1 = remove(9);
		int random1 = getRandom();
		System.out.println(insert1+" "+insert2+" "+insert3+" "+insert4+" "+remove1+" "+random1);
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) 
    {
    	if(list.contains(val))
    		return false;
    	list.add(val);
    	hm.put(val, list.size()-1);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) 
    {
    	if(!list.contains(val))
    		return false;
    	int index = hm.get(val);
    	Collections.swap(list, index, list.size()-1);
    	int swappedValue = list.get(index);
    	hm.put(swappedValue, index);
    	list.remove(list.size()-1);
    	hm.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random random = new Random();
        int randomNumber = random.nextInt(list.size());
        return list.get(randomNumber);
    }

}