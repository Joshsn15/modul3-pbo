public class main {
    public main(String[] args) {
        Dog anjing = new Dog("ASTRID", 5, "Dog Food", gender.FEMALE, alive.ALIVE);
        System.out.println(anjing.move());
        System.out.println(anjing.move(anjing.name,5));
        System.out.println(anjing.isAlive());
        System.out.println(anjing.printData());

        Cat kucing = new Cat("luki", 4, "Cat Food", gender.FEMALE, alive.ALIVE);
        System.out.println(kucing.move());
        System.out.println(kucing.move(kucing.name,5));
        System.out.println(kucing.isAlive());
        System.out.println(kucing.printData());

        Horse kuda = new Horse("lokoko", 6, "Horse Food", gender.FEMALE, alive.DEAD);
        System.out.println(kuda.move());
        System.out.println(kuda.move(kuda.name,5));
        System.out.println(kuda.isAlive());
        System.out.println(kuda.printData());
                 
        
        Duck bebek = new Duck("donald", 6, "Duck Food", gender.MALE, alive.DEAD);
        System.out.println(bebek.move());
        System.out.println(bebek.move(bebek.name,5));
        System.out.println(bebek.isAlive());
        System.out.println(bebek.printData());
    }
}
