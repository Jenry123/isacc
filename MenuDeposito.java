package isacc;
import java.util.Scanner;
public class MenuDeposito {


    public static void main(String[] args) {

        verificarUsuario();
    }

    public static void verificarUsuario(){
        Usuario listUsuario[]=new Usuario[5];
        Scanner guardar=new Scanner(System.in);
        String usuario;
        System.out.println("ingrese su usuario");
        usuario =guardar.nextLine();

        for(int i=0; i<listUsuario.length; i++){
                if(usuario==listUsuario[i].getUsuario()){
                    
                }
        }

    }
    
}