public class Main {


    public static void main(String[] args) {
        //задание 1
        int dog = 8;
        double cat = 3.6;
        int paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задание 2
        var dog2 = dog + 4;
        var cat2 = cat + 4;
        var paper2 = paper + 4;
        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);
        //задание 3
        var dog3 = dog - 3.5;
        var cat3 = cat - 1.6;
        var paper3 = paper - 7639;
        System.out.println(dog3);
        System.out.println(cat3);
        System.out.println(paper3);
        //задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


        // задание 6
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес двух бойцов: " + (boxer1Weight + boxer2Weight));
        System.out.println(boxer2Weight - boxer1Weight);
        System.out.println();
        //Задание 7
        System.out.println(boxer2Weight % boxer1Weight);
        //Задание 8
        int totalAmountOfHours = 640;
        int hoursPerOneEmployee = 8;
        int numberOfEmployees = totalAmountOfHours / hoursPerOneEmployee;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек");


    }


}