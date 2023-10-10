package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if((firstSide + secondSide) < thirdSide){
            System.out.println("it's not a triangle");
        }else if((secondSide + thirdSide) < firstSide){
            System.out.println("it's not a triangle");
        }else if((firstSide+thirdSide) < secondSide){
            System.out.println("it's not a triangle");
        }else{
            System.out.println("this is a valid triangle");
        }
    }

    public static void main(String[] args) {
        TriangleSidesValidator triangleSidesValidator = new TriangleSidesValidator();
        triangleSidesValidator.validate(7, 8, 29);
    }

}
