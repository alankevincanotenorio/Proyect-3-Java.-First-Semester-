/**
 *Clase Main  que tiene el menu
 *@author Alan Kevin Cano Tenorio y Malinalli Escobedo Irineo
 *@version 1.0
 */
import java.util.Scanner;

public class Main { 
    private static String Payasos = "Payasos";
    private static String Malabaristas = "Malabaristas";
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        ListaDeEmpleados listaPrincipal = new ListaDeEmpleados();
        ListaDeEmpleados listaCotizacion = new ListaDeEmpleados();
       
        int opcion = 0; 
        listaPrincipal.agregarEmpleadoNuevo(Payasos, 100);
        listaPrincipal.agregarEmpleado(Payasos);
        listaPrincipal.agregarEmpleado(Payasos);
        listaPrincipal.agregarEmpleadoNuevo(Malabaristas, 200);
        listaPrincipal.agregarEmpleado(Malabaristas);



        

        do{
            System.out.println("\u000c");
            System.out.println("\n'Evento Espectacular' \nTu catálogo es el siguiente: ");            
            listaPrincipal.muestra();
            System.out.println("Escoge la opcion que más te guste: \n1. Agregar empleado \n2. Borrar empleado \n3. Modificar Nombre  \n4. Modificar sueldo \n5. Hacer Cotizacion \n6. Cerrar programa ");
            
            opcion = entrada.nextInt(); 
            
            switch (opcion) {
            case 1: //Agregar empleado 
                System.out.println("\u000c");
                System.out.println("\nHas accedido al metodo de 'Agregar empleado' \nCatalogo actual");
                listaPrincipal.muestra();
                System.out.println("Ingrese el rol del empleado que desea agregar:");
                String nombreEmpleado = entrada2.nextLine();
                if(!listaPrincipal.contiene(nombreEmpleado)){
                System.out.println("Ingrese el sueldo que tendra el nuevo empleado ");
                double sueldo = entrada2.nextDouble();
                listaPrincipal.agregarEmpleadoNuevo(nombreEmpleado, sueldo);
                entrada2.nextLine();
                }else{
                listaPrincipal.agregarEmpleado(nombreEmpleado);
                }
                System.out.println("El empleado ha sido contratado");
                break;
            case 2: //despedir empleado
                System.out.println("\u000c");
                System.out.println("\nHas accedido al metodo de 'Despedir empleado' \nCatalogo actual");
                listaPrincipal.muestra();    
                System.out.println("Ingresa el rol del empleado que despedira");
                String rolEmpleado = entrada2.nextLine();
                if(!listaPrincipal.contiene(rolEmpleado)){
                System.out.println("No puedes despedir al empleado porque no existe");
                }
                else{
                    listaPrincipal.eliminarEmpleado(rolEmpleado);
                System.out.println("El empleado ha sido despedido");
                }
                break;
            case 3: //  Modificar nombre 
                System.out.println("\u000c");
                System.out.println("\nHas accedido al metodo de 'Modificar rol' \nCatalogo actual");
                listaPrincipal.muestra();    
                System.out.println("Ingrese el rol del empleado que quieres modificar:");
                String indiceModificar = entrada2.nextLine();
                if(!listaPrincipal.contiene(indiceModificar)){
                    System.out.println("No puedes modificar el rol debido a que no existe en tu lista");
                }
                else{
                System.out.println("Ingrese el nuevo rol que tendra su empleado:");
                String nuevoNombre = entrada2.nextLine();
                listaPrincipal.mRol(indiceModificar, nuevoNombre);
                System.out.println("el rol ha sido modificado");}
                break;
            case 4: // Modificar sueldo
                System.out.println("\u000c");
                System.out.println("\nHas accedido al metodo de 'Modificar ueldo' \nCatalogo actual");
                listaPrincipal.muestra();    
                System.out.println("Ingrese el rol del empleado al que quieres cambiarle el sueldo:");
                String rol = entrada2.nextLine(); 
                if(listaPrincipal.contiene(rol)) {
                    System.out.println("Ingrese el nuevo sueldo del empleado:");
                    double nuevoSueldo = entrada2.nextDouble();
                    entrada2.nextLine();
                    listaPrincipal.mSueldo(rol, nuevoSueldo);
                    System.out.println("El sueldo ha sido modificado");
                } else {
                    System.out.println("No puedes modificar el sueldo debido a que no existe en tu lista");
                }
            break;
            case 5: // hacer cotización
                System.out.println("\u000c");
                if(listaPrincipal.esVacia()){
                    System.out.println("No puedes hacer una cotizacion debido a que no tienes trabajadores");
                    break;
                }
                System.out.println("\nHas accedido al metodo de  'Hacer cotizacion' \nCatalogo actual");
                listaPrincipal.muestra();
                System.out.println("Ingresa las horas que durara el evento:");
                int horasEvento = entrada.nextInt();
                while(horasEvento<0){
                    System.out.println("No puedes colocar horas negativas, vuelve a intentarlo");
                    horasEvento = entrada.nextInt();
                }
                System.out.println("Ingresa la comision que vas a cobrar (solo coloca el numero)");
                double comisionPor = entrada.nextDouble();
                while (comisionPor<0) {
                System.out.println("No puedes colocar una comision negativa, vuelve a intentarlo");
                comisionPor = entrada.nextDouble();
                }

                int agregarOtro = 0;
                double totalCotizacion = 0;
                double cotiza = 0;
                String rolAnimador;

                
                do {
                    
                System.out.println("Ingresa el rol de un animador que te gustaria contratar:");
                rolAnimador = entrada2.nextLine();
                if(!listaPrincipal.contiene(rolAnimador)){
                    if(!listaPrincipal.contiene(rolAnimador)){
                    System.out.println("No puedes agregar este empleado a la cotizacion porque no existe en tu lista de empleados. \nHas vuelto al menu principal");
                    listaCotizacion.limpia();
                    break;
                    }
                } else{
                    System.out.println("Ingresa la cantidad de " + rolAnimador + " que deseas contratar:");
                int animadoresContratar = entrada2.nextInt();
                entrada2.nextLine();
                cotiza = listaPrincipal.cotizacion(rolAnimador, animadoresContratar, horasEvento, comisionPor, listaCotizacion);
                boolean bandera = listaCotizacion.modificar(rolAnimador, animadoresContratar, listaPrincipal.sueldoPorHora(rolAnimador) , horasEvento, listaCotizacion, listaPrincipal.Cantidad(rolAnimador));
                    if(!bandera){
                        System.out.println("No tienes suficientes trabajadores");
                        listaCotizacion.limpia();
                    
                        break;
                    }
                totalCotizacion += cotiza;
                System.out.println("¿Deseas agregar otro trabajador? 1 en caso que si, 0 en caso que no");
                agregarOtro = entrada.nextInt();
                if(agregarOtro == 0){
                    listaCotizacion.muestra();
                    listaCotizacion.limpia();
                    
                    System.out.println("Duracion del evento: "+horasEvento+ " Comision:"+comisionPor+" La cotización total del evento es:"  + totalCotizacion);
                    
                    break;   
                }

                }   
            } while (agregarOtro == 1);
            break;

                case 6:
                System.out.println("Fin del programa");
                entrada.close();
                break;
                default:
                System.out.println("Esa opcion no existe");
            }
        }while (opcion !=6);
    }
}
