import java.util.Scanner;

public class tamBolunme3ve4 {
    public static void main(String[] args) {
        int k, toplam = 0,adet =0;
        double ort;
        Scanner inp = new Scanner(System.in);

        System.out.print("L�tfen Say� giriniz : ");
        k = inp.nextInt();

        for (int i = 1; i <= k; i++){
            if (i%12 == 0){
                toplam += i;
                adet = k / 12;}}
        ort = toplam / adet;
        System.out.println("De�erlerin ortalmalar� : " + ort);


    }
}
