class Person {
    // ซ่อนข้อมูลไว้ ไม่ให้แก้หรือเข้าถึงโดยตรง 
    // ต้องใช้ Method เข้าถึงเท่านั้น
    private String name; 
    // สามารถเข้าถึงได้โดยตรง  
    public int age; 

    public Person() {
        this.name = "";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
