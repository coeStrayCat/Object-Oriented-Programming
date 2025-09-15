class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();
        a.makeSound();
        d.makeSound();
        c.makeSound();
    }
}
class Animal {
    public void makeSound() {
        System.out.println("เสียงอยู่ไส เสียงอยู่ไส");
    }
}
// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("หมาเด็กร้องยังไง");
    }
}
// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("แมวเด็กร้องยังไง");
    }
}

