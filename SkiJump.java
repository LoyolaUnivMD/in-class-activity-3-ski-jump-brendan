/*
Programmers: Brendan Moore
Course: CS212
Due Date: 2/1/24
Class Activity: 3
Problem Statement: Calculate how a ski jumper's score compares to par
Data In: Hill size and jumper's speed
Data Out: Statement for how the jumper did compared to par
Credits: N/A
*/
//SkiJump.java
import java.util.Scanner;
class SkiJump {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Display an introduction to the ski jump program
        System.out.println("Welcome to the ski jump calculator!");

        //Prompt the user to enter the hill type
        System.out.println("Enter hill type (normal or large): ");
        String hill_type = scan.nextLine();

        //Prompt the user for their speed
        System.out.println("Enter the jumper's speed at the end of the slope: ");
        double speed = scan.nextDouble();

        //Normal hill numbers
        int height = 46;
        double points_per_meter = 2;
        int par = 90;

        //Large hill numbers
        if (hill_type.toLowerCase().equals("large")){
            height = 70;
            points_per_meter = 1.8;
            par = 120;
        }

        //Calculate time in the air
        double time_air = Math.sqrt((2 * height) / 9.8);

        //Calculate the distance traveled by the jumper
        double distance = (speed * time_air);

        //Calculate the points
        double points = 60 + (distance - par) * points_per_meter;

        //Output based on the points the jumper received
        if (points >= 61) {
            System.out.println("Great job for doing better than par!");
        } else if (points < 10) {
            System.out.println("What happened??");
        } else {
            System.out.println("Sorry you didn't go very far.");
        }
    }
}
