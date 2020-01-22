/**
 * examenPracticoJF
 */
public class examenPracticoJF {

    public static void main(String[] args) {
        double temperatura1[] = { 8, 9, 7, 12, 10, 4, 15, 20, 15, 18, 12, 22 };
        double temperatura2[] = { 8, 9, 7, 12, 10, 4, 15, 20, 15, 17, 12, 21 };
        double temperatura3[] = { 8, 9, 7, 12, 10, 4, 15, 20, 15, 19, 12, 20 };
        double temperatura4[] = { 8, 9, 7, 12, 10, 4, 15, 20, 15, 16, 12, 27 };
        double temperatura5[] = { 8, 9, 7, 12, 10, 4, 15, 20, 15, 15, 12, 23 };
        System.out.println("Tamaño del array temperatura: " + temperatura1.length);
        System.out.println("Contenido de la primera casilla, temperatura1[0]: " + temperatura1[0]);
        // calcula temperatura 1
        double media1;
        double suma = 0;
        for (int i = 0; i < temperatura1.length; i++) {
            suma = suma + temperatura1[i];
        }

        media1 = (double) suma / temperatura1.length;
        System.out.println("La media de la temperatura 1 es: " + media1);
        // calcula temperatura 2
        double media2;
        for (int i = 0; i < temperatura2.length; i++) {
            suma = suma + temperatura1[i];
        }

        media2 = (double) suma / temperatura2.length;
        System.out.println("La media de la temperatura 2 es: " + media2);
        // calcula temperatura 3
        double media3;
        for (int i = 0; i < temperatura3.length; i++) {
            suma = suma + temperatura3[i];
        }

        media3 = (double) suma / temperatura3.length;
        System.out.println("La media de la temperatura 3 es: " + media3);

        // calcula temperatura 4
        double media4;
        for (int i = 0; i < temperatura4.length; i++) {
            suma = suma + temperatura3[i];
        }

        media4 = (double) suma / temperatura4.length;
        System.out.println("La media de la temperatura 4 es: " + media4);

        // calcula temperatura 5
        double media5;
        for (int i = 0; i < temperatura5.length; i++) {
            suma = suma + temperatura3[i];
        }

        media5 = (double) suma / temperatura5.length;
        System.out.println("La media de la temperatura 5 es: " + media5);

        //Media de cada estación
        double media;
        for(int i= 0; i<temperatura1.length; i ++) {
            suma = temperatura1[i] + temperatura2[i] + temperatura3[3] + temperatura4[i] + temperatura5[i];
            media = suma/5;
            System.out.println("pedir mes" +i+ "es" + media);
        }
    }
}