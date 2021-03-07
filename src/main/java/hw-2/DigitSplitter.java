class DigitSplitter{
    public int getFirstDigit(int number){
        return number / 10;
    }
    public int getSecondDigit(int number){
        return number % 10;
    }

    public static void main(String[] args) {
        DigitSplitter digitSplitter = new DigitSplitter();
        System.out.println("getFirstDigit(15)= " + digitSplitter.getFirstDigit(15));
        System.out.println("getSecondDigit(15)= " + digitSplitter.getSecondDigit(15));
    }
}