class ProfShop{
    public boolean isPriceOk(int price){
        return price != 1000;
    }
    public float calculateRegularDiscountPrice(float price){
        return (price / 100) * 90 ;
    }
    public boolean isDiscount50(int price){
        return price *4 == 1000;
    }
    public boolean isPriceHappy(int price, int year, int day){
        return price == year * day;
    }

    public static void main(String[] args) {
        ProfShop profShop = new ProfShop();
        System.out.println("isPriceOk(1500)= " + profShop.isPriceOk(1500));
        System.out.println("calculateRegularDiscountPrice(1500)= " + profShop.calculateRegularDiscountPrice(1500));
        System.out.println("isDiscount50(256)= " + profShop.isDiscount50(256));
        System.out.println("isPriceHappy(23700, 3950, 6)= " +profShop.isPriceHappy(23700, 3950, 6));
    }
}