import java.util.Scanner;
/**
 * Aqui te muesto dos maneras de como sumar dos matrices 3x3.
 * Disfrutalo hombre!
 *
 * @author vilarj
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] suma = new int[3][3];

        // Llenando la primera matriz
        System.out.println("Entre la primera matriz: ");
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                matriz1[a][b] = input.nextInt();
            }
        }

        // Llenando la segunda matriz
        System.out.println("Entre la segunda matriz: ");
        for (int c = 0; c < 3; c++) {
            for (int d = 0; d < 3; d++) {
                matriz2[c][d] = input.nextInt();
            }
        }

        for (int e = 0; e < 3; e++) {
            for (int f = 0; f < 3; f++) {
                suma[e][f] = matriz1[e][f] + matriz2[e][f];
            }
        }

        // Suma de ambas matrices
        System.out.println("Suma de las matrices -> ");
        for (int g = 0; g < 3; g++) {
            for (int h = 0; h < 3; h++) {
                System.out.print(suma[g][h] + "\t");
            }
        }

        System.out.print("\n=S=E=G=U=N=D=O===E=J=M=P=L=O=\n");
        System.out.print(general());
    }

    /**
     * Esta funcion sumula otra opcion sin usar la clase Scanner. Por ende,
     * deberas de llenar explicitamente las matrices antes de sumarlas
     *
     * @return nada importante
     */
    public static String general () {
        int[][] a = {{2, 3, 2}, {1, 3, 1}, {4, 4, 2}};
        int[][] b = {{1, 3, 1}, {2, 3, 2}, {0, 4, 0}};
        int[][] c = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                c[i][k] = a[i][k] + b[i][k];
                System.out.print(c[i][k] + " ");
            }
            System.out.println(" ");
        }
        return ("=E=S=P=E=R=O===Q=U=E==T=E==A=Y=U=D=E=");
    }
}
