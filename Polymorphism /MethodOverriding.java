class Animal {
    public void makeSound() {
        System.out.println("Animal จินตนาการเสียงสัตว์");
    }
}
// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog: โฮ่งๆ");
    }
}
// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat: เหมียวๆ");
    }
}

