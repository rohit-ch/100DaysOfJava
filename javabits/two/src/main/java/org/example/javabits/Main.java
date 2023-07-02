package org.example.javabits;

public class Main {
    public static void main(String[] args) {
        Color myColor = Color.Red;
        System.out.println(myColor.getHexValue());

        try {
            myColor.getColorFromHexCode("#002344");
        } catch (EnumConstantNotPresentException e) {
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println(myColor.getColorFromHexCode("#FFFF00"));
        System.out.println(myColor.getColorFromHexCode("#00ff00"));
    }
}