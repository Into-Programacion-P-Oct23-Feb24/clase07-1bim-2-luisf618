/*
 Este codigo eleva un numero, en este caso 4, a una potencia, que este caso es
 el 3 mediante un ciclo que multiplica la base con un resultado y luego este
 cambia y se vuelve a multiplicar para asi sacar la potencia
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        // 2. numero, i[0, n]
        int numero;
        // 3. potencia, i[0, n]
        int potencia;
        // 6. resultado, i[0, n]
        int resultado;
        // numero <-- 4
        numero = 4;
        // 8. potencia <-- 3
        potencia = 3;
        // 9. resultado <-- 1
        resultado = 1;

        int contador = 1;

        do {
            resultado = resultado * numero;
            contador = contador + 1;
        } while (contador <= potencia);

        System.out.printf("%d\n", resultado);
    }
}
