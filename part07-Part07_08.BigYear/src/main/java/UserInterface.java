import java.util.Scanner;

public class UserInterface {

    private Birds birds;
    
    public UserInterface(){
        this.birds = new Birds();
    }
    
    
    
    public void start(Scanner scan){
        while(true){
            System.out.println("?");
            String command = scan.nextLine();
            if(command.equals("Add")){
                this.add(scan);
            }else if(command.equals("Observation")){
                this.observation(scan);
            }else if(command.equals("All")){
                this.birds.allBirds();
            }else if(command.equals("One")){
                this.birds.oneBird(scan);
            }else if(command.equals("Quit")){
                break;
            }
        }   
    }
    
    public void add(Scanner scan){
        System.out.println("Name:");
        String englishName = scan.nextLine();
        System.out.println("Name in Latin:");
        String latinName = scan.nextLine();
        this.birds.addBird(englishName, latinName);
    }
    public void observation(Scanner scan){
        System.out.println("Bird?");
        String observedBird = scan.nextLine();
        this.birds.addObservation(observedBird);
        
    }
}
