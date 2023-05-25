package tarea6;

//Importamos todos los paquetes necesarios

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Fichero {
    
    //Declaramos un String donde damos nombre al fichero que almacenará los datos
    //Declaramos el Arraylist donde se almacenarán en memoria los objetos "Productos"
    
    final private String fichero="Productos.dat";
    private ArrayList<Productos> prod= new ArrayList<Productos>();
    
    /*Usamos la clase DataInputStream en nuestro constructor para que 
    cada vez que se llame a la clase se lea el fichero en disco y se 
    guarden los objetos "Productos" en el Arraylist
    */
    
    public Fichero (){
        try{
            DataInputStream ios=new DataInputStream(new FileInputStream(fichero));
            Productos producto1=new Productos();
            producto1.setCodigo(ios.readUTF());
            while (producto1.getCodigo()!=null){
                   producto1.setNombre(ios.readUTF());
                   producto1.setCantidad(ios.readUTF());
                   producto1.setDescripcion(ios.readUTF());
                   prod.add(producto1);
                   producto1=new Productos();
                   producto1.setCodigo(ios.readUTF());   
            }
            ios.close();
        }
        catch(Exception ex){    
        }
    }
    
    /*En la función salvar() guardamos en el fichero en disco cada vez que es llamada
    los objetos almacenados en el Arraylist
    */
    
    public void salvar() {
        try{
            DataOutputStream puente= new DataOutputStream (new FileOutputStream(fichero));
            for (int i =0; i<prod.size(); i++){
                puente.writeUTF(prod.get(i).getCodigo()); 
                puente.writeUTF(prod.get(i).getNombre());
                puente.writeUTF(prod.get(i).getCantidad());
                puente.writeUTF(prod.get(i).getDescripcion());
            }
            puente.close(); 
        }
        catch (Exception ex){   
        }  
    }
    
    /*Con la función insertar, a la que se le mandan por parámetros cuando es llamada  
    los cuatro elementos que componen nuestro objeto Productos, añadimos un objeto Productos 
    al Arraylist. Además guardamos el fichero el disco invocando a "salvar()" al final 
    del método. Se controla que todos los campos estén completos y si no es así muestra en pantalla un
    mensaje de advertencia hasta que esto suceda. También se controla que no se introduzca un código
    repetido.
    */
    
    public String insertar (String codigo, String nombre, String cantidad, String descripcion){
        int cont=0;
        for (int i =0; i<prod.size(); i++){
            String CodigoUnico=prod.get(i).getCodigo();
                    if (CodigoUnico.equals(codigo)){
                        cont++;
                    }
                }
        if (cont>0){
            return "No puede usar un código ya introducido";            
            }else
        {if (codigo.length()==0){
            return "Debe introducir el código del producto";
        }else if (nombre.length()==0){
            return "Debe introducir el nombre del producto";
        }else if (cantidad.length()==0){
            return "Debe introducir la cantidad del producto";
        }else if (descripcion.length()==0){
            return "Debe introducir la descripción del producto";
        }else{
        Productos producto1=new Productos();
        producto1.setCodigo(codigo);
        producto1.setNombre(nombre);
        producto1.setCantidad(cantidad);
        producto1.setDescripcion(descripcion);
        prod.add(producto1);
        salvar();
        String texto="";
        for (int i =0; i<prod.size(); i++){
            texto= texto + "Código: " + prod.get(i).getCodigo()+System.lineSeparator(); 
            texto= texto + "Nombre: " + prod.get(i).getNombre()+System.lineSeparator();
            texto= texto + "Cantidad: " + prod.get(i).getCantidad()+System.lineSeparator();
            texto= texto + "Descripción: " + prod.get(i).getDescripcion()+System.lineSeparator() + "\n";
        }    
        return  texto +"Producto insertado con éxito.";
        }  
       }
    } 
    
    /*La función modificar, a la que tembién se le mandan los cuatro componentes del 
    obejto por parámetros, nos permite realizar modificaciones a partir del campo "codigo".
    Nos devuelve un String con las modificaciones realizadas si existe en nuestro Arraylist
    un objeto con el mismo "codigo" que el enviado por parámetros, u otro advirtiéndonos de
    que ese "codigo" no existe si no es así. Se controla que todos los campos estén completos
    y si no es así muestra en pantalla un mensaje de advertencia hasta que esto suceda.
    */ 
    public String modificar (String codigo, String nombre, String cantidad, String descripcion){
        if (codigo.length()==0){
            return "Debe introducir el código del producto";
        }else if (nombre.length()==0){
            return "Debe introducir el nombre del producto";
        }else if (cantidad.length()==0){
            return "Debe introducir la cantidad del producto";
        }else if (descripcion.length()==0){
            return "Debe introducir la descripción del producto";
        }else{int valor=-1;
            String texto="";
            for (int i =0; i<prod.size(); i++){
                 if (prod.get(i).getCodigo().equals(codigo)){
                 valor=i;
                 break;
            }
        }
        if (valor>=0){
            prod.get(valor).setNombre(nombre);
            prod.get(valor).setCantidad(cantidad);
            prod.get(valor).setDescripcion(descripcion);
            texto= "Se ha modificado el producto con código '" + codigo +"' con los siguientes valores:"+System.lineSeparator();
            texto= texto + "Nombre: " + prod.get(valor).getNombre()+System.lineSeparator();
            texto= texto + "Cantidad: " + prod.get(valor).getCantidad()+System.lineSeparator();
            texto= texto + "Descripción: " + prod.get(valor).getDescripcion()+System.lineSeparator();
            salvar();
            return texto;
        }else return "El código '" + codigo + "' no pertenece a ningún producto.";
      }
    }
    
    /*En la función mostrar() devolvemos un String con todos los "Productos" del Arraylist
    divididos en sus cuatro campos
    */
    
    public String Mostrar(){
        String texto="";
        for (int i =0; i<prod.size(); i++){
            texto= texto + "Código: " + prod.get(i).getCodigo()+System.lineSeparator(); 
            texto= texto + "Nombre: " + prod.get(i).getNombre()+System.lineSeparator();
            texto= texto + "Cantidad: " + prod.get(i).getCantidad()+System.lineSeparator();
            texto= texto + "Descripción: " + prod.get(i).getDescripcion()+System.lineSeparator() + "\n";
        }
        return texto;
    }
    
    /*En Buscar() devolvemos también un String que nos devuelve el objeto con el mismo
    "codigo" que se ha introducido por parámetro o un mensaje de advertencia de que ese
    "codigo" no está en el Arraylist si no es así.
    */
    
    public String Buscar(String codigo){
        int valor=-1;
        String texto="";
        for (int i =0; i<prod.size(); i++){
            if (prod.get(i).getCodigo().equals(codigo)){
                valor=i;
                break;
            }
        }
        if (valor>=0){
            texto= texto + "Código: " + prod.get(valor).getCodigo()+System.lineSeparator(); 
            texto= texto + "Nombre: " + prod.get(valor).getNombre()+System.lineSeparator();
            texto= texto + "Cantidad: " + prod.get(valor).getCantidad()+System.lineSeparator();
            texto= texto + "Descripción: " + prod.get(valor).getDescripcion()+System.lineSeparator();
            return texto;
        }
        else return "El código '" + codigo + "' no pertenece a ningún producto.";
    }
    
    /*El método "Buscar2()" es similar al anterior, pero gracias al método "contains"
    de la clase Arraylist, nos devuelve cualquier objeto con una subcadena igual a la introducida
    por parámetro que se encuentre en la variable "codigo" de nuestros objetos "Productos".
    También nos advierte si no existe tal subcadena en el objeto.
    */
    
    public String Buscar2(String codigo){
        int valor=-1;
        String texto="";
        for (int i =0; i<prod.size(); i++){
            if (prod.get(i).getCodigo().contains(codigo)){
                valor=i;
                texto= texto + "Código: " + prod.get(valor).getCodigo()+System.lineSeparator(); 
                texto= texto + "Nombre: " + prod.get(valor).getNombre()+System.lineSeparator();
                texto= texto + "Cantidad: " + prod.get(valor).getCantidad()+System.lineSeparator();
                texto= texto + "Descripción: " + prod.get(valor).getDescripcion()+System.lineSeparator() + "\n"; 
            }
        }
        if (valor==-1) return "Los carateres o el caracter '" + codigo + "' no aparecen en ningún código de producto.";  
        else return texto;
    }
    
    /*El método borrar() elimina del Arraylist el objeto con "codigo" igual al introducido
    por parámetro, lanzando un mensaje de confirmación mediante un JOptionPane, que si es confirmado. 
    lo elimina y nos devuelve las características del "Productos" eliminado, 
    o si no, lanza un String por el que se cancela la operación.
    También nos avisa si no existe en nuestros objetos el codigo introducido.
    */
    
    public String Borrar (String codigo){
        int valor=-1; 
        String texto="";
        String opcion="";
        int valor2=0;
        for (int i =0; i<prod.size(); i++){
            if (prod.get(i).getCodigo().equals(codigo)){    
                valor=i;
                opcion=JOptionPane.showInputDialog("Está seguro de que quiere eliminar este producto?\n Escriba "
                                                   + "'s' si es así o 'n' en caso contrario.");
                if (opcion.equalsIgnoreCase("s")){
                valor=i; 
                valor2=1;
                }else return "Operación cancelada";
            }
        }  
        if (valor2==1){
            texto= "Se ha eliminado el producto con código '" + codigo +"' con los siguientes valores:"+System.lineSeparator();
            texto= texto + "Nombre: " + prod.get(valor).getNombre()+System.lineSeparator();
            texto= texto + "Cantidad: " + prod.get(valor).getCantidad()+System.lineSeparator();
            texto= texto + "Descripción: " + prod.get(valor).getDescripcion()+System.lineSeparator();
            prod.remove(prod.get(valor));
      
            salvar();
            return texto;
      } else return "El código '" + codigo + "' no pertenece a ningún producto.";   
    }
}


