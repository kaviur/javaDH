import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
        //mensaje.
        String text1 = "Hola";
        String text2 = "hola";

        if(text1.equals(text2)){
            System.out.println("Los textos son iguales");
        }else{
            System.out.println("Son diferentes los textos");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del caballo");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad del caballo");
        int edad = scanner.nextInt();
        System.out.println("El caballo se llama "+nombre+" y tiene "+edad+" años");
    }

}