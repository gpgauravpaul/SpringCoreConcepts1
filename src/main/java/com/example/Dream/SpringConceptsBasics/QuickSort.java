package com.example.Dream.SpringConceptsBasics;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class QuickSort implements Sorting {

    @Override
    public void sort() {
        System.out.println("Quick Sort.");
    }
}
