package com.kiran;

public class Conditional {

    static String getDay(int dayNum) {
        if (dayNum == 0)
            return "Sunday";
        else if (dayNum == 1)
            return "Monday";
        else if (dayNum == 2)
            return "Tuesday";
        else if (dayNum == 3)
            return "Wednesday";
        else if (dayNum == 4)
            return "Thursday";
        else if (dayNum == 5)
            return "Friday";
        else if (dayNum == 6)
            return "Saturday";
        return "invalid day";
    }

    static String getDaySwitch(int dayNum){
        switch (dayNum) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "invalid day";
        }
    }


    public static void main(String[] args) {

        for(int i=0; i<=6; i++)
            System.out.println("day " + i + " is --> " + getDay(i));

        for(int i=0; i<=6; i++)
            System.out.println("day " + i + " is --> " + getDaySwitch(i));
    }
}
