package com.keyword;

import java.util.EnumMap;

enum Walk{NORTH,SOUTH,EAST,WEST}
public class EnumMapClone
{
    public static void main(String[] args)
    {
        EnumMap<Walk,String> map1 = new EnumMap<Walk, String>(Walk.class);
        EnumMap<Walk,String> map2 = new EnumMap<Walk, String>(Walk.class);
        map1.put(Walk.NORTH,"N");
        map1.put(Walk.SOUTH,"S");
        map1.put(Walk.EAST,"E");
        map1.put(Walk.WEST,"W");
        System.out.println("Before Cloning: ");
        System.out.println("The Map 1 is :"+map1);
        System.out.println("The Map 2 is :"+map2);
        System.out.println("-------------------------------------------------------------");
        System.out.println("After Cloning: ");
        System.out.println("The Map 1 is :"+map1);
        map2=map1.clone();
        System.out.println("The Map 2 is :"+map2);
        System.out.println("-------------------------------------------------------------");



    }
}
