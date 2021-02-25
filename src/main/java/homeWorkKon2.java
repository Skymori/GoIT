package main.java;

import java.util.Scanner;

/*Написать программу, которая делает следующее:
спрашивает у пользователя имя (String)
спрашивает у пользователя город проживания (String)
спрашивает у пользователя возраст (int)
спрашивает у пользователя хобби (String)
перед каждым вводом данных, программа должна вывести информацию пользователю с требованием ввода соответствующей информации.
программа выводит красиво оформлено всю информацию о пользователе в трех разных вариантах:
* */
public class homeWorkKon2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свое имя :");
        String name = in.nextLine();
        System.out.println("Введите город проживания :");
        String city = in.nextLine();
        System.out.println("Введите свой возраст :");
        Integer age = in.nextInt();
        System.out.println("Введите свое хобби");
        String hobby = in.next();
//Вариант 1 (табличный):
        System.out.println("***");
        System.out.println("Вариант 1 (табличный):");
        System.out.println("имя:   "+name);
        System.out.println("Город: "+ city);
        System.out.println("Возраст: "+ age);
        System.out.println("Хобби:"+hobby);

//Вариант 2 (текстовый):
        System.out.println("***");
        System.out.println("Вариант 2 (текстовый):");
        System.out.println("Человек по имени " +name+ " живет в городе "+city+
                ". Этому человеку "+age+ " лет и любит он заниматься "+ hobby);

//Вариант 3 (иной):
        System.out.println("***");
        System.out.println("Вариант 3 (иной): ");
        System.out.println(name+" имя:");
        System.out.println(city+" Город:");
        System.out.println(age+" Возраст:");
        System.out.println(hobby+" Хобби:");
    }
}
