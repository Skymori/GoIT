import java.util.*;

class PassportFormCreator{
    public void createForms(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String lastname = scanner.nextLine();
        int year = scanner.nextInt();
        scanner.close();
        int moonYear = year * 10;
        System.out.println(name+ " " + lastname+ " " + moonYear);
        System.out.println(name.toUpperCase());
        System.out.println(lastname.toUpperCase());
        System.out.println(moonYear);
    }

    public static void main(String[] args) {
        new PassportFormCreator();
    }
}