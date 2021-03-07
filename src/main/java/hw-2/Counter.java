class Counter {
    public long current(long number){
        return number;
    }
    public long next(long number){
        return ++number;
    }
    public long prev(long number){
        return --number;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        System.out.println("current(5)= " + counter.current(5));
        System.out.println("next(5)= "+ counter.next(5));
        System.out.println("prev(5)= " + counter.prev(5));
    }
}