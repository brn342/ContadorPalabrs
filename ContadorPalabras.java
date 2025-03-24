import java.util.List;

public class ContadorPalabras {

    public int contarPalabras(String frase) {
        boolean enPalabra = false;

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (Character.isLetter(c)) {
                if (!enPalabra) {
                    contador++;
                    enPalabra = true;
                }
            } else {
                enPalabra = false;
            }
        }
        return contador-1;

    }

}
class Principal {

    public static void main(String[] args) {
        String palabras = "kjlaehfhujoaef aefioajeoifjioaefoiaonae oaenf1faiopf dwdwdw wcwdwd f 67git fnfffw efefe f f f";
        ContadorPalabras contador = new ContadorPalabras();
        System.out.println(contador.contarPalabras(palabras));
    }
}
