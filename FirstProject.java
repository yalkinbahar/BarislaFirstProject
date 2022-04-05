import java.util.Scanner;

public class FirstProject {

    public static void main(String[] args) {



        int min;
        int temp;
        int sayi=0;


        Scanner scanner=new Scanner(System.in);

        do {
            System.out.println("Lütfen dizinizin kaç sayı içereceği bilgisini POZİTİF bir sayı ile giriniz sinirimi bozmayınız:) ");
            sayi= scanner.nextInt();

        }
        while(sayi<=0 ) ;



        int dizi[] = new int[sayi];

        for (int k=0;k<sayi;k++){
            System.out.println("lütfen " + k + ". sayiyi giriniz");
            dizi[k] = scanner.nextInt();
        }


       for (int i=0; i<dizi.length; i++){
           for (int j=0;j<dizi.length-1;j++){

               if(dizi[i]<dizi[j]){

                   temp=dizi[i];
                   dizi[i]=dizi[j];
                   dizi[j]=temp;

               }
           }

       }
       for (int k=0; k<dizi.length;k++){
           System.out.println(dizi[k]);
       }




    }
}
