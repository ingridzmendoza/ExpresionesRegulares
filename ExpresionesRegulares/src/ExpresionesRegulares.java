import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Elije una expresion a probar: ");
        int opcion = scanner.nextInt();

        Scanner scannerCadena = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String cadena = scannerCadena.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Validar frase exacta 'Hola mundo':\t");
                Pattern pat = Pattern.compile("Hola mundo");
                Matcher mat = pat.matcher(cadena);
                if(mat.matches()){
                    System.out.println("Validacion Exitosa");
                } else {
                    System.out.println("Error en la validacion");
                }
                break;
            case 2:
                System.out.println("Validar 'Hola Mundo' en Mayusculas/Minusculas:\t");
                Pattern pat1 = Pattern.compile(".*[Hh][Oo][Ll][Aa] [Mm][Uu][Nn][Dd][Oo].*");
                Matcher mat1 = pat1.matcher(cadena);
                if(mat1.matches()){
                    System.out.println("Validacion Exitosa");
                } else {
                    System.out.println("Error en la validacion");
                }
                break;
            case 3:
                System.out.println("Validar 'Java, Python, Go, Pascal, o Pearl':\t");
                Pattern pat2 = Pattern.compile(".*(Java|Python|Go|Pascal|Perl).*");
                Matcher mat2 = pat2.matcher(cadena);
                if(mat2.matches()){
                    System.out.println("Validacion Exitosa");
                } else {
                    System.out.println("Error en la validacion");
                }
                break;
            case 4:
                System.out.println("Validar dominio de correo Unison:\t");
                Pattern pat3 = Pattern.compile("[\\w.%+-]+@(unison|uson)\\.mx$");
                Matcher mat3 = pat3.matcher(cadena);
                if(mat3.matches()){
                    System.out.println("Validacion Exitosa");
                } else {
                    System.out.println("Error en la validacion");
                }
                break;
            case 5:
                System.out.println("Validar nombre de archivo:\t");
                Pattern pat4 = Pattern.compile("^ISI\\d{4}-(1|2)\\.(txt|csv)$");
                Matcher mat4 = pat4.matcher(cadena);
                if(mat4.matches()){
                    System.out.println("Validacion Exitosa");
                } else {
                    System.out.println("Error en la validacion");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }

    }
}
