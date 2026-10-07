public class App {
    public static void main(String[] args) throws Exception {
        Dog d1 = new Dog("pitbull", true, 70, "Rocky");
        Dog d2 = new Dog("poodle", false, 15, "Fluffy");
        Dog d3 = new Dog();

        d3.setName("Rufus");
        System.out.println(d3.getName());

        d3.setWeight(-5);
        System.out.println(d3.getWeight());



        
        System.out.println(d1);
        d1.makeSound();
        System.out.println(d2);
        d2.makeSound();
        System.out.println(d3);
        d3.makeSound();
        System.out.println("Done");
    }
}
