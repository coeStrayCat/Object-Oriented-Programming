// class Dog {
//   //Attributes
//   public String name;
//   public int age;
//   public String sound;
//   // Method to make sound
//   public void makeSound() {
//     System.out.println(this.sound);
//   }
//   //Constructor
//   //Getters
//   //Setters
// }

// class Dog {
//   //Attributes
//   public String name;
//   public int age;
//   public String sound;
//   //Constructor
//   public Dog(String name, String sound, int age) {
//     this.name = name;
//     this.sound = sound;
//     this.age = age;
//   }
//   //Constructor
//   public Dog(String name, String sound) {
//     this.name = name;
//     this.sound = sound;
//     this.age = 20; // Default age
//   }
//   //Constructor
//   public Dog() {
//     this.name = "Unknown"; // Default name
//     this.sound = "Woof"; // Default sound
//     this.age = 0; // Default age
//   }
// }


// class Dog {
//   //Attributes
//   public String name;
//   public int age;
//   public String sound;

//   //Getters
//   public String getName() {
//     return name;
//   }
//   public int getAge() {
//     return age;
//   }
//   public String getSound() {
//     return sound;
//   }
//   //Setters
//   public void setName(String name) {
//     this.name = name;
//   }
//   public void setAge(int age) {
//     this.age = age;
//   }
//   public void setSound(String sound) {
//     this.sound = sound;
//   }
// }


// class Dog {
//   public static void sound(String sound) {
//     System.out.println(sound);
//   }
//   public static String walk(String walk) {
//     return walk;
//   }
// }


class Dog {
  public static int totalInstances = 0;
  public Dog() {
    totalInstances++;
  }
}
