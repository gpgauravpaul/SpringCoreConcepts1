package com.example.Dream.SpringConceptsBasics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bubble")
public class BubbleSort implements Sorting{


    @Override
    public void sort() {
        System.out.printf("Bubble sorting is done");
    }
}
