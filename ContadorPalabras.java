public class ContadorPalabras {

    public int contarPalabras(String palabras) {

        int contadorEspacios = 0;
        int hayLetra = 0;

        for (int i = 0; i < palabras.length(); i++) {
            char letra = palabras.charAt(i);
            if (letra == ' ') {
                contadorEspacios++;
            } else if (Character.isLetter(letra)) {
                hayLetra++;
            }
        }
        contadorEspacios = contadorEspacios + 1;
        if (hayLetra > 0) {
            return contadorEspacios;
        } else return -1;
    }

}
    class Principal {

        public static void main(String[] args) {
            String palabras = "123 2446";
            ContadorPalabras contador = new ContadorPalabras();
            int cantidadPalabras = contador.contarPalabras(palabras);
            if(cantidadPalabras == -1){
                System.out.println("No es válido (no hay caracteres alfabéticos)");
            } else {System.out.println(cantidadPalabras);}
        }


    }

