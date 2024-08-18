package com.ust.gitrepo;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateCharCountMap {

	
 void getDuplicateCharMap(String str) {
		// TODO Auto-generated method stub
		try {
		char []strArr=str.toCharArray();
		HashMap <String,Integer> hp=new HashMap<>();
		for(char c:strArr) {
			
			if(hp.containsKey(Character.toString(c).toLowerCase())){
				hp.put(Character.toString(c).toLowerCase(), hp.get(Character.toString(c).toLowerCase())+1);
			}
			else
			{
				hp.put(Character.toString(c).toLowerCase(), 1);
			}
		}
		
		System.out.println("Duplicate Letters");
		for(Entry<String, Integer> entry:hp.entrySet())
		{
			if(entry.getValue()>1) {
			System.out.println(entry.getKey() +": repeated "+entry.getValue()+" times");
			}
		}
		}catch(Exception e)
		{
			System.out.println("EXception "+e);
		}
		
	}

}
