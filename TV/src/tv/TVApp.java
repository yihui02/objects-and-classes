package tv;

// To use scanner library to retrieve user input
import java.util.Scanner;

public class TVApp {

    public static void main(String[] args) {      
        TV prismTV = new TV(); // Creating a TV object
        Scanner input = new Scanner(System.in); // Creating a scanner object
        
        int menuChoice;
        int channelChoice;
        char moreChoice = 'Y';
        
        do {
            prismTV.TVInfo(); // Displaying TV's state, channel and volume
            
            // This is a menu
            System.out.println("\nWhat do you want to do? ");
            System.out.println("1 - Change the channel ");
            System.out.println("2 - Go to next channel ");
            System.out.println("3 - Go to previous channel ");
            System.out.println("4 - Increase volume ");
            System.out.println("5 - Decrease volume ");
            System.out.println("6 - Exit ");
            System.out.print("Enter 1 - 5: ");
            menuChoice = input.nextInt(); // nextInt() is used to retrieve integer value from user

            switch(menuChoice) {
                case 1: // Jump to a channel
                    do {
                        System.out.print("Do you want to switch to which channel? ");
                        channelChoice = input.nextInt();

                        prismTV.setChannel(channelChoice);
                        System.out.println("You are currently watching channel " + prismTV.getChannel() + ".");
                        
                        // If user enter other than 1 - 9, generate an error message
                        if(channelChoice <= 0 || channelChoice >= 10) {
                            System.out.print("Oppps, we only have channel 1 - 9 only. ");
                        }
                    } while (channelChoice <= 0 || channelChoice >= 10);
                    break;
                case 2: // Go to next channel
                    do {
                        // If user is already on channel 9, 
                        // We'll go back to the first channel, which is channel 1
                        // Else, proceed as usual
                        if((prismTV.getChannel()+1) != 10) {
                            prismTV.channelUp();
                            System.out.println("You are currently watching channel " + prismTV.getChannel() + ".");
                            System.out.print("Next channel (Y/N)? ");
                            moreChoice = input.next().charAt(0); 
                            // next().charAt(0) is used to retrieve the first character that user entered 
                            // we are expecting user to enter only a single character but you never know lol
                        } else {
                            prismTV.setChannel(0);
                        }
                    } while(Character.toUpperCase(moreChoice) == 'Y');
                    // do-while is most frequently used when we want the statements to be executed at least once
                    break;
                case 3: // Go to previous channel
                    do {
                        // If user is already on channel 1, 
                        // We'll go to the last channel, which is channel 9
                        // Else, proceed as usual
                        if((prismTV.getChannel()-1) != 0) {
                            prismTV.channelDown();
                            System.out.println("You are currently watching channel " + prismTV.getChannel() + ".");
                            System.out.print("Previous channel (Y/N)? ");
                            moreChoice = input.next().charAt(0);
                        } else {
                            prismTV.setChannel(10);
                        }
                    } while(Character.toUpperCase(moreChoice) == 'Y');

                    break;
                case 4: // Increasing the volume
                    do {
                        // If volume is already at 100 (maximum), generate error message 
                        // Else, proceed as usual
                        if((prismTV.getVolume()+1) != 101) {
                            prismTV.volumeUp();
                            System.out.println("The volume is currently " + prismTV.getVolume() + ".");
                            System.out.print("Increase volume (Y/N)? ");
                            moreChoice = input.next().charAt(0); 
                        } else {
                            System.out.println("Oppps, this is already the maximum volume!");  
                            break; // Break here is to get out of the do-while loop
                        }
                    } while(Character.toUpperCase(moreChoice) == 'Y');

                    break;
                case 5: // Decreasing the volume
                    do {
                        // If volume is already at 0 (minimum), generate error message 
                        // Else, proceed as usual
                        if((prismTV.getVolume()-1) != -1) {
                            prismTV.volumeDown();
                            System.out.println("The volume is currently " + prismTV.getVolume() + ".");
                            System.out.print("Decrease volume (Y/N)? ");
                            moreChoice = input.next().charAt(0);
                        } else {
                            System.out.println("Oppps, this is already the minimum volume!"); 
                            break;
                        }
                    } while(Character.toUpperCase(moreChoice) == 'Y');

                    break;
                case 6:
                    break;
                default:
                    System.out.println("Oppps, please enter 1 to 6 only!");                
            }
            
            System.out.println("\n\n\n");
        } while(menuChoice != 6); 
        // while user is not entering 6, the program will repeat itself over and over and over again
        
    }
    
}
