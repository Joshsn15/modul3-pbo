public class Duck extends Hewan {
        
     public Duck(String name, int age, String food, gender gender, alive alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    String printSound() {
        return "wekwekwek";
    }

    

    @Override 
    String move(){
        return "Duck is walking";
    }

    @Override 
    String move(String name, int walk){
        return "The Duck name " + name + " swims for " + walk +" meters" ;
    }
    @Override
    String printData(){
        return "Name: " + this.name + "\nAge: " + this.age + "\nFood: " + this.food + "\nGender: " + this.gender + "\nStatus: " + this.alive;
    }
}
