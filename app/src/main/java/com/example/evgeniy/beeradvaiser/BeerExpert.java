package com.example.evgeniy.beeradvaiser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeniy on 01.04.2016.
 */
public class BeerExpert {

    public static List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();

        if(color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jali Pal Alie");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
