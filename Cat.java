public class Cat extends Hewan {

    public Cat(String name, int age, String food, gender gender, alive alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    String printSound() {
        return "miawwwww";
    }

    @Override
    String move() {
        return "Cat is walking";
    }

    @Override
    String move(String name, int walk) {
        return "The Cat name " + name + " walks for " + walk + " meters";
    }
    @Override
    String printData(){
        return "Name: " + this.name + "\nAge: " + this.age + "\nFood: " + this.food + "\nGender: " + this.gender + "\nStatus: " + this.alive;
    }
}
