package com.example.Dream.SpringConceptsBasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    @Autowired
    Sorting sorting;

    BinarySearch(Sorting sorting)
    {
        this.sorting = sorting;
    }

    public int Search()
    {
        //Sorting
        sorting.sort();
        return 12;
    }


}
