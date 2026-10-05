public class App {
    public static void main(String[] args) throws Exception {
        Dog d1 = new Dog("pitbull", true, 70, "Rocky");
        Dog d2 = new Dog("poodle", false, 15, "Fluffy");
        Dog d3 = new Dog();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
