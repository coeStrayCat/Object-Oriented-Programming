// Parent class (Superclass)
class Animal {
    // Attributes
    String name;
    protected int age;
    protected String species;

    // Constructor
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
    // Methods
    public void makeSound() {
        System.out.println(name + " เสียงอยู่ไหน เสียงอยู่ไหนน");
    }
    
    public void displayInfo() {
        System.out.println("ชื่อ: " + name);
        System.out.println("อายุ: " + age + " ปี");
        System.out.println("ประเภท: " + species + "\n");
    }
}

// Child class (Subclass)
class Dog extends Animal {
    private String breed;
    
    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age, "สุนัข"); // เรียก constructor ของ parent class
        this.breed = breed;
    }
    
    // Override method จาก parent class
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(name + " เห่า เห่า ขู่ ขู่\n");
        System.out.println("------------------------\n");
    }
}

// Child class (Subclass)
class Cat extends Animal {
    private boolean isIndoor;
    
    // Constructor
    public Cat(String name, int age, boolean isIndoor) {
        super(name, age, "แมว");
        this.isIndoor = isIndoor;
    }
    
    // Override method
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(name + " เหมียว เหมียว\n");
        System.out.println("------------------------\n");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("น้องเบคอน", 23, "โกลเด้น รีทรีฟเวอร์");
        dog.displayInfo();
        dog.makeSound();
        
        Cat cat = new Cat("แมวจรหาบ้าร", 22, true);
        cat.displayInfo();  
        cat.makeSound();
         
    }
}
