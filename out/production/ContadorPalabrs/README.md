# ContadorPalabrs

class ContadorPalabras {

    public int contarPalabras(String palabras) {

        int contadorPalabras = 0;
        boolean recorriendoPalabra = false;
        boolean hayLetra = false;

        for (int i = 0; i < palabras.length(); i++) {

            char letra = palabras.charAt(i);

            if (Character.isLetterOrDigit(letra)) {
                if (Character.isLetter(letra)) {
                    hayLetra = true;
                }
                if (!recorriendoPalabra) {
                    recorriendoPalabra = true;
                }
            } else {
                if (recorriendoPalabra && hayLetra) {
                    contadorPalabras++;
                }
                recorriendoPalabra = false;
                hayLetra = false;
            }
        }

        if (recorriendoPalabra && hayLetra) {
            contadorPalabras++;
        }

        return contadorPalabras;
    }
}


public class Main {
    public static void main(String[] args) {
        ContadorPalabras contador = new ContadorPalabras();

        String ejemplo1 = "Hola mundo 123"; // Debe contar 2 palabras ("Hola", "mundo")
        String ejemplo2 = "C# es genial! 42programadores"; // Debe contar 2 palabras ("es", "genial")
        String ejemplo3 = "123 456 789"; // No debe contar ninguna palabra (0)
        String ejemplo4 = "Hola.Mundo";


        System.out.println("Ejemplo 1: " + contador.contarPalabras(ejemplo1));
        System.out.println("Ejemplo 2: " + contador.contarPalabras(ejemplo2));
        System.out.println("Ejemplo 3: " + contador.contarPalabras(ejemplo3));
        System.out.println("Ejemplo 4: " + contador.contarPalabras(ejemplo4));

    }
}


