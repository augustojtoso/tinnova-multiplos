package com.tinnova.multiplos;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class MultipleService {
    public String getSum(String input) {
        int intInput;
        //Invalid input handling
        try{
            intInput= Integer.parseInt(input)-1; //All natural numbers under input
        } catch (Exception e){
            return input + " is not a valid integer";
        }
        if (intInput<3){return "0";}
        else {return "Sum of multiple of 3 and 5: "
                + getMultiples(intInput).stream()
                .collect(Collectors.summingInt(Integer::intValue));}
    }


    private ArrayList<Integer> getMultiples(int input){
        if (input < 3){return new ArrayList<>();}
        ArrayList<Integer> result = getMultiples(input-1);
        if (input%3 == 0 || input%5 == 0){
            result.add(input);
        }
        return result;
    }
}
