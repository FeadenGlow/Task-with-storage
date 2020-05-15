package com.company;

public class Storage<I,B> {
    private I id[] = (I[]) new Object[10];
    private B item[] = (B[]) new Object[10];
    private int counter = 0;
    public void put(I idg, B itemg){
        id[counter] = idg;
        item[counter] = itemg;
        counter++;
    }
    public B get(I idg){
        for(int i = 0; i < id.length; i++){
            if(id[i] == idg){
                return item[i];
            }
        }
        return item[0];
    }
}
