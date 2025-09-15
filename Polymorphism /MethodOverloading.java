class Calculator {
    // บวก 2 จำนวน
    public int add(int a, int b) {
        return a + b;
    }

    // บวก 3 จำนวน (ชื่อเดียวกัน แต่พารามิเตอร์ต่างกัน)
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("1 + 2 + 3 = " + calc.add(1, 2, 3));
    }
}


