package isacc;
import java.util.Scanner;
import java.util.ArrayList;
public class MenuDeposito {
   static Scanner guardar = new Scanner (System.in); 
   static ArrayList<Usuario> listaUsuario = new ArrayList();  
    public static void main(String[] args) {
        verificarUsuario();  
           
    }

    public static void verificarUsuario(){
        listaUsuario.add(new Usuario("jenry","deposito12"));  
        String usuario;
        String  password; 
        boolean repetir=false;

         do{
            System.out.println("ingrese su usuario");
            usuario=guardar.next();
            System.out.println("Ingrese contraseña: ");
            password=guardar.next();
    
            boolean usuarioEncontrado = false;
           
            for (Usuario usuario2 : listaUsuario) {
                if (usuario2.getUsuario().equals(usuario) && usuario2.getContrasena().equals(password)) {
                    usuarioEncontrado = true;
                }
            }
    
            if(usuarioEncontrado){
                menuInicial();
            }else{
                System.out.println("error");
                System.out.println("ingrese nuevamente su usuario y contraseña");
                repetir=true;
            }

         }while(repetir);
    }

 
    public static void  menuInicial(){ 
        ArrayList<Producto> listaProductos=new ArrayList<>();
        int opcion;
        System.out.println("bienvenido que desea realizar 1)agregar nuevo producto 2)eliminar producto 3)reporte de productos");
        opcion=guardar.nextInt();

        switch(opcion){
            case 1:
            agregarProducto(listaProductos);
            break;
        }

    }

    public static void agregarProducto(ArrayList<Producto> listaProductos){
        String nombreP;
        int precio;
        int totalP;
        long codigoP;
            System.out.println("ingrese el nombre del producto");
            nombreP=guardar.next();
            System.out.println("ingrese  el precio del producto");
            precio=guardar.nextInt();
            System.out.println("cantidad de unidades que tiene en stock");
            totalP=guardar.nextInt();
            System.out.println("ingrese el codigo del producto");
            codigoP= guardar.nextLong();
            Producto p = new Producto(nombreP,precio,totalP,codigoP);
            listaProductos.add(p);
            System.out.println("producto agregado con exito");
            menuInicial();
    }

}   