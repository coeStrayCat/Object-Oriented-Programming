class Person {
    // private ซ่อนข้อมูลไว้ ไม่ให้แก้หรือเข้าถึงโดยตรง 
    private String name;   // ต้องใช้ Method เข้าถึงเท่านั้น

    // publicสามารถเข้าถึงได้โดยตรง  
    public int age; 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
