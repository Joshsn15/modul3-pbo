public class Horse extends Hewan {
     public Horse(String name, int age, String food, gender gender, alive alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    String printSound() {
        return "hihihiha";
    }

    

    @Override 
    String move(){
        return "Horse is walking";
    }

    @Override 
    String move(String name, int walk){
        return "The Horse name " + name + "walks for " + walk +" meters" ;
    }
    @Override
    String printData(){
        return "Name: " + this.name + "\nAge: " + this.age + "\nFood: " + this.food + "\nGender: " + this.gender + "\nStatus: " + this.alive;
    }
}
