package isacc;
import java.util.Scanner;
public class MenuDeposito {

    static  Scanner guardar = new Scanner(System.in);
    static Usuario listUsuario[]=new Usuario[5];
    public static void main(String[] args) {
        verificarUsuario();
    }

    public static void verificarUsuario(){

        
        
        String usuario;
        System.out.println("ingrese su usuario");
        usuario =guardar.nextLine();

        for(int i=0; i<listUsuario.length; i++){
                if(usuario==listUsuario[i].getUsuario()){
                    mostrarMenu();
                }
        }

    }

    public static void mostrarMenu(){
        Almacen objAlmacen;
        
        int opcion;
        System.out.println("hola bienvenido usuario digame que desea realizar \n");
        System.out.println("1)total de productos 2)agregar productos 3)eliminar productos");
        opcion=guardar.nextInt();
        switch (opcion) {
            case 1:
               
            break;

            case 2:
               agregarProducto();
            break;
            case 3:
               
            break;
    }
    
}

public static void agregarProducto(){
    
}

}