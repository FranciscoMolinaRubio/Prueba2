package tarea6;

public class Productos {

  private String Codigo;
  private String Descripcion;
  private String Nombre;
  private String Cantidad;

    public Productos() {
    }

    public Productos(String Codigo, String Descripcion, String Nombre, String Cantidad) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }
  
}