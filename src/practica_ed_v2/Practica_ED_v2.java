/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_ed_v2;

import java.util.Scanner;

/**
 *
 * @author alexlexu
 */
public class Practica_ED_v2 {

    public static boolean esVocal(char letra)
    {
        boolean loes = false;
        
        if( letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')
        {
            loes = true;
        }
        
        return loes;
    }
    
    public static String cambiarVocalesMayuscula(String frase)
    {
        String frasenueva = "";
        
        for (int i = 0; i < frase.length(); i++) 
        {
            if( esVocal(frase.charAt(i)) )
            {
                String vocalnueva = "" + frase.charAt(i);
                frasenueva += vocalnueva.toUpperCase();
            }
            else
            {
                frasenueva += frase.charAt(i);
            }
        }
        
        return frasenueva;
    }
     public static String cambiarConsonantesMinuscula(String frase)
    {
        String frasenueva = "";
        
        for (int i = 0; i < frase.length(); i++) 
        {
            if( !esVocal(frase.charAt(i)) )
            {
                String vocalnueva = "" + frase.charAt(i);
                frasenueva += vocalnueva.toLowerCase();
            }
            else
            {
                frasenueva += frase.charAt(i);
            }
        }
        
        return frasenueva;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String frase;
        
        System.out.println("Introduce una frase");
        frase = teclado.nextLine();
        
        String resultado = cambiarVocalesMayuscula(frase);
        resultado = cambiarConsonantesMinuscula(resultado);
        
        System.out.println("La frase final es: " + resultado);
    }
    
}
