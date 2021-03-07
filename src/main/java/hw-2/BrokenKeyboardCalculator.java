class BrokenKeyboardCalculator{
    public int add(int a, int b){
        return a += b;
    }
    public int sub(int a, int b){
        return a -= b;
    }
    public int multiply(int a, int b){
        return a *= b;
    }
    public int divide(int a, int b){
        return a /= b;
    }

    public static void main(String[] args) {
        BrokenKeyboardCalculator calculator = new BrokenKeyboardCalculator();

        System.out.println("add(5, 3)= "+ calculator.add(5, 3));
        System.out.println("sub(8, 7)= "+ calculator.sub(8, 7));
        System.out.println("multiply(1, 100)= "+ calculator.multiply(1, 100));
        System.out.println("divide(8, 4)= "+ calculator.divide(8, 4));
    }
}