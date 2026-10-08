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

    //Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String n){
        name  = n; 
    }

    public double getWeight(){
        return weight;
    }
    //validate data
    public void setWeight(double w){
        if(w>0){
            weight = w;
        }
        else{
            System.out.println("Error: Weight can't be negative!");
        }
    }








    public void makeSound(){
        if(weight<20){
            System.out.println("yip yip");
        }
        else{
            System.out.println("Woof Woof");
        }
    }



    //Overriding toString
    public String toString(){
        return name + " is a " + breed;
    }

}

