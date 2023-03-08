
package s8_actividadenclase_carlosespinal_akeemieongham;

import java.util.*;

public class S8_ActividadEnClase_CarlosEspinal_AkeemIeongHam {

    static Scanner read = new Scanner(System.in);
    static ArrayList<Registro> register = new ArrayList<>();
    public static void menu(){
        System.out.println("Sistema de registro \n");
        System.out.println("1. Iniciar Sesion");
        System.out.println("2. Registrarse \n");
        System.out.println("Ingrese la opcion con la que desea trabajar: ");
    }

    public static void main(String[] args) {
        char resp = 's';
        do{
            menu();
            int opcion = read.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese su nombre de usuario: ");
                    String use = read.next();
                    System.out.println("Ingrese su password: ");
                    String pass = read.next();
                    
                    for (int i = 0; i < register.size(); i++) {
                        Registro r = register.get(i);
                        String usercomp = r.getUsername();
                        String passcomp = r.getPassword();
                        
                        if(usercomp.equals(use) && passcomp.equals(pass)){
                            System.out.println("Usted ha iniciado sesion correctamente");
                        } else if (usercomp != use || passcomp != pass){
                            System.out.println("El nombre de usuario o la password son incorrectos");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el username deseado: ");
                    String user = read.next();
                    System.out.println("Ingrese la password: ");
                    String passw = read.next();
                    System.out.println("Ingrese su email: ");
                    String mail = read.next();
                    System.out.println("Ingrese su identidad");
                    int iden = read.nextInt();
                    
                    Registro regi = new Registro(user,passw,mail,iden);
                    register.add(regi);
                    
                    
                    
            }
        }while(resp =='s' || resp == 'S');
        
    }
    
}
