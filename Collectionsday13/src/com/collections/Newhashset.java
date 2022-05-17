package com.collections;
import java.util.*;

public class Newhashset {
	
	public static void main(String[] args) {
		//type safety
		// default collections are generic wider or widest
		HashSet colours =new HashSet() ;
		colours.add("blue");
		colours.add("sky blue");
		colours.add("yellow");
		colours.add("green");
		colours.add("blue");
		colours.add("Red");
		System.out.println(colours);
		System.out.println(colours.size());
		System.out.println(colours.toString());
		
		//Iterator iter=colours.
		
		
		for( Object color:colours)
		{
			System.out.println(color);
			
		}
		
		
		
		HashSet<String> h=new HashSet();
		h.add("to do");
		h.add("what");
		h.add("u want");
		System.out.println(h);
		
		
		
		
		
	}

	
	
}
