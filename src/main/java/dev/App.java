package dev;

import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //FIGlet
    	//Font: avatar
    	System.out.println( "Hello World!" );
    	
    	String titre = ResourceBundle.getBundle("application").getString("titre");
    	
    	// using default font standard.flf, obtained from maven artifact
        String asciiArt1 = FigletFont.convertOneLine(titre);
        System.out.println(asciiArt1);
        
        //affichage de l'envoronnement
        String environnement = ResourceBundle.getBundle("application").getString("environnement");
        System.out.println("Environnement : " + environnement);
    	
    }
}
