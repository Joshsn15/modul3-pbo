public class Dog extends Hewan {

    public Dog(String name, int age, String food, gender gender, alive alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    String printSound() {
        return "gukguk";
    }

   

    @Override 
    String move(){
        return "Dog is walking";
    }

    @Override 
    String move(String name, int walk){
        return "The Dog name " + name + " walks for " + walk+" meters" ;
    }

    @Override
    String printData(){
        return "Name: " + this.name + "\nAge: " + this.age + "\nFood: " + this.food + "\nGender: " + this.gender + "\nStatus: " + this.alive;
    }
}
