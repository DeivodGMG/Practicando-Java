/*Utiliza este proyecto para practicar el lenguaje java.
 *Puedes utilizarlo ya sea para un examen, ganar practica o
 *simplemente para volverte un pro. 
 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        //Crear scanner
        Scanner scanner = new Scanner(System.in);
        //Manejo de strings
        String marucha = "Marucha de pollo";
        String maruchaRes = marucha.replace("pollo", "res");
        System.out.println(marucha);
        System.out.println(maruchaRes);
        //True o false y el string termina en pollo
        System.out.println(marucha.endsWith("pollo"));
        //True o false y el string empieza con la letra M
        System.out.println(marucha.contains("M"));
        //Muestra la posicion de donde se ubica el caracter
        System.out.println(marucha.indexOf("p"));
        String malisimo = "   Hola pa todos  :)";
        //Borra los saltos de caracteres al comienzo y al final del string
        System.out.println(malisimo.trim());
        //== CARACTERES DE ESCAPE ==
        System.out.println("C:\\~\\home\\DeivodGMG>");
        System.out.println("Hola\t¿Como estas?");
    }
}