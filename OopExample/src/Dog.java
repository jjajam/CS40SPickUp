public class Dog{
    //attributes
    //instance variables
    private String name;
    private String breed;
    private boolean isHungry;
    private double weight;

    //constructor
    //initializes the instance variables
    public Dog(String b, boolean ih, double w, String n){
        name = n;
        breed = b;
        isHungry = ih;
        weight = w; 
    }
    //overloaded constructor
    public Dog(){
        name = "unknown";
        breed = "mutt";
        isHungry=true;
        weight = 0;
    }
    //Overriding toString
    public String toString(){
        return name + " is a " + breed;
    }

}

