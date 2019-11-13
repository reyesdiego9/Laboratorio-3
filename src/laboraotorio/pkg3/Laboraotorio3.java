
package laboraotorio.pkg3;

import java.util.Objects;
import java.util.Scanner;


public class Laboraotorio3 {

    public Laboraotorio3() {
    }
    Integer numero1 = 0, numero2 = 0, numero3 = 0;
    public void setIgual(int x, int y) {
        this.numero1 = x;
        this.numero2 = y;
        if (Objects.equals(numero1, numero2)) {
            System.out.print("\nlos numeros son iguales\t" + numero1);
        } else {
            System.out.print("\nlos numeros no son  iguales\t" + numero2);
        }
    }

    public void setmayor(int x, int y) {
        this.numero1 = x;
        this.numero2 = y;
        if (numero1 > numero2) {
            System.out.print("\nel numero 1 es mayor \t" + numero1);
        } else {
            System.out.print("\nel numero 2 es mayor\t" + numero2);
        }
    }

    public void setmenor(int x, int y) {
        this.numero1 = x;
        this.numero2 = y;

        if (numero1 < numero2) {
            System.out.print("\nel numero 1 es menor \t" + numero1);
        } else {
            System.out.print("\nel numero 2 es menor\t" + numero1);
        }
    }

    public double setecuacion(int x, int y, int z) {

        this.numero1 = x;
        this.numero2 = y;
        this.numero3 = z;
        double pote = Math.pow(2, y);
        double raiz = Math.sqrt(pote - 4 * x * z);
        double resp = (-y + raiz) / (2 * x);

        return resp;

    }

    public double setraiz(int x) {
        this.numero1 = x;
        double raiz = Math.sqrt(x);
        double resp = raiz;
        return resp;
    }

    public void setsuma(int x, int y) {
        this.numero1 = x;
        this.numero2 = y;
        double suma = x + y;
        System.out.print("SUMA: " );
        System.out.print("Numero (1) " + numero1);
        System.out.print(" Numero t" + numero2);
        System.out.print(" Resultado de la suma " + suma);

    }

    public void setresta(int x, int y) {
        Scanner n = new Scanner(System.in);
        this.numero1 = x;
        this.numero2 = y;
        double resta = x - y;
             System.out.print("\t RESTA:" );
        System.out.print(" Numero (1) " + numero1);
              System.out.print(" Numero (2) " + numero2);
        System.out.print(" Resultado de la resta  " + resta);

    }

    public void setmulti(int x, int y) {
        Scanner n = new Scanner(System.in);
        this.numero1 = x;
        this.numero2 = y;
        double multi = x * y;
          System.out.print("\n\t MULTIPLICACION:" );
          System.out.print("\nNumero (1)\t" + numero1);
              System.out.print("\nNumero (2)\t" + numero2);
        System.out.print("\nResultado de la multiplicacion\t" + multi);

    }

    public void setdiv(int x, int y) {
        Scanner n = new Scanner(System.in);
         System.out.print("\n\t DIVISION:" );
        this.numero1 = x;
        this.numero2 = y;
        double div = x / y;
           System.out.print("\nNumero (1)\t" + numero1);
              System.out.print("\nNumero (2)\t" + numero2);
        System.out.print("\nResultado de la division\t" + div);

    }

    public void setelevacion(int x, int y) {
        Scanner n = new Scanner(System.in);
        this.numero1 = x;
        this.numero2 = y;
        double e1 = x * x;
        double e2 = y * y;
                System.out.print("\n\t NUMEROS ELEVADOS AL CUADRADO:" );
         System.out.print("\n Numero(1):\t" + numero1);
          System.out.print("\n Numero (2):\t" + numero2);
        System.out.print("\nNumero(1) al cuadrado:\t" + e1);
        System.out.print("\n Numero(2) al cuadrado:\t" + e2);

    }

    public void settra(int x, int y, int z) {
        Scanner n = new Scanner(System.in);
        this.numero1 = x;
        this.numero2 = y;
        this.numero3 = z;
        System.out.print("\n\t NUMEROS CHINOS:" );
        System.out.print("\n Numero:\t" + numero1);
        System.out.print("\t Numero en chino : 		十\t");
        System.out.print("\nNumero:\t" + numero2);
        System.out.print("\t Numero en chino : 		五\t");
        System.out.print("\nNumero:\t" + numero3);
        System.out.print("\t Numero en chino : 		九\t");

    }

    public static void main(String[] args) {
        System.out.print("\tOPERACIONES:");
        Laboraotorio3 condicional = new Laboraotorio3();
        condicional.setIgual(10, 5);
        condicional.setmayor(10, 5);
        condicional.setmenor(10, 5);
        condicional.setecuacion(3, 5, 6);
        System.out.print("\nResultado de la raiz postiva\t" + condicional.setecuacion(5, 10, 2));
        condicional.setraiz(16);
        System.out.print("\nSu Raiz cuadrada: \t" + condicional.setraiz(16));
        condicional.setsuma(10, 5);
        condicional.setresta(10, 5);
        condicional.setmulti(10, 5);
        condicional.setdiv(10, 5);
        condicional.setelevacion(10, 5);
        condicional.settra(10, 5, 9);
    }
    
}
