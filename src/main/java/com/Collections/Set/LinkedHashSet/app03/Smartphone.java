package com.Collections.Set.LinkedHashSet.app03;

public class Smartphone {
    public int price;

    public String toString(){
        return "Smartphone="+price;
    }

    public int hashCode(){
        return price;
    }
}
