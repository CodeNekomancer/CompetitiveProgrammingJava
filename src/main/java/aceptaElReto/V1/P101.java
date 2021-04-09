package aceptaElReto.V1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author https://github.com/CodeNekomancer
 */
public class P101 { // Cuadrados diabólicos y esotéricos
    /**
     * Se considera un cuadrado mágico diabolico a la disposición de una serie de números enteros en un cuadrado de forma tal que la suma de los números por columna, fila y diagonales principales sea la misma. A esta suma se le llama constante mágica (CM). Para nuestro desarrollo consideraremos el cuadrado como una matriz con igual número de filas que de columnas.
     *
     * Si suponemos n la cantidad de filas o columnas del cuadrado, un cuadrado mágico diabólico es esotérico cuando, además de ser diabólico, cumple las siguientes condiciones:
     *
     *     Tiene las mismas cifras que el número de casillas. Es decir, siguen la serie de números naturales de 1 a n².
     *     La suma de sus esquinas debe ser la constante mágica 2 (CM2) que cumple que:
     *     CM2=4⋅CMn
     *
     *     Si n es impar:
     *         La suma de las cifras de las cuatro casillas de la mitad de los laterales suman la constante mágica 2.
     *         Si se multiplica el valor de la casilla central por 4, se obtiene la constante mágica 2.
     *     22	47	16	41	10	35	4
     *     5	23	48	17	42	11	29
     *     30	6	24	49	18	36	12
     *     13	31	7	25	43	19	37
     *     38	14	32	1	26	44	20
     *     21	39	8	33	2	27	45
     *     46	15	40	9	34	3	28
     *     	n = 7
     *     	Constante mágica = 175
     *     	Constante mágica 2 = 100
     *     Esquinas	22 + 4 + 46 + 28 = 100 (CM2)
     *     Centro	4 · 25 = 100 (CM2)
     *     Centro lados	41 + 13 + 37 + 9 = 100 (CM2)
     *     Si n es par:
     *         La suma de las dos casillas centrales de cada uno de los cuatro laterales suman el doble de la constante mágica 2 (2 · CM2)
     *         La suma de las cuatro casillas centrales da como resultado la constante mágica 2.
     *
     * 1	63	62	4	5	59	58	8
     * 56	10	11	53	52	14	15	49
     * 48	18	19	45	44	22	23	41
     * 25	39	38	28	29	35	34	32
     * 33	31	30	36	37	27	26	40
     * 24	42	43	21	20	46	47	17
     * 16	50	51	13	12	54	55	9
     * 57	7	6	60	61	3	2	64
     * 	n = 8
     * 	Constante mágica = 260
     * 	Constante mágica 2 = 130
     * Esquinas	1 + 8 + 57 + 64 = 130 (CM2)
     * Centro	28 + 29 + 36 + 37 = 130 (CM2)
     * Centro lados	4 + 5 + 25+ 33 + 60 + 61 + 32 + 40
     * 	= 260 (2 · CM2)
     *
     * 	 ------------------------------------------------------------------------------------------------------------------------------------------------------
     *
     * Entrada
     *
     * El programa leerá de la entrada estándar un cuadrado mágico tras otro. Cada cuadrado mágico consistirá en dos líneas. La primera línea contendrá el valor de n (2 ≤ n ≤ 1024). La segunda línea será los valores de las n² celdas, uno detrás de otro.
     *
     * La entrada termina cuando al leer el tamaño del siguiente cuadrado mágico se recibe un 0.
     * Salida
     *
     * Para un cuadrado esotérico, el programa escribirá ESOTERICO, para un cuadrado mágico diabólico (no esotérico) escribirá DIABOLICO. Para cualquier otro cuadrado, mostrará NO.
     *
     * Entrada de ejemplo
     *
     * 3
     * 4 9 2 3 5 7 8 1 6
     * 2
     * 1 2 3 4
     * 4
     * 16 3 2 13 5 10 11 8 9 6 7 12 4 15 14 1
     * 3
     * 28 21 26 23 25 27 24 29 22
     * 3
     * 2 8 1 6 3 5 7 4 9
     * 0
     *
     * Salida de ejemplo
     *
     * ESOTERICO
     * NO
     * ESOTERICO
     * DIABOLICO
     * NO
     */
    private static boolean definer = true;
    private static ArrayList<Integer> Sqr = new ArrayList<>();
    private static Integer n;

    private static void isEsoterico() {
        if (n%2==0) {

        } else {

        }
    }

    private static void isDiabolico() {
        if (n%2==0) {

        } else {

        }
    }

    private static void nIsOdd() {

    }

    private static void nIsEven() {
        Integer cSides = 0;
        Integer corn = 0;
        Integer cen;

        cSides += (
                Sqr.get(n/2+1) // Top
                + Sqr.get(n*n/2+1) // Left
                + Sqr.get(n*n/2+n // Right
                + Sqr.get(Sqr.size())-(n/2+1)) // Bot
                );

        corn += (
                Sqr.get(0) // TopL
                + Sqr.get(n) // TopR
                + Sqr.get(Sqr.size()-n) // BotL
                + Sqr.get(Sqr.size()) // BotR
                );

        cen = n*(n/2)+(n/2)+1;


    }

    private static void definerChanger() {
        definer = !definer;
    }

    private static void sqrMaker(String in) {
        if (definer) { // resets the input
            n = Integer.valueOf(in);
            Sqr.clear();
        } else {
            String Values[] =  in.split(" ");
            for (String item:Values) {
                Sqr.add(Integer.valueOf(item));
            }
        }

        if (n % 2 == 0) nIsOdd();
        else nIsEven();

        definerChanger();
    }

    private static Boolean looping(String in) {
        return in!="0";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String in;
        while (looping(in = sc.nextLine())) {

        }
    }
}
