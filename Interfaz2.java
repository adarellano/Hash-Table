/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import static proyecto2.tablaHash.imprimirElementos;

/**
 *
 * @author Ada Arellano y Adolfo Barberi
 */
public class Interfaz2 extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz2
     */
    public resumen resumenObj;
    resumen ListaResumenes[] = new resumen[50];
    static String[] hTitulos = new String[50];
    static ListaDoble[] hPClaves = new ListaDoble[50];
    int intHashCal;
    DefaultListModel<String> modelo = new DefaultListModel<>();
    private String[] rutasArchivos = new String[50]; 
    private int contadorArchivos = 0;
    public Interfaz2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        analizar_resumen = new javax.swing.JToggleButton();
        cargar_resumen = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        input_buscar = new javax.swing.JTextField();
        search_pclave = new javax.swing.JToggleButton();
        search_autor = new javax.swing.JToggleButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        info_resumen = new javax.swing.JTextArea();
        salir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        info_estadisticas = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        titulo_cargado = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        resuemen_cargado = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        agregar_lista = new javax.swing.JButton();
        mostrar_inforesumen = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        Lista_resumenes = new javax.swing.JTextArea();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jPanel1.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 290, 100));

        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        analizar_resumen.setText("Analizar resumen");
        analizar_resumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizar_resumenActionPerformed(evt);
            }
        });

        cargar_resumen.setText("Cargar Archivo");
        cargar_resumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargar_resumenActionPerformed(evt);
            }
        });

        jLabel1.setText("Titulos");

        jLabel2.setText("Articulos Científicos");

        jLabel3.setText("Buscar");

        input_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_buscarActionPerformed(evt);
            }
        });

        search_pclave.setText("Buscar por palabra clave");
        search_pclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_pclaveActionPerformed(evt);
            }
        });

        search_autor.setText("Buscar por autor");

        info_resumen.setColumns(20);
        info_resumen.setRows(5);
        jScrollPane5.setViewportView(info_resumen);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        info_estadisticas.setColumns(20);
        info_estadisticas.setRows(5);
        jScrollPane3.setViewportView(info_estadisticas);

        titulo_cargado.setColumns(20);
        titulo_cargado.setRows(5);
        jScrollPane7.setViewportView(titulo_cargado);

        jScrollPane8.setViewportView(resuemen_cargado);

        jLabel4.setText("Lista");

        jLabel5.setText("Lista de resumenes");

        agregar_lista.setText("Agregar a la lista de resumenes");
        agregar_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_listaActionPerformed(evt);
            }
        });

        mostrar_inforesumen.setText("Mostrar Información del resumen");

        Lista_resumenes.setColumns(20);
        Lista_resumenes.setRows(5);
        jScrollPane6.setViewportView(Lista_resumenes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cargar_resumen)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jScrollPane3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(agregar_lista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(analizar_resumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(105, 105, 105))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(search_pclave)
                        .addGap(18, 18, 18)
                        .addComponent(search_autor))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrar_inforesumen)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cargar_resumen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(agregar_lista)
                                .addGap(18, 18, 18)
                                .addComponent(analizar_resumen)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(search_pclave)
                            .addComponent(search_autor))
                        .addGap(66, 66, 66))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mostrar_inforesumen)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(salir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void input_buscarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void cargar_resumenActionPerformed(java.awt.event.ActionEvent evt) {                                               
        String ruta = "";
    JFileChooser fc = new JFileChooser();
    fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo","txt");
    fc.setFileFilter(filtro);
    
    int res = fc.showOpenDialog(this);
    if(res == JFileChooser.APPROVE_OPTION){
        ruta = fc.getSelectedFile().getPath();
        rutasArchivos[contadorArchivos] = ruta;  // Almacenar la ruta en el array
        contadorArchivos++; 
        String contenido = obtenerContenidoArchivo(ruta);  // Obtener el contenido del archivo
        String titulo = ObtenerTitulo(contenido);  // Obtener el título
        String autores = ObtenerAutores(contenido);  // Obtener los autores
        String resumen = ObtenerResumen(contenido);  // Obtener el resumen
        String palabrasClave = ObtenerPalabrasClaves(contenido);  // Obtener las palabras clave
        
        resumenObj = new resumen(titulo, autores, resumen, palabrasClave);
        
        
        boolean tituloRepetido = false;
        for (resumen resumenRegistrado : ListaResumenes) {
           
            if (resumenRegistrado != null && resumenRegistrado.getTitulo().equals(titulo)) {
                
                tituloRepetido = true;
                System.out.println("Este resumen ya esta cargado, ingrese otro"); //aun no funciona
                break;
            }
        

            if (!tituloRepetido) {
            
                    if (resumenRegistrado == null) {
                        resumenRegistrado = resumenObj;
                    }
              
        

            
        
            primera_palabra(resumenObj);
            intHashCal = tablaHash.calcularHash(primera_palabra(resumenObj));
            
            
            for (int i=0; i<50; i++)
                hTitulos[i] = "";
            
                tablaHash.insertData(hTitulos, resumenObj.getTitulo());
                ListaResumenes[intHashCal] = resumenObj;
                IncluirPalabrasClaves(hPClaves, resumenObj.getP_clave(), intHashCal);
                imprimirElementos(hPClaves);
                String cadena_inthashcal = String.valueOf(intHashCal);
                String titulo_guardado = resumenObj.getTitulo();
                titulo_cargado.setText(cadena_inthashcal+" - "+titulo_guardado); 
                
            break;
            }
            
            
                
}
        
    
    }
    
    
    }
    
   
public String obtenerContenidoArchivo(String ruta) {
    StringBuilder contenido = new StringBuilder();
    try (BufferedReader b = new BufferedReader(new FileReader(ruta))) {
        String linea;
        while ((linea = b.readLine()) != null) {
            contenido.append(linea).append("\n");  // Agregar cada línea al contenido
        }
    } catch (IOException ex) {
        Logger.getLogger(Interfaz2.class.getName()).log(Level.SEVERE, null, ex);
    }
    return contenido.toString();  // Devolver el contenido del archivo
}
        
public void mostrar_tituloarchivo(resumen resumen) {
    
    
    String titulo_guardado = resumen.getTitulo();
    titulo_cargado.setText(titulo_guardado);
    
   
}


   public static String primera_palabra(resumen resumenObj){
       
       String [] t = resumenObj.getTitulo().split(" ");
       return t[0];
       
       
       
       
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
    public static void IncluirPalabrasClaves (ListaDoble hPClaves[], String ListaNPalabras, int index)
    {
        String[] ListaPalabras = ListaNPalabras.split(",");
        
        for (String Palabra : ListaPalabras)
        {
            tablaHash.insertPClave(hPClaves, Palabra, index);
        }
    
    }                                              

    private void analizar_resumenActionPerformed(java.awt.event.ActionEvent evt) {                                                 
    estadisticas();
    }
    
    public static int CuentaPalabraClave(String sData, String sPalabraClave)
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
    public void estadisticas(){
    String ListaPalabras[];
        
        
        ListaPalabras = resumenObj.getP_clave().split(",");
         String texto_acumulado = "";
        for (String pclave :ListaPalabras){
        int NroVecesPalabraClave;
        NroVecesPalabraClave = CuentaPalabraClave(resumenObj.getInfo(), pclave);
        
        
        texto_acumulado += "Numero de veces "+ pclave + " en el Resumen: '" + String.valueOf(NroVecesPalabraClave) + "'";
        
        
        
        }
        info_estadisticas.setText(resumenObj.getAutores()+texto_acumulado+"\n");
    }                                                

    private void agregar_listaActionPerformed(java.awt.event.ActionEvent evt) {                                              
      resuemen_cargado.setModel(modelo);
      modelo.addElement(titulo_cargado.getText());
      titulo_cargado.setText("");
        
    }                                             

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {                                      
     // Suponiendo que `rutasArchivos` es un array de String con las rutas cargadas en el sistema
    String[] rutasArchivos = {"ruta1", "ruta2", "ruta3"}; // Reemplazar con las rutas reales
    guardarRutasEnHistorial(rutasArchivos);
    // Cerrar la ventana o la aplicación
    this.dispose(); // Cierra solo la ventana actual
    // System.exit(0); // Cierra la aplicación completa
}
    
private void guardarRutasEnHistorial(String[] rutasArchivos) {
    // Crear la carpeta "historial" dentro del directorio del proyecto si no existe
    File carpetaHistorial = new File("historial");
    if (!carpetaHistorial.exists()) {
        carpetaHistorial.mkdirs();
    }

    // Guardar las rutas en archivos de texto dentro de la carpeta "historial"
    for (int i = 0; i < rutasArchivos.length; i++) {
        try {
            // Crear y escribir en el archivo de texto correspondiente
            BufferedWriter writer = new BufferedWriter(new FileWriter("historial/archivo" + (i + 1) + ".txt"));
            writer.write(rutasArchivos[i]);
            writer.close();
            // Mensaje de éxito para cada archivo guardado
            System.out.println("Ruta del archivo " + (i + 1) + " guardada en la carpeta historial");
        } catch (IOException e) {
            System.err.println("Error al guardar la ruta del archivo " + (i + 1) + ": " + e.getMessage());
        }
    }
        
    }                                     

    private void search_pclaveActionPerformed(java.awt.event.ActionEvent evt) {                                              
      
        
       
    }
    
    private void search_autorActionPerformed(java.awt.event.ActionEvent evt) {
        int contador = 0;
       String comparador = "";
       int num = ListaResumenes.length;
        while (contador< num){


            if(ListaResumenes[contador]== null){
//                System.out.println("");
            }else{
                comparador = ListaResumenes[contador].getAutores();
//                System.out.println(comparador);
                    if(comparador.equalsIgnoreCase(input_buscar.getText())){
                            lista_para_buscar.setModel(modelo);
                                modelo.addElement(ListaResumenes[contador].getTitulo());
                                    input_buscar.setText(""); //este no lo cambie porque no se con que cambiarlo
         
                   }else{
//                   System.out.println(".");
                }
            }contador ++;
            
            }
                
       }
       
}
        // TODO add your handling code here:
    }                                            


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea Lista_resumenes;
    private javax.swing.JButton agregar_lista;
    private javax.swing.JToggleButton analizar_resumen;
    private javax.swing.JToggleButton cargar_resumen;
    private javax.swing.JTextArea info_estadisticas;
    private javax.swing.JTextArea info_resumen;
    private javax.swing.JTextField input_buscar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton mostrar_inforesumen;
    private javax.swing.JList<String> resuemen_cargado;
    private javax.swing.JButton salir;
    private javax.swing.JToggleButton search_autor;
    private javax.swing.JToggleButton search_pclave;
    private javax.swing.JTextArea titulo_cargado;
    // End of variables declaration                   

}
