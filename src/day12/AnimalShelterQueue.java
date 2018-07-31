package day12;


import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelterQueue {

    public Queue<Pets> AnimalShelter = new LinkedList<>();
    public Queue<Cats> CatShelter = new LinkedList<>();
    public Queue<Dogs> DogShelter = new LinkedList<>();


    public void enqueue(Pets pet) {
        if(pet instanceof Pets)
            AnimalShelter.add(pet);
        else {
            System.out.println("not a cat or dog");
        }
    }
    public String dequeue(String pref) {

        while(!AnimalShelter.isEmpty()){
            if (pref == "cat"){
               //CatShelter.;
            } else if(pref == "dog") {
                //DogShelter.add(Dogs);
            }else {
                double random = Math.random();
                if(random > .5) {
                    //return Dogs;
                }
            }
        } return null;
    }
}
