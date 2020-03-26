package Practica.Practicum1;

public class Main {
    public static void main(String[] args){
        System.out.println("For Loop:");
        for(int i=1; i<11; i++){
            System.out.println(i);
        }

        System.out.println(" ");

        System.out.println("While Loop:");
        int count = 1;
        while(count < 11){
            System.out.println(count);
            count++;
        }

        System.out.println(" ");

        System.out.println("Random getallen:");
        int counter = 1;
        int getal = 1;
        while(counter < 11){
            double random_double = Math.random() * (getal);
            System.out.println(random_double);
            counter++;
        }

        System.out.println(" ");

        System.out.println("Totaal som opdracht:");
        int sum = 0;
        int i = 0;       // i is 0 Here

        while (i<40) {
            sum += i;
            i++;
        }
        System.out.println("Het totaal is " + sum);

        System.out.println(" ");

        System.out.println("Zaagtand:");
        boolean poop = false;
        for (int e=1; e<6; e++) {
            if (poop) {
                System.out.println("s");
                poop = false;
            }
            else {
                System.out.println("ss");
                poop = true;
            }
        }
    }
}
