package com.epam.conditions;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        int winter[] = {12,1,2};
        int spring[] = {3,4,5};
        int summer[] = {6,7,8};

        IntPredicate check = (m) -> {
            if(m == monthNumber)
                return true;
            return false;
        };

        if(monthNumber > 0 && monthNumber < 13){
            if(Arrays.stream(winter).anyMatch(check)){
                System.out.println("Winter");
            }else if(Arrays.stream(spring).anyMatch(check)){
                System.out.println("Spring");
            }else if(Arrays.stream(summer).anyMatch(check)){
                System.out.println("Summer");
            }else {
                System.out.println("Autumn");
            }
        }else{
            System.out.println("Wrong month number");
        }
    }

    public static void main(String[] args) {
        SeasonDeterminer seasonDeterminer = new SeasonDeterminer();
        seasonDeterminer.tellTheSeason(0);
    }

}
