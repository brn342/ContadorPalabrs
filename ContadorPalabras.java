import java.util.List;

public class ContadorPalabras {

    public int[] contarVocales(String frase) {
        int contadorConsonantes = 0;
        int contadorVocales = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            } else if (Character.isLetter(letra)){
                contadorConsonantes++;
            }
        }
        return new int[]{contadorVocales, contadorConsonantes};
    }

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
class Principal {

    public static void main(String[] args) {
        String palabras = "Hola!Mundo 123";
        ContadorPalabras contador = new ContadorPalabras();

        System.out.println("Vocales en la frase: " + contador.contarVocales(palabras)[0] + ". Consonantes: " + contador.contarVocales(palabras)[1]);
        System.out.println(contador.contarPalabras(palabras));
    }
}
