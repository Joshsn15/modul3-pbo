abstract class Hewan {
    String name;
    int age;
    String food;
    gender gender;
    alive alive;

    public Hewan(String name, int age, String food, gender gender, alive alive) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.alive = alive;
    }

    abstract String printSound();

    public Boolean isAlive() {
        if (this.alive == alive.ALIVE) {
            return true;
        } else {
            return false;
        }
    }


    abstract String move();

    abstract String move(String name, int walk);
    abstract String printData();
}
enum gender {
    MALE,
    FEMALE
}

enum alive {
    DEAD,
    ALIVE
}
