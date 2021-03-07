class MarsCalculator {
    public int sum(int a, int b, int c){
        return a + b + c;
    }
    public int sub(int a, int b, int c){
        return a - (b + c);
    }
    public int multiply(int a, int b, int c){
        return sum(a, b, c) * sub(a, b, c);
    }
    public float divide(int a, int b, int c){
        return sum(a, b, c) / 10.0f;
    }

    public static void main(String[] args) {
        MarsCalculator calculator = new MarsCalculator();
    System.out.println("sum(1, 2, 3)= " + calculator.sum(1, 2, 3));
    System.out.println("sub(1, 2, 3)= "+ calculator.sub(1, 2, 3));
    System.out.println("divide(1, 2, 3)= "+ calculator.divide(1, 2, 3));
    }
}