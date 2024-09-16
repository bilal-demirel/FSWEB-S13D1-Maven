package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0) {
            return false;
        } else {
            return isBarking && (clock < 8 || clock > 20);
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge <= 19 && firstAge >= 13)
                || secondAge <= 19 && secondAge >= 13
                || thirdAge <= 19 && thirdAge >= 13;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer && (temp <= 45 && temp >= 25)) {
            return true;
        } else return !isSummer && (temp <= 35 && temp >= 25);
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        } else {
            return width * height;
        }
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            return radius * radius * Math.PI;
        }
    }
}
