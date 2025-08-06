
// class Main {
//   public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         System.out.println(calc.add(2, 3));      // เรียก add(int,int) → ผลลัพธ์ 5
//         System.out.println(calc.add(1, 2, 3));   // เรียก add(int,int,int) → ผลลัพธ์ 6
//     }
// }


class Main {

    public static void main(String[] args) {
        Animal a1 = new Dog();   // reference เป็น Animal แต่จริงๆ เป็น Dog
        Animal a2 = new Cat();   // reference เป็น Animal แต่จริงๆ เป็น Cat

        a1.makeSound();  // เรียก Dog.makeSound() → “Dog: โฮ่งๆ”
        a2.makeSound();  // เรียก Cat.makeSound() → “Cat: เหมียวๆ”
    }
}


