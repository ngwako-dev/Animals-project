public class Animal {

    private String name;

    public Animal(String name){
        this.name=name;
    }

    public void sound() {

        System.out.println("sound");

    }
    public void eat(){
        System.out.println(name+" eats");
    }
}
