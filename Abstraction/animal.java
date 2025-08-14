abstract class Animal {
    protected String name;
    protected int age;
    // abstract method = ไม่มีเนื้อใน บังคับให้ใช้ใน subclass
    public abstract void makeSound();

    // method ปกติไม่ได้บังคับให้ใช้ใน subclass
    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Hong Hong!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meกow!");
    }
}

class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        dog.sleep();
        cat.sleep();
    }
}