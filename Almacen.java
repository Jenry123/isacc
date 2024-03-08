package isacc;

public class  Almacen {
    protected String nombreProducto;
    protected int  cantidadProducto;
    protected int codigoProducto;
    protected int precioProducto;

    public Almacen(){

    }

    public Almacen(String nombre,int cantidadProducto,int codigoProducto,int precioProducto){
        this.nombreProducto=nombre;
        this.cantidadProducto = cantidadProducto;
        this.codigoProducto=codigoProducto;
        this.precioProducto=precioProducto;
    
    }

    public void setNombre(String  nombre) {
        this.nombreProducto=nombre;
    }

    public String getNombre(){
        return nombreProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto=cantidadProducto;
    }

    public int getCantidad(){
        return cantidadProducto;
    }

    public void setCodigo(int codigoProducto) {
        this.codigoProducto=codigoProducto;
    }

    public int getCodigo(){
        return codigoProducto;
    }

    public void setPrecio(int precioProducto) {
        this.precioProducto=precioProducto;
    }

    public int getPrecio(){
        return precioProducto;
    }

    public void mostrarProducto(){
System.out.println(" productos: \t \n"+getNombre()+"\n"+getCantidad()+"\n"+getPrecio()+"\n"+getCodigo());
    }



}
