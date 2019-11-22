public class Main {

    public static void main(String[] args) {

        Home home=new Home();
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        Cat cat=new Cat();


        home.makeAllsound();
        home.adoptpet(dog1);
        home.makeAllsound();

        home.adoptpet(cat);
        home.makeAllsound();

        home.adoptpet(dog2);
        home.makeAllsound();


//        dog.eat();
//        dog.sound();

//        cat.eat();
//        cat.sound();




    }


}

