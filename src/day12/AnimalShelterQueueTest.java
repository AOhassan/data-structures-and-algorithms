package day12;

class AnimalShelterQueueTest {

    @org.junit.jupiter.api.Test
    void enqueueEmptyTest() {
        AnimalShelterQueue shelter = new AnimalShelterQueue();

        Cats cat1 = new Cats("polly");

        shelter.enqueue(cat1);
        for (Cats cc: shelter.CatShelter) {
            System.out.println(cc);
        }

    }

    @org.junit.jupiter.api.Test
    void enqueueShortTest() {
        Cats cat1 = new Cats("polly");

//        AnimalShelterQueue.enqueue(cat1);
//        System.out.println();


    }

    @org.junit.jupiter.api.Test
    void dequeueEmptyTest() {
    }
    @org.junit.jupiter.api.Test
    void dequeueShortTest() {
    }
    @org.junit.jupiter.api.Test
    void dequeueLongTest() {
    }

}