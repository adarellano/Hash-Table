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
    public static void insertPClave(ListaDoble[] hashTable, String PClave, int indiceResumen) {
    int indice = tablaHash.calcularHash(PClave);
    if (hashTable[indice] == null) {
        hashTable[indice] = new ListaDoble();
    }
    NodoDoble primero=  hashTable[indice].getpFirst();
    for( int p=0; p<hashTable[indice].getSize(); p++){
    if (primero.equals(PClave)) {
        primero.getListaAdy().AgregarFinal(Integer.toString(indiceResumen));
    } else {
        if (primero.getData().equals("")) {
            primero.setData(PClave);
            primero.getListaAdy().AgregarFinal(Integer.toString(indiceResumen));
        } else {
            while (!primero.getData().equals(PClave) && !primero.getData().equals("")) {
                indice = (indice + 1) % MAX_INDEX;
                if (primero == null) {
                    primero = new NodoDoble();
                }
            }
            if (primero.getData().equals(PClave)) {
                primero.getListaAdy().AgregarFinal(Integer.toString(indiceResumen));
            } else {
                primero.setData(PClave);
                primero.getListaAdy().AgregarFinal(Integer.toString(indiceResumen));
            }
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
    public static void imprimirElementos(ListaDoble[] hashTable) {
        int indice = 1;
        for (ListaDoble Elemento : hashTable) {
            if(Elemento!= null){
                NodoDoble aux= Elemento.getpFirst();
                for(int x=0;x<Elemento.getSize();x++){
            System.out.println(indice + " - " + aux.getData());
            indice++;
            aux = aux.getpNext();}
            
        }
    }
    }
}


