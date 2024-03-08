package isacc;
import java.util.Scanner;
public class MenuDeposito {

    static  Scanner guardar = new Scanner(System.in);
     static Almacen listAlmacen[]=new Almacen[5];
     static Usuario listaUsuario[]=new Usuario[5];
     static Almacen objAlmacen;
    public static void main(String[] args) {
        mostrarMenu();
        //verificarUsuario();
    }

    public static void verificarUsuario(){

        
        
        String usuario;
        System.out.println("ingrese su usuario");
        usuario =guardar.nextLine();

        for(int i=0; i<listaUsuario.length; i++){
                if(usuario==listaUsuario[i].getUsuario()){
                    mostrarMenu();
                }else{
                    System.out.println("No se encontro el usuario, intente de nuevo");
                }
        }

    }

    public static void mostrarMenu(){
        String r;
        int opcion;
     do{
        System.out.println("hola bienvenido usuario digame que desea realizar \n");
        System.out.println("1)total de productos 2)agregar productos 3)eliminar productos");
        opcion=guardar.nextInt();
        switch (opcion) {
            case 1:
               
            break;

            case 2:
               agregarProducto(listAlmacen);
            break;
            case 3:
              mostrarProducto(listAlmacen);
            break;
            default:
            System.out.println( "Opcion no valida" );
            break;

        }

        System.out.println("desea continuar? s/n ");
        r= guardar.next();

     }while(r.equals("s"));
    }
    

public static void agregarProducto(Almacen lisAlmacen[]){
    
    System.out.println("ingrese  el nombre del producto");
    String nombreProd= guardar.next();
    System.out.println("ingrese la cantidad del producto");
    int cantidad= guardar.nextInt();
    System.out.println("ingrese el precio del producto");
    int precio= guardar.nextInt();
    System.out.println("ingrese el codigo del producto");
    int codigoProd= guardar.nextInt();

    for(int i=0; i<listAlmacen.length;i++){
        objAlmacen=new  Almacen(nombreProd,cantidad,precio,codigoProd);
        listAlmacen[i]=objAlmacen;
    }


}

public static void mostrarProducto(Almacen lisAlmacen[]){
    for(int i=0; i<listAlmacen.length;i++){
      lisAlmacen[i].mostrarProducto();
    }
}


}