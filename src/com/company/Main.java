package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task6();
//        task7();
//        task8();
        task9();

    }

    private static void task9() {
        System.out.println("Ввдите размер масива: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] array1 = new int[x];
        int[] array2 = new int[x];
        for (int i = 0; i<array1.length; i++){
            array1[i] = (int) (Math.random()*100);
            array2[i]=array1[i];
            System.out.printf(" %3d,",array1[i]);
        }
        System.out.println(" ");
        for (int i=0;i<array1.length;i++){
            if((i+1)%2==1){
                if( array1[i]%2==0){
                    array1[i]=0;
                }
            }
            System.out.printf(" %3d,",array1[i]);
        }
        System.out.println(" ");
        for (int i = 0; i<array2.length; i++){
            if (array2[i]%3==0 || array2[i]%5==0){
                array2[i]=0;
            }
            System.out.printf(" %3d,",array2[i]);
        }
        System.out.println(" ");
    }

    private static void task8() {
        int[] array = new int[20];
        for (int i = 0; i<array.length;i++){
            array[i]=(int) ((Math.random()*100) - 50);
            System.out.printf(" %3d,", array[i]);
        }
        System.out.println(" ");
        for (int i =0; i < array.length;i++){
            if (array[i]<0){ array[i]=0;}
            System.out.printf(" %3d,", array[i]);
        }
        System.out.println(" ");
        System.out.println("Введите max значение элемента массива: ");
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        for (int i = 0; i< array.length;i++){
            if(array[i]>max){array[i]=0;}
            System.out.printf(" %3d,", array[i]);
        }
        System.out.println(" ");
        System.out.println("Введите интервал замены значения элементов от: ");
        int n_min = scanner.nextInt();
        System.out.println("до: ");
        int n_max = scanner.nextInt();
        if (n_min<n_max && n_min>0){
            for (int i = (n_min-1); i<= (n_max-1);i++){
                array[i]=0;
            }
        }else {
            System.out.println("С данными значениями выполнить замену не возможно :)");
        }
        for (int i: array) {
            System.out.printf(" %3d,", i);

        }
    }

    private static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int x = scanner.nextInt();
        int [] array = new int[x];

        for (int i = 0; i< array.length; i++){
            array[i]=(int) (Math.random()*10);
        }
        for (int i: array) {
            System.out.print(" "+i+",");
        }
        System.out.println(" ");
        for (int i = 0; i<array.length;i++){
            for (int j = 0; j<array.length;j++){
                if (j!=i){
                    if (array[i]==array[j]) {array[j]=0;}
                }
            }
        }
        for (int i: array) {
            System.out.print(" "+i+",");
        }
    }

    private static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int x = scanner.nextInt();
        int [] array = new int[x];

        for (int i = 0; i< array.length; i++){
            array[i]=(int) (Math.random()*10);
        }
        int temp_max = array[0];
        int temp_min = array[0];
        for (int i= 0; i< array.length;i++) {
            if( array[temp_max] < array[i]){temp_max=i;}
            if (array[temp_min]>array[i]){temp_min = i;}
            }
        System.out.println("Max= "+ array[temp_max]+" , Min= "+array[temp_min]);
        array[temp_max]=0;
        array[temp_min]=0;
        System.out.println("Max= "+ array[temp_max]+" , Min= "+array[temp_min]);
    }


    private static void task3() {
        int x,y,z;//обязательная, короткая, произвольная программы
        x=y=z=0;
        int[] array = new int[18];
        for (int i= 0; i< array.length;i++){
            array[i]= (int) (Math.random()*10);
            if (i<6) {x+=array[i];}
            if(i>5 && i<12){
                z+=array[i];
            }else if(i>11){
                y+=array[i];
            }
        }

        System.out.printf("У спортсмена по обязательной программе %d баллов\n" +
                "по короткой программе %d баллов\n " +
                "по произвольной программе %d баллов\n ",x,y,z);
        if (x>=y && x>z){

                System.out.println("Лучший результат по обязательной программе");
            }else if(y>x && y>=z){
            System.out.println ("Лучший результат по короткой программе");
                }else {System.out.println("Лучший результат по произвольной программе");}
    }

    private static void task2() {
        int [] scores = new int[10];
        int sum=0;
        int to_go = 50;

        for(int i = 0; i<scores.length;i++){
            scores[i] = (int)(Math.random()*10);
        }
        for (int i :scores) {
            sum+=i;
        }
        System.out.println(sum>=to_go?"Прошел "+sum :"Не прошел "+sum);
    }

    private static void task1() {
        int [] library = new int [35];
        int x= 0;
        int sum =0;
        int bitness=0;

        for(int i = 0; i < library.length; i++){
            library[i]= (int) (Math.random()*10000);
}
        for (int i = 0;i<library.length;i++) {
sum += library[i];
}
        do {
            sum/=10;
            bitness++;
        }while (sum >0);
        if (bitness >= 6) {
            System.out.println("Правда");
        } else {
            System.out.println("Не правда "+bitness);
        }
    }
}

