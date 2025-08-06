// class Main {
//   public static void main(String[] args) {
//     Dog dog1 = new Dog("Buddy", "Woof", 5);
//     dog1.name = "Buddy";
//     dog1.age = 5;
//     dog1.sound = "Woof";
//     dog1.makeSound();
//     System.out.println("Dog Name: " + dog1.name);  
//     System.out.println("Dog Age: " + dog1.age);
//     System.out.println("Dog Sound: " + dog1.sound);
//   }
// }


// class Main {
//   public static void main(String[] args) {
//     Dog dog1 = new Dog("Buddy", "Woof", 5);
//     Dog dog2 = new Dog("Max", "Bark");
//     Dog dog3 = new Dog();
//    System.out.println("Dog1 Name: " + dog1.name + ", Age: " + dog1.age + ", Sound: " + dog1.sound);  
//    System.out.println("Dog2 Name: " + dog2.name + ", Age: " + dog2.age + ", Sound: " + dog2.sound);  
//    System.out.println("Dog3 Name: " + dog3.name + ", Age: " + dog3.age + ", Sound: " + dog3.sound);  
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     // Using Setters
//     Dog dog1 = new Dog();
//     dog1.setName("Buddy");
//     dog1.setAge(5);
//     dog1.setSound("Woof");
//     System.out.println("Dog1 Name: " + dog1.getName() + ", Age: " + dog1.getAge() + ", Sound: " + dog1.getSound());
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     Dog.sound("Woof");
//     System.out.println(Dog.walk("Pog Pog"));
//   }
// }


class Main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    Dog dog2 = new Dog();
    Dog dog3 = new Dog();
    System.out.println("Total Dog instances: " + Dog.totalInstances);
    System.out.println("Total Dog1 instances: " + dog1.totalInstances);
    System.out.println("Total Dog2 instances: " + dog2.totalInstances);
    System.out.println("Total Dog3 instances: " + dog3.totalInstances);
  }
}

