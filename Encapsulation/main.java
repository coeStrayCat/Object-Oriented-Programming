class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John"); // ใช้ Method setName เพื่อกำหนดชื่อ

        // person.name = "Doe";  // แบบนี้จะไม่สามารถทำได้เพราะ name เป็น private 

        person.age = 30; // สามารถเข้าถึงได้โดยตรง 
    
        System.out.println("Name: " + person.getName());  // ใช้ Method getName เพื่อเข้าถึงชื่อ
        System.out.println("Age: " + person.age); // สามารถเข้าถึงได้โดยตรง 
    }
}

