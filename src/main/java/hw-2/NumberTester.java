class NumberTester {
    public boolean isEven(int number) {
        return 0 == number % 2 ;
    }
    public boolean isOdd(int number){
        return 0 != number %2;
    }
    //Test output
    public static void main(String[] args) {
        NumberTester tester = new NumberTester();
        System.out.println(tester.isEven(10)); //Should be true
        System.out.println(tester.isOdd(10)); //Should be false
    }
}