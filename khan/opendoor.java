package demo.Loop;

import java.util.Scanner;

public class opendoor {
    public static void main(String[]arg){
        int doorcode;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value:");
        doorcode=scanner.nextInt();

        switch(doorcode)
        {   
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("thursday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;

         }
    }
}
