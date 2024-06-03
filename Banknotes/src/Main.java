import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conta = scanner.nextInt();
        metodo(conta);
    }
    static void metodo (double conta){
        Scanner scanner = new Scanner(System.in);
        int cemReais = 0, cinquentaReais = 0, vinteReais = 0, dezReais = 0, cincoReais = 0, doisReais = 0, umReal = 0;

        if (conta > 0) {
            while (conta > 0) {
                if (conta >= 100) {
                    conta -= 100;
                    cemReais++;
                } else if (conta >= 50) {
                    conta -= 50;
                    cinquentaReais++;
                } else if (conta >= 20) {
                    conta -= 20;
                    vinteReais++;
                } else if (conta >= 10) {
                    conta -= 10;
                    dezReais++;
                } else if (conta >= 5) {
                    conta -= 5;
                    cincoReais++;
                } else if (conta >= 2) {
                    conta -= 2;
                    doisReais++;
                } else if (conta >= 1) {
                    conta -= 1;
                    umReal++;
                }
            }
        }
        else{
            System.out.println("Presentation Error");
        }
        System.out.println(cemReais + " nota(s) de R$ 100,00");
        System.out.println(cinquentaReais + " nota(s) de R$ 50,00");
        System.out.println(vinteReais + " nota(s) de R$ 20,00");
        System.out.println(dezReais + " nota(s) de R$ 10,00");
        System.out.println(cincoReais + " nota(s) de R$ 5,00");
        System.out.println(doisReais + " nota(s) de R$ 2,00");
        System.out.println(umReal + " nota(s) de R$ 1,00");
    }

}