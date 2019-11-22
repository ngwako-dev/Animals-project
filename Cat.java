public class Cat extends Animal{

    private static String name="Storm";

    public Cat(){
        super(name);
    }

    public void sound(){
        System.out.println("Cat Meows");
    }
}
