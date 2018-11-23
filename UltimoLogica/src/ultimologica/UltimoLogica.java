package ultimologica;

import java.util.Scanner;
/**
 *
 * @author leomare12
 */
public class UltimoLogica {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String frase;
        char aCar, aux;
        ListaLigada hilera = new ListaLigada();
        
        System.out.println("ingrese la frase: ");
        frase = sc.nextLine();
        for (int i=0; i<frase.length(); i++){
            hilera.CreaLista(frase.charAt(i));
            aux = hilera.MostrarHilera();
            System.out.print(aux);
        }
        System.out.println("");
        
        System.out.println("Ingrese el caracter a insertar: ");
        aCar = sc.nextLine().charAt(0);
        hilera.InsertCar(aCar);
        hilera.Intercambio();
        hilera.Elimina();
        
        for (int i=0; i<frase.length();i++){
            System.out.println(hilera.MostrarHilera());
        }
    }    
}
