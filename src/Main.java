import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task31();
        task32();
        task33();
        hardTask1();
        hardTask2();
        hardTask3();
        hardTask4();
        hardTask5();
        hardTask6();

    }

    private static void hardTask6() {
        int randomTime=ThreadLocalRandom.current().nextInt(0,28801);
        int workDay = 28800;
        int workTimeLeft = workDay-randomTime;

        System.out.printf("До конца рабочего дня остатось %d секунд \nДо конца рабочего дня осталось %d часов", workTimeLeft, workTimeLeft/3600);


    }

    private static void hardTask5() {
        int a = 100;
        int b = 70;
        int c = -60;
        int first = 0;
        int second = 0;
        int third = 0;
        if (a < b && a < c) {
            first = a;
            if (b < c) {
                second = b;
                third = c;
            } else {
                second = c;
                third = b;
            }
        } else if (a > b && a < c) {
            first = b;
            second = a;
            third = c;
        } else if (a < c && a > b) {
            first = c;
            second = a;
            third = b;
        }
        else if (a>c&&a>b) {
            third =a;
            if (b>c) {
                second = b;
                first =c;
            } else {
                second =c;
                first =b;
            }
        }

    System.out.println(" "+first+" "+second+" "+third);
}

private static void hardTask4(){
        int randomNum=ThreadLocalRandom.current().nextInt(100,1000);
        System.out.println(randomNum);
        int fistDigit=randomNum/100;
        int secondDigit=(randomNum%100)/10;
        int thirdDigit=randomNum%10;
        if(fistDigit>=secondDigit&&fistDigit>=thirdDigit){
        System.out.println("Максимальная цифра "+fistDigit);

        }else if(secondDigit>thirdDigit){
        System.out.println("Максимальная цифра "+secondDigit);
        }else{
        System.out.println("Максимальная цифра "+thirdDigit);
        }


        }

private static void hardTask3(){
        int randomNum=ThreadLocalRandom.current().nextInt(3,159);
        if(randomNum>=22&&randomNum<=122){
        System.out.println("Число "+randomNum+" в заданном диапазоне");
        }else{
        System.out.println("Число "+randomNum+" вне диапазона");
        }
        }

private static void hardTask2(){
        double p=9.3;
        double d=11.13;
        if(Math.abs(10-p)<Math.abs(10-d)){
        System.out.println("Ближайшее число "+p);
        }else{
        System.out.println("Ближайшее число "+d);
        }

        }

private static void hardTask1(){
        int p=0;

        if(p%2==0&&p!=0){
        System.out.println("Введенное число четное");
        }else{
        System.out.println("Введено нечетное число");
        }


        }

private static void task33(){
        int one=10;
        int two=8;
        int three=10;
        boolean oneIsTheBiggest=one>two&&one>three;
        boolean twoIsTheBiggest=two>one&&two>three;

        if(oneIsTheBiggest){
        System.out.println("Первое число наибольшее");
        }else if(twoIsTheBiggest){
        System.out.println("Второе число наибольшее");
        }else{
        System.out.println("Третье число наибольшее");
        }
        }

private static void task32(){
        int age=15;
        boolean tooYong=age< 5;
        boolean withAdult=age>=5&&age<=14;

        if(tooYong||withAdult){
        if(tooYong){
        System.out.println("Кататься еще нельзя");
        }
        if(withAdult){
        System.out.println("Можно в сопровождении взрослого");
        }
        }else{
        System.out.println("Можно даже одному");
        }


        }

private static void task31(){

        int age=25;
        boolean ageOfKindergarten=age>=2&&age<=6;
        boolean ageOfSchool=age>=7&&age<=18;
        boolean ageOfUniversity=age>18&&age<=24;
        if(ageOfKindergarten||ageOfSchool||ageOfUniversity){
        if(ageOfKindergarten){
        System.out.println("Если возраст человека равен "+age+" то ему нужно ходить в садик");
        }
        if(ageOfSchool){
        System.out.println("Если возраст человека равен "+age+" то ему нужно ходить в школу");
        }
        if(ageOfUniversity){
        System.out.println("Если возраст человека равен "+age+" то ему нужно ходить в университет");
        }
        }else{
        System.out.println("Если возраст человека равен "+age+" то ему нужно ходить на работу");
        }
        }

private static void task3(){
        int capacity=102;
        int seatPlaces=60;
        int numberOfPassengers=101;
        if(numberOfPassengers<seatPlaces){
        System.out.println("Сидячих мест в вагоне "+(seatPlaces-numberOfPassengers)+" всего мест в вагоне "+(capacity-numberOfPassengers));
        }
        if(capacity>numberOfPassengers&&numberOfPassengers>seatPlaces){
        System.out.println("Сидячих мест в вагоне нет, всего мест в вагоне "+(capacity-numberOfPassengers));
        }else{
        System.out.println("Вагон переполнен, мест нет");
        }


        }

private static void task2(){
        int age=4;
        if(age< 7){
        System.out.println("Ребенок ходит в садик");
        }else if(age>=7&&age< 18){

        System.out.println("Человек ходит в школу");
        }else if(age>=18&&age< 24){
        System.out.println("Человек может отправляться в университет");
        }else{
        System.out.println("Человек закончил университет и может искать первую работу");
        }
        }

private static void task1(){
        int age=55;

        if(age>=18){
        System.out.println("Поздравляем с совершеннолетием!");

        }else{
        System.out.println("Возраст соверщеннолетия не настал. Нужно немножко подождать!");
        }

        }
        }