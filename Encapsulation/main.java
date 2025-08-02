class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        // person.name = "Doe";  // แบบนี้จะไม่สามารถทำได้เพราะ name เป็น private 
        person.age = 30; // สามารถเข้าถึงได้โดยตรง

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
//run: make all
