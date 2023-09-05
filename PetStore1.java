import java.util.Scanner;
public class PetStore1 {
	
	public static void main(String[] args) {
        System.out.println("Petstore v1.0");
        
        Scanner myPet = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Select Pet (Dog, Cat, Fish, Bird): ");
	    
        String myPetStr = myPet.nextLine();  // Read user input
        
        
        Scanner myBreed = new Scanner(System.in);  // Create a Scanner object
	    if (myPetStr.contentEquals("Dog")) {
	        System.out.println("Select Breed (Bulldog, Poodle, Golden Retriever, Labrador): ");
	    } 
	    else if (myPetStr.contentEquals("Cat")) {
	        System.out.println("Select Breed (Manx, Persian): ");
        } 
	    else if (myPetStr.contentEquals("Fish")) {
	        System.out.println("Select Breed (Angel Fish, Tiger Shark, Koi, Goldfish): ");
        } 
	    else if (myPetStr.contentEquals("Bird")) {
	        System.out.println("Select Breed (Amazon Parrot, Finch): ");
        } 
	    else {
            System.out.println("Not Existing Pet");
        }

        String myBreedStr = myBreed.nextLine();  // Read user input
        
        if (myBreedStr.contentEquals("Labrador")) {
        	System.out.println("Item ID   Product ID           Description                List Price");    
            System.out.println("EST-22     K9-RT-02        Adult Male Labrador Retriever       $135.50");
            System.out.println("EST-23     K9-RT-02        Adult Female Labrador Retriever     $145.49");
        }  
        else if (myBreedStr.contentEquals("Manx")) {
        	System.out.println("Item ID   Product ID        Description        List Price");    
            System.out.println("EST-14     FL-DSH-01          Tailless Manx          $58.50");
            System.out.println("EST-15     FL-DSH-01          With tail Manx         $23.50");
        }
        else if (myBreedStr.contentEquals("Koi")) {
        	System.out.println("Item ID   Product ID       Description    List Price");    
            System.out.println("EST-4     FI-FW-01             Spotted Koi      $18.50");
            System.out.println("EST-5     FI-FW-01             Spotless Koi     $18.50");
        }
        else if (myBreedStr.contentEquals("Amazon Parrot")) {
        	System.out.println("Item ID   Product ID           Description           List Price");    
            System.out.println("EST-22     AV-CB-01          Adul Male Amazon Parrot      $193.50");
        } 
    }
}
