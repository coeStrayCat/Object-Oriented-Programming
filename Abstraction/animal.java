abstract class Animal {
    // abstract method = ไม่มีเนื้อใน บังคับให้ใช้ใน subclass
    public abstract void makeSound();

    // method ปกติได้ด้วย ไม่บังคับให้ใช้ใน subclass
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
        System.out.println("Meow Meow!");
    }
}