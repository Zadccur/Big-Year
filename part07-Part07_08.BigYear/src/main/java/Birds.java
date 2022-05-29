import java.util.ArrayList;
import java.util.Scanner;
public class Birds {
    
    private ArrayList<String> birds;
    private ArrayList<String> latinBird;
    private ArrayList<Integer> observations;
    
    public Birds(){
        this.birds = new ArrayList<>();
        this.latinBird = new ArrayList<>();
        this.observations = new ArrayList<>();
    }
    
    
    public void addBird(String bird, String latinBird){
        this.birds.add(bird);
        this.latinBird.add(latinBird);
        this.observations.add(0);
    }
    public void oneBird(Scanner scan){
        System.out.println("Bird?");
        String bird = scan.nextLine();
        
        for(int i = 0; i < this.birds.size(); i ++){
            if(this.birds.get(i).equals(bird)){
                System.out.println(this.birds.get(i) + " (" + this.latinBird.get(i) + "): " + this.observations.get(i) + " observations" );
            }else{
                System.out.println("Not a bird!"); 
            }
        }
          
    }
    public void allBirds(){
        for(int i = 0; i < this.birds.size(); i++){
            System.out.println(this.birds.get(i) + " (" + this.latinBird.get(i) + "): " + this.observations.get(i) + " observations" );
            
        }
    }
    public void addObservation(String bird){
        for(int i = 0; i < this.birds.size(); i++){
            if(bird.equals(this.birds.get(i))){
                int incrementObservation = this.observations.get(i);
                this.observations.set(i, incrementObservation + 1);
                
            }
                
        }
    }
}
