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
     *Inserta la data al hashtable, clave hash del titulo
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
     *INserta las palabras claves con su clave hash en la hash table de palabras claves
     * @param hashTable
     * @param PClave
     * @param indiceResumen 
     */
    public static void insertPClave(NodoDoble hashTable[], String PClave, int indiceResumen) {
        String PClaveNueva = PClave.replaceAll("[\\r\\n]+", " ").replaceAll("\\s+", " ").trim();
        int indice = tablaHash.calcularHash(PClaveNueva);
        if (hashTable[indice].getData().equals(PClaveNueva)) {
            hashTable[indice].getListaAdy().AgregarFinal(Integer.toString (indiceResumen));
        }
        else
        {
            if (hashTable[indice].getData().equals("")) 
            {
                hashTable[indice].setData(PClaveNueva);
                hashTable[indice].getListaAdy().AgregarFinal(Integer.toString (indiceResumen));
            }
            else
            {
                while (!hashTable[indice].getData().equals(PClaveNueva) && !hashTable[indice].getData().equals("")) 
                    indice = (indice + 1) % MAX_INDEX;
                if (hashTable[indice].getData().equals(PClaveNueva)) 
                    hashTable[indice].getListaAdy().AgregarFinal(Integer.toString (indiceResumen));
                else
                {
                    hashTable[indice].setData(PClaveNueva);
                    hashTable[indice].getListaAdy().AgregarFinal(Integer.toString (indiceResumen));
                }
            }
        }
    }
    
    /**
     *busca el titulo en la tabla hash de titulos
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
     *imprime los elementos de la hastable
     * @param hashTable
     */
    public static void imprimirElementos(ListaDoble[] hashTable) {
        int indice = 1;
        for (ListaDoble Elemento : hashTable) {
            if(Elemento!= null){
                NodoDoble aux= Elemento.getpFirst();
                              
                
                for(int x=0 ;x<Elemento.getSize() ;x++){
                System.out.println(indice + " - " + aux.getData());
                indice++;
                aux = aux.getpNext();}
            
        }
    }
    }
}
