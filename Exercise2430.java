import java.util.Scanner;
 
public class Exercise2430 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int correct = 0;
 
      for (int q = 1; q <= 5; q++) {
         String question;
         int answer;
 
         switch (q) {
            case 1:
               question = "Which group shared the 2007 Nobel Peace Prize "
                  + "with Al Gore?\n"
                  + "1. World Meteorological Organization\n"
                  + "2. Intergovernmental Panel on Climate Change\n"
                  + "3. UN Environment Programme\n"
                  + "4. NASA";
               answer = 2;
               break;
            case 2:
               question = "By about how much has Earth's average surface "
                  + "temperature\nrisen since 1880 (NASA analysis)?\n"
                  + "1. 0.1 C\n2. 0.5 C\n3. 1.1 C\n4. 3 C";
               answer = 3;
               break;
            case 3:
               question = "The IPCC's 2021 report puts the best estimate "
                  + "of warming from a\ndoubling of CO2 (climate "
                  + "sensitivity) at about:\n"
                  + "1. 1 C\n2. 3 C\n3. 6 C\n4. 10 C";
               answer = 2;
               break;
            case 4:
               question = "Ice-age cycles over the past million years were "
                  + "mainly paced by:\n"
                  + "1. Changes in Earth's orbit and tilt\n"
                  + "2. Fossil fuel burning\n"
                  + "3. Meteor impacts\n"
                  + "4. Changes in the Moon's size";
               answer = 1;
               break;
            default:
               question = "Atmospheric CO2 was about 280 ppm before "
                  + "industrialization.\nToday it is about:\n"
                  + "1. 300 ppm\n2. 350 ppm\n3. 430 ppm\n4. 600 ppm";
               answer = 3;
         }
 
         System.out.printf("Question %d%n%s%n", q, question);
         System.out.print("Your answer (1-4): ");
         int choice = input.nextInt();
 
         while (choice < 1 || choice > 4) {
            System.out.print("Enter a number from 1 to 4: ");
            choice = input.nextInt();
         }
 
         if (choice == answer) {
            correct++;
         }
 
         System.out.println();
      }
 
      System.out.printf("You answered %d of 5 correctly.%n", correct);
 
      if (correct == 5) {
         System.out.println("Excellent");
      } else if (correct == 4) {
         System.out.println("Very good");
      } else {
         System.out.println("Time to brush up on your knowledge of "
            + "global warming.");
         System.out.println("Sources used for these facts:");
         System.out.println("  climate.nasa.gov");
         System.out.println("  www.ipcc.ch");
         System.out.println("  www.nobelprize.org");
         System.out.println("  gml.noaa.gov/ccgg/trends");
         System.out.println("  climatechangereconsidered.org (skeptics)");
      }
   }
}

