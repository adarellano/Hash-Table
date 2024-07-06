package proyecto2ada;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ada Arellano
 */
public class tablaHash {
    
    public static int MAX_INDEX=50;
    
    
    /*static String[] hashTable = new String[19];*/

    public static int calcularHash(String s) {
        int valorHash = 0;
        int intContador = 1;
        for (char CadaCar : s.toCharArray()) {
            valorHash += intContador * (int) CadaCar;
            intContador++;
        }
        return valorHash % MAX_INDEX;
    }

    /**
     *
     * @param hashTable
     * @param DeTitulo
     * @return 
     */
    public static int insertData(String hashTable[], String DeTitulo) {
        int indice = tablaHash.calcularHash(DeTitulo);
        while (!(hashTable[indice].equals(""))) {
            indice = (indice + 1) % MAX_INDEX;
        }
        hashTable[indice] = DeTitulo;
        return indice;
    }

    /**
     *
     * @param hashTable
     * @param PClave
     * @param indiceResumen 
     */
    public static void insertPClave(NodoDoble hashTable[], String PClave, int indiceResumen) {
        int indice = tablaHash.calcularHash(PClave);
        if (hashTable[indice].getData().equals(PClave)) {
            hashTable[indice].getListaAdy().AgregarFinal(Integer.toString (indiceResumen));
        }
        else
        {
            if (hashTable[indice].getData().equals("")) 
            {
                hashTable[indice].setData(PClave);
                hashTable[indice].getListaAdy().AgregarFinal(Integer.toString (indiceResumen));
            }
            else
            {
                while (!hashTable[indice].getData().equals(PClave) && !hashTable[indice].getData().equals("")) 
                    indice = (indice + 1) % MAX_INDEX;
                if (hashTable[indice].getData().equals(PClave)) 
                    hashTable[indice].getListaAdy().AgregarFinal(Integer.toString (indiceResumen));
                else
                {
                    hashTable[indice].setData(PClave);
                    hashTable[indice].getListaAdy().AgregarFinal(Integer.toString (indiceResumen));
                }
            }
        }
    }
    
    /**
     *
     * @param hashTable
     * @param DeTitulo
     * @return 
     */
    public static boolean search(String hashTable[], String DeTitulo) {
        boolean valorRetorno=false;
        int index = tablaHash.calcularHash(DeTitulo);
        while (!hashTable[index].equals(DeTitulo) && !hashTable[index].equals("")) {
            index = (index + 1) % MAX_INDEX;
        }
         if (hashTable[index].equals(DeTitulo))
            valorRetorno=true;
        
        return valorRetorno;
    }

    /**
     *
     * @param hashTable
     */
    public static void imprimirElementos(String hashTable[]) {
        int indice = 1;
        for (String Elemento : hashTable) {
            System.out.println(indice + " - " + Elemento);
            indice++;
        }
    }
  
}
