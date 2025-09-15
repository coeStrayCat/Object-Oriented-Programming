interface Walkable {
    //constant
    int WALK_SPEED = 5; // km/h

    void walk();
    int getWalkSpeed();
}

interface Swimmable {
    // constant
    int SWIM_SPEED = 2; // km/h
    void swim();
    int getSwimSpeed();
}

class Duck implements Walkable, Swimmable {
    private String name;
    private int age;

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void walk() {
        System.out.println(name + " is walking at " + WALK_SPEED + " km/h");
    }

    @Override
    public int getWalkSpeed() {
        return WALK_SPEED;
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming at " + SWIM_SPEED + " km/h");
    }

    @Override
    public int getSwimSpeed() {
        return SWIM_SPEED;
    }
}

class Main {
    public static void main(String[] args) {
        Duck duck = new Duck("Donald", 3);
        duck.walk();
        duck.swim();
        System.out.println("Walk speed: " + duck.getWalkSpeed());
        System.out.println("Swim speed: " + duck.getSwimSpeed());
    }
}