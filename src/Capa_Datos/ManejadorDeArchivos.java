/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capa_Datos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Jose
 */
public class ManejadorDeArchivos {
    
     private static String path = "programfiles/MemoriaPrograma.txt";
     
     public static void inicializarArchivos(){
     File archivo=new File(path);
    
     if (archivo.exists()){
         System.out.println("El archivo " + path + "ya  existe, se respeta su integridad");
     }
     else{
        try {
            if (archivo.createNewFile())
                System.out.println("El archivo usuarios.txt se ha creado correctamente");
            else
                System.out.println("No ha podido ser creado El archivo usuarios.txt");
        } 
        catch (IOException ioe) {
            ioe.printStackTrace();
           }
     }
    }
     
     
      public static boolean grabarObjeto (String file, Object obj)
    {
        ObjectOutputStream salida;
        try {
            salida = new ObjectOutputStream(new FileOutputStream(file));
            //salida.writeObject("guardar un objeto compuesto\n");
            salida.writeObject(obj);
            salida.close();
            return true;
        } catch (IOException ex) { return false; }
    }
    
    // escribir objeto
    public static Object leerObjeto (String file) throws ClassNotFoundException
    {
        Object obj;
        ObjectInputStream entrada;
        try {
            entrada = new ObjectInputStream(new FileInputStream(file));
            obj = entrada.readObject();
            entrada.close();
            return obj;
        } catch (IOException ex) { return null; }
    }
     
}
