import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // // 1- SALUDAR!
        // // Pides saludo y nombre y te responde ‘Hola Andrés’.
        // // 1.1- Llamas a la función, sin parámetros, y sin return, y te hace el programa (resultado ejemplo: ‘Hola Andrés’).
        // saludar1();
        // // 1.2 -- Llamas a la función, con parámetros (saludo y nombre), y sin return, y muestra el resultado DENTRO de la función (resultado ejemplo: ‘Hola Andrés’).
        // Scanner teclado = new Scanner(System.in); 
        // System.out.println("Dime tu saludo preferido.");
        // String saludo2 = teclado.nextLine();
        // System.out.println("Dime tu nombre.");
        // String nombre2 = teclado.nextLine();
        // saludar2(saludo2, nombre2);
        // // 1.3- Llamas a la función, con parámetros (saludo y nombre), y con return, y muestra el resultado FUERA de ese método, y dentro del main() (resultado ejemplo: ‘Hola Andrés’).
        // System.out.println("Dime tu saludo preferido.");
        // String saludo3 = teclado.nextLine();
        // System.out.println("Dime tu nombre.");
        // String nombre3 = teclado.nextLine();
        // System.out.println(saludar3(saludo3, nombre3));

        // 2- CALCULAR
        // Con switch, preguntar la operación, y con switch envíalo a una función diferente
        // ( ‘sumar’, ‘restar’, ‘multiplicar’ y ‘dividir’ )que retorne el resultado a la opción del switch y se
        // muestre en terminal.
        Scanner teclado = new Scanner(System.in);
        String operacion = "";
        while (!operacion.equals("salir")){
            System.out.println("¿Qué operación con números enteros quieres realizar? Sumar|Restar|Multiplicar|Dividir|Escribir. Introduce 'salir' para salir.");
                    operacion = teclado.nextLine().toLowerCase();
                    switch (operacion) {
                        case "sumar":
                            System.out.println("Introduce el primer número.");
                            int numeroSuma1 = Integer.parseInt(teclado.nextLine());
                            System.out.println("Introduce el segundo número.");
                            int numeroSuma2 = Integer.parseInt(teclado.nextLine());
                            System.out.println("El resultado de tu suma es " + sumar(numeroSuma1, numeroSuma2));
                            break;
                        case "restar":
                            System.out.println("Introduce el número al que le restarás.");
                            int numeroResta1 = Integer.parseInt(teclado.nextLine());
                            System.out.println("Introduce el número a restar.");
                            int numeroResta2 = Integer.parseInt(teclado.nextLine());
                            System.out.println("El resultado de tu resta es " + restar(numeroResta1, numeroResta2));
                            break;
                        case "multiplicar":
                            System.out.println("Introduce el primer número.");
                            int numeroMulti1 = Integer.parseInt(teclado.nextLine());
                            System.out.println("Introduce el segundo número.");
                            int numeroMulti2 = Integer.parseInt(teclado.nextLine());
                            System.out.println("El resultado de tu multiplicación es " + multiplicar(numeroMulti1, numeroMulti2));
                            break;
                        case "dividir":
                            System.out.println("Introduce el primer número (divisor).");
                            int numeroDivision1 = Integer.parseInt(teclado.nextLine());
                            System.out.println("Introduce el segundo número (dividendo).");
                            int numeroDivision2 = Integer.parseInt(teclado.nextLine());
                            System.out.println("El resultado de tu división es " + dividir(numeroDivision1, numeroDivision2));
                            break;
                        // +EXTRA: usar char y (+, -, *,/)
                        case "escribir":
                            System.out.println("Escribe la operación. Ejemplo: 1+3");
                            String operacionEscrita = teclado.nextLine();
                            operacionManual(operacionEscrita);
                            break;
                        default:
                            System.out.println("Lo siento, no reconozco esa operación.");
                            break;
                        case "salir":
                    }
        }
       

        // 3- CACATÚA CACAHUETES!
        cacatuaCacahuetes();

        // Tienes una cacatúa que todo el rato te pide comer cacahuetes, diciendo “cacatúa cacahuetes!”.

        // El programa te pregunta qué comida le das.

        // Mientras NO sean cacahuetes, sigue diciendo “cacatúa cacahuetes!”


        // Pero si le das cacahuetes, llama al método ‘dormirse’ y se calla, y en vez del mensaje anterior,
        // vemos ‘zzZzzzz…’ (aquí acaba el programa)

        // *EXTRA: realizar no solo el método 'dormirse()', sino también el de 'pideComida()'
        teclado.close();
    }


    // public static void saludar1(){
    //     // 1.1- Llamas a la función, sin parámetros, y sin return, y te hace el programa (resultado ejemplo: ‘Hola Andrés’).
    //     Scanner teclado = new Scanner(System.in); 
    //     System.out.println("Dime tu saludo preferido.");
    //     String saludo = teclado.nextLine();
    //     System.out.println("Dime tu nombre.");
    //     String nombre = teclado.nextLine();
    //     System.out.println("¡" + saludo + " " + nombre + "!");
    // }
    // public static void saludar2(String saludo, String nombre){
    //     // 1.2 -- Llamas a la función, con parámetros (saludo y nombre), y sin return, y muestra el resultado DENTRO de la función (resultado ejemplo: ‘Hola Andrés’).
    //     System.out.println("¡" + saludo + " " + nombre + "!");
    // }
    // public static String saludar3(String saludo, String nombre){
    //     // 1.3- Llamas a la función, con parámetros (saludo y nombre), y con return, y muestra el resultado FUERA de ese método, y dentro del main() (resultado ejemplo: ‘Hola Andrés’).
    //     return ("¡" + saludo + " " + nombre + "!");
    // }
    public static Integer sumar(Integer numero1, Integer numero2){
        return (numero1 + numero2);
    }
    public static Integer restar(Integer numero1, Integer numero2){
        return (numero1 - numero2);
    }
    public static Integer multiplicar(Integer numero1, Integer numero2){
        return (numero1 * numero2);
    }
    public static double dividir(Integer numero1, Integer numero2){
        return (double)((double)numero1 / (double)numero2);
    }
    public static void operacionManual(String operacionEscrita){
        String[] arrayOperacion = operacionEscrita.split("[x+\\-*/÷]");

        if ((arrayOperacion.length != 2)){
            System.out.println("Input no reconocido. Escribe dos números enteros separados por un símbolo (+-*x/÷).");
        } else{
            Integer n1 = Integer.parseInt(arrayOperacion[0]);
            Integer n2 = Integer.parseInt(arrayOperacion[1]);
            if (operacionEscrita.contains("+")){
                System.out.println("El resultado de tu suma es " + sumar(n1, n2));
            } else if (operacionEscrita.contains("-")){
                System.out.println("El resultado de tu resta es " + restar(n1, n2));
            } else if ((operacionEscrita.contains("*"))||(operacionEscrita.contains("x"))){
                System.out.println("El resultado de tu multiplicación es " + multiplicar(n1, n2));
            } else if (operacionEscrita.contains("/")||operacionEscrita.contains("/")||operacionEscrita.contains("÷")){
                System.out.println("El resultado de tu división es " + dividir(n1, n2));
            }
        }
    }

    public static void cacatuaCacahuetes(){
        Scanner teclado = new Scanner(System.in);
        String comida = "";
        pideComida(comida, teclado);
    }
    public static void dormirse(){
        System.out.println("Zzzzzzzz");
    }
    public static void pideComida(String comida, Scanner teclado){
        while (!comida.equals("cacahuetes")){
            System.out.println("Cacatúa cacahuetes!");
            comida = teclado.nextLine();
        }
        if (comida.equals("cacahuetes")){
            dormirse();
        }
    }
}
