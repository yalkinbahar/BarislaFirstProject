import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RepeaterNumber {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scanner.nextInt();
        int myArray[] =new int[number];
        Random rnd=new Random();
        List<Integer> myList =new ArrayList<Integer>();

        int count=0;
        for (int i=0; i<myArray.length;i++){
            for (int j=0; j<myArray.length;j++){
                myArray[i]=rnd.nextInt(6)+1;
            }
            System.out.println(myArray[i] +" --- ");
        }

        for (int i = 0; i < myArray.length; i++) {
            if (myList.contains(myArray[i]) == false) {
                myList.add(myArray[i]);
            }
        }


        for (Integer k : myArray) {
            int sayac=0;
            for (int i = 0; i < myArray.length; i++) {


                if (k.equals(myArray[i])) {
                   sayac++;
                }
            }
            if(sayac>1){
                System.out.println(k+ " " + sayac + " kere tekrarlandı");

            }


        }
        /* bende bi sayı girmemi istesin sayı n olsun
           n büyüklügünde bir dizi oluştursun
           0 dahil degil :D
           n-1 dahil ama
           o dizide tekrar eden sayıyı bulup bana göstersin*/



     /*   Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scanner.nextInt();
        int myArray[] =new int[number];
        Random rnd=new Random();

        int count=0;
        for (int i=0; i<myArray.length;i++){
            for (int j=0; j<myArray.length;j++){
               myArray[i]=rnd.nextInt(6)+1;
                }
            System.out.println(myArray[i] +" --- ");
            }


        for (int i=0; i<myArray.length;i++){
            int counter=0;
            for (int j=1; j<myArray.length;j++) {
                if(myArray[i]==myArray[j]){
                    counter++;
                }
            }

            if(counter>1){
                System.out.println(myArray[i] + " is the repeater number " +counter + " times repeats ");
                break;
            }
            }


      */
        }
            }





