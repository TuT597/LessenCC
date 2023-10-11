import com.sun.tools.javac.Main;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        /*
        boolean runTests = false;
        if (runTests) {

            int a = 3;
            a++;
            System.out.println("Hello\n\nworld!\n" + "2" + " + " + "2" + " = " + a);

            int x = 10, y = 15, z = 20;
            System.out.println(x + "\n" + y + "\n" + z);

            String g, h;
            g = h = "Hoi!";
            g = "Hallo!";
            int j = 18 / 10;
            System.out.println(g + h + j);

            if (1 == 1) {
                System.out.println("1 is indeed 1");
            }

         */


        /*
        boolean lightIsOn = true;
        if (lightIsOn) System.out.println("The light is on");
        else System.out.println("It's dark!");
        */


        /*
        int age = 18;
        boolean license = true;
        if (age >= 18 && license) System.out.println("You can drive");
        else if ( age < 18 && !license) System.out.println("You can drive under guidance");
        else System.out.println("You can't drive");
         */


        /* for (int i = 1; i <= 7; i++){
            System.out.println(i + " " + (i+1) + " " + (i+2));
        } */


        /* for (int x = 8; x > 0; x--){
            for (int y = 1; y <= 8; y++) {
                System.out.print("(" + x + ", " + y + ")");
            }
            System.out.println();
        } */


        startLightSwitch();
    }

    static void startLightSwitch() {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to turn the light on or off?");
        String s = input.nextLine();


        if (s.equals("on")) {
            lightOn();
        } else if (s.equals("off")) {
            lightOff();
        } else System.out.println("Invalid Input");
    }

    static boolean light = false;
    static void lightOn() {
        if (!light) {
            light = true;
            System.out.println("Light has turned on.");
            startLightSwitch();
        } else {
            System.out.println("Light is already on!");
            startLightSwitch();
        }
    }

    static void lightOff() {
        if (light) {
            light = false;
            System.out.println("Light has turned off.");
            startLightSwitch();
        } else {
            System.out.println("Light is already off!");
            startLightSwitch();
        }
    }

}
