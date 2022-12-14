package com.example.Dream.SpringConceptsBasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {

    static int counter = 0;
    BinarySearch()
    {
       counter++;
        System.out.println("counter ------>>>> "+counter);
    }

    @Autowired
    @Qualifier("quick")
    Sorting sorting;

    public int Search()
    {
        //Sorting
        sorting.sort();
        return 12;
    }


}
