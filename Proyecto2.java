/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
/**
 * Devuelve el contenido de un recurso interno
 * dentro del JAR en forma de String.
 * 
 * @param source Nombre del recurso.
 * @return El contenido del recurso en un String.
 */

/**
 *
 * @author laven
 */
public class Proyecto2 {

    /**
     *
     * @param ruta
     * @return
     */
    public static String leerArchivo(String ruta) {
        String content = "";
        try {
            content = Files.readString(new File(ruta).toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return content;
    }
    
    public static String ObtenerTitulo(String sData)
    {
        String sTextoaAutores = "Autores";
        int intIndex = sData.indexOf(sTextoaAutores);
        return (sData.substring(0, intIndex));
    }
    
    public static String ObtenerAutores(String sData)
    {
        String sTextoAutores = "Autores";
        String sTextoResumen = "Resumen";
        int intIndexAutores = sData.indexOf(sTextoAutores)+sTextoAutores.length()+1;
        int intIndexResumen = sData.indexOf(sTextoResumen);
        return (sData.substring(intIndexAutores, intIndexResumen));
    }
    
    public static String ObtenerResumen(String sData)
    {
        String sTextoResumen = "Resumen";
        String sTextoPalabras = "Palabras Claves";
        int intIndexResumen = sData.indexOf(sTextoResumen)+sTextoResumen.length()+1;
        int intIndexPalabras = sData.indexOf(sTextoPalabras);
        return (sData.substring(intIndexResumen, intIndexPalabras));
    }
    
    public static String ObtenerPalabrasClaves(String sData)
    {
        String sTextoPalabras = "Palabras Claves";
        int intIndexPalabras = sData.indexOf(sTextoPalabras)+sTextoPalabras.length()+2;
        return (sData.substring(intIndexPalabras, sData.length()));
    }
    
    public static int CuentaPalabraCable(String sData, String sPalabraClave)
    {
        boolean bContinuar = true;
        int nNroPalabras = 0;
        int currentPos = sData.indexOf(sPalabraClave);
        String sCurrentData = sData;
        if (currentPos != -1)
        {
            while(bContinuar)
            {
                if (currentPos != -1)
                {
                    nNroPalabras++;
                    bContinuar = true;
                    sCurrentData = sCurrentData.substring(currentPos+sPalabraClave.length(), sCurrentData.length());
                    currentPos = sCurrentData.indexOf(sPalabraClave);
                }
                else
                    bContinuar = false;
            }
        }
        return nNroPalabras;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = Proyecto2.class.getClassLoader().getResource("articulo01.txt").getPath();
        String content = leerArchivo(ruta);
        String sTitulo = ObtenerTitulo(content);
        
        String sAutores = ObtenerAutores(content);
        String sResumen = ObtenerResumen(content);
        String sPalabras = ObtenerPalabrasClaves(content);
        
        String ListaPalabras[];
        ListaPalabras = sPalabras.split(",");
        //ListaPalabras[ListaPalabras -1] = ListaPalabras[ListaPalabras.length()-1].replaceAll("\\.", "");
        int NroVecesPalabraClave = CuentaPalabraCable(sResumen, ListaPalabras[0]);
        
        System.out.println("'" + sTitulo + "'");
        System.out.println("'" + sAutores + "'");
        System.out.println("'" + sResumen + "'");
        System.out.println("'" + sPalabras + "'");
        System.out.println("Numero de veces de REST en el Resumen: '" + String.valueOf(NroVecesPalabraClave) + "'");
        
        
        
    }
    
}
