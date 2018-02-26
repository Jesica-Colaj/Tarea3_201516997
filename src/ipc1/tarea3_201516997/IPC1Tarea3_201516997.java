/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.tarea3_201516997;


import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author FCC
 */
public class IPC1Tarea3_201516997 {

    /**
     * @param args the command line arguments
     */ 
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Se declaran las variables de opciones del menu asi como las de los submenus
        String op = "";
        String case1 = "";
        String case2 = "";
        String case3 = "";
        String case4 = "";
        //Se declaran los numeros utilizados en la opcion 3 del menu
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        Scanner lector = new Scanner(System.in);
        //Menu principal
        //Se repetira el menu hasta que el usuario seleccione un 5 que indica el final del programa
        while (op != "5") {
            //Se inicializa el arreglo usuarios sin ningun registro
            String [] usuarios = {"", "", "", "", ""};
            //Se inicializa el numero entero con un valor menor de cero
            int num_entero = -1;
            //se inicializa el arreglo notas sin usuario y con notas igualadas a cero
            String [][] notas = {{"Sin_ID", "0", "0", "0", "0", "0"}, {"Sin_ID", "0", "0", "0", "0", "0"}, {"Sin_ID", "0", "0", "0", "0", "0"}, 
                {"Sin_ID", "0", "0", "0", "0", "0"}, {"Sin_ID", "0", "0", "0", "0", "0"}, {"Sin_ID", "0", "0", "0", "0", "0"}};
            System.out.println("[IPC1]Tarea3_201516997 \n --Menu Principal--\n" + 
                    "\nEliga una opcion: \n" +
                    "\n1. Usuarios" +
                    "\n2. Contador de dígitos" +
                    "\n3. Tres números de mayor a menor" +
                    "\n4. Calcular promedio" +
                    "\n5. Salir\n");
            op = lector.next();
            //El primer switch contiene el menu principal
            switch(op){
                case "1":
                    //Se repetira el switch hasta que el usuario seleccione un 4 que indica el regreso 
                    //al menu principal en el cual se reinician los valores de las variables
                    case1 = "0";
                    while(case1 != "4"){
                        System.out.println("\nEliga una opcion: \n" +
                            "\n1. Ingresar Usuarios" +
                            "\n2. Mostrar Usuarios ascendente" +
                            "\n3. Mostrar Usuarios descendente" +
                            "\n4. Menu Principal\n");
                        case1 = lector.next();
                    
                    
                        switch(case1){
                            case "1":
                                int cont = 0;
                                //Se recorre el arreglo usuarios hasta encontrar una posicion en la que no se tenga agregado a un usuario
                                //se ingresaran los usuarios individualmente
                                //Se le indicara cuando el limite de usuarios ya ha sido completado
                                for (int i = 0; i < usuarios.length; i++) {
                                    if(cont ==0){
                                        if(usuarios[i].equals("")){
                                            System.out.println("Ingrese un usuario: ");
                                            String usuario = lector.next();
                                            usuarios[i] = usuario;
                                            cont =+1;
                                            System.out.println("\nUsuario ingresado\n");
                                        }
                                    }
                                }
                                if(!usuarios[0].equals("") && !usuarios[4].equals("")){
                                    System.out.println("Limite de usuarios completos");
                                }
                                
                                break;
                            case "2":
                                //con Arrays.sort(usuarios); se ordenan de forma ascendente
                                Arrays.sort(usuarios);
                                if(usuarios[4].equals("")){
                                    System.out.println("No se encuentran usuarios ingresados");
                                } else {
                                    System.out.println("Usuarios ordenados ascendentemente\n");
                                    //Se muestran los usuarios ordenados
                                    for(String s : usuarios)
                                    System.out.println(s);
                                }
                                break;
                            case "3":
                                //con Arrays.sort(usuarios, Collections.reverseOrder()); se ordenan de forma descendente
                                Arrays.sort(usuarios, Collections.reverseOrder());
                                if(usuarios[0].equals("")){
                                    System.out.println("No se encuentran usuarios ingresados");
                                } else {
                                    System.out.println("Usuarios ordenados descendentemente\n");
                                    //Se muestran los usuarios ordenados
                                    for(String s : usuarios)
                                    System.out.println(s);
                                }                             
                                break;
                            case "4":
                                System.out.println("Regresando al menu principal\n");
                                case1 = "4";
                                break;
                            default:
                                //Si la opcion seleccionada es invalida, inmediatamente se regresa al menu anterior
                                System.out.println("\nERROR, opción incorrecta\n"
                                    + "Intentelo de nuevo\n");
                            break;
                            
                        }    
                    }
                    break;
                
                case "2":
                    case2 = "0";
                    while (case2 != "4") {
                        
                        System.out.println("\nEliga una opcion: \n" +
                            "\n1. Ingresar número" +
                            "\n2. Mostrar número de digitos" +
                            "\n4. Menu Principal\n");
                        
                        case2 = lector.next();
                        
                        switch(case2){
                            case "1":
                                System.out.println("Ingrese un numero entero de 0 a 100000: ");
                                num_entero = lector.nextInt();
                                //Se verifica si el numero cumple con los parametros requeridos, sino se le solicita nuevamente
                                while(!(num_entero >= 0 && num_entero <= 100000)){
                                    System.out.println("\nNúmero Inválido\n"
                                            + "\nIngrese un numero entero de 0 a 100000: \n");
                                    num_entero = lector.nextInt();
                                }
                                break;
                            case "2":
                                int digitos = 0;
                                //Se verifica si se ha ingresado un numero
                                if(num_entero >= 0 && num_entero <= 100000){
                                    
                                    int cant = num_entero;
                                    while(num_entero > 0){
                                        digitos = digitos+1;
                                        num_entero = num_entero/10;
                                    }
                                    System.out.println("La cantidad de digitos en " + cant + " es de: " + digitos + "\n");
                                
                                }else{
                                    System.out.println("No se ha ingresado un número");
                                }
                                
                                break;
                            case "4":
                                System.out.println("Regresando al menu principal\n");
                                case2 = "4";
                                break;    
                            default:
                                System.out.println("\nERROR, opción incorrecta\n"
                                    + "Intentelo de nuevo\n");
                                break;
                        }
                    }            
                    break;
                    
                
                case "3":
                    case3 = "0";
                    while (case3 != "4") {
                        System.out.println("\nEliga una opcion: \n" +
                            "\n1. Ingresar números" +
                            "\n2. Mostrar ordenados" +
                            "\n4. Menu Principal\n");
                        case3 = lector.next();
                        switch(case3){
                            case "1":
                                System.out.println("Ingrese el primer numero: ");
                                num1 = lector.nextInt();
                                System.out.println("Ingrese el segundo numero: ");
                                num2 = lector.nextInt();
                                System.out.println("Ingrese el tercer numero: ");
                                num3 = lector.nextInt();
                                break;
                            case "2":
                                //Verifica que numero es mayor de todos y cual es menor de todos
                                if(num1<num2){
                                    if(num2<num3){
                                        System.out.println("El orden de mayor a menor es: "
                                            + "\n" + num3 + "\n" + num2 + "\n" + num1);
                                    }else if (num1<num3){
                                        System.out.println("El orden de mayor a menor es: "
                                            + "\n" + num2 + "\n" + num3 + "\n" + num1);
                                    }else{
                                        System.out.println("El orden de mayor a menor es: "
                                            + "\n" + num2 + "\n" + num1 + "\n" + num3);
                                    }
                                }else if(num1<num3){
                                    System.out.println("El orden de mayor a menor es: "
                                        + "\n" + num3 + "\n" + num1 + "\n" + num2);
                                }else if (num2<num3){
                                    System.out.println("El orden de mayor a menor es: "
                                        + "\n" + num1 + "\n" + num3 + "\n" + num2);
                                }else{
                                    System.out.println("El orden de mayor a menor es: "
                                        + "\n" + num1 + "\n" + num2 + "\n" + num3);
                                }
                                break;
                            case "4":
                                System.out.println("Regresando al menu principal\n");
                                case3 = "4";
                                break;
                            default:
                                System.out.println("\nERROR, opción incorrecta\n"
                                    + "Intentelo de nuevo\n");
                                break;
                        }
                        
                        
                    }
                    break;
                case "4":
                    
                    case4 = "0";
                    while (case4 != "4") {
                        String nota1 = "";
                        String nota2 = "";
                        String nota3 = "";
                        String nota4 = "";
                        double promedio = 0;
                        int con = 0;
                        
                        System.out.println("\nEliga una opcion: \n" +
                            "\n1. Ingresar ID y notas de alumno" +
                            "\n2. Mostrar listado de alumnos y promedios" +
                            "\n4. Menu Principal\n");
                        
                        case4 = lector.next();
                        
                        switch(case4){
                            case "1":
                                //Se recorre el arreglo nota hasta encontrar una posicion en la que no se tenga agregado a un usuario
                                //se ingresaran los ID y notas individualmente
                                //Se parsean las notas para realizar la operacion del promedio
                                //Se calcula el promedio
                                for (int i = 0; i < 6; i++) {
                                        if(con == 0){
                                        if(notas[i][0].equals("Sin_ID")){
                                            System.out.println("Ingrese el ID del alumno: ");
                                            String id = lector.next();
                                            notas[i][0] = id;
                                            System.out.println("Ingrese la nota 1: ");
                                            nota1 = lector.next();
                                            notas[i][1] = nota1;
                                            double not1 = Double.parseDouble(nota1);
                                            System.out.println("Ingrese la nota 2: ");
                                            nota2 = lector.next();
                                            notas[i][2] = nota2;
                                            double not2 = Double.parseDouble(nota2);
                                            System.out.println("Ingrese la nota 3: ");
                                            nota3 = lector.next();
                                            notas[i][3] = nota3;
                                            double not3 = Double.parseDouble(nota3);
                                            System.out.println("Ingrese la nota 4: ");
                                            nota4 = lector.next();
                                            notas[i][4] = nota4;
                                            double not4 = Double.parseDouble(nota4);
                                            promedio = (not1+not2+not3+not4)/4;
                                            notas[i][5] = String.valueOf(promedio);
                                            System.out.println("\nDatos ingresado\n");
                                            con = +1;
                                        }
                                        
                                    }
                                }
                                //Verifica si el arreglo esta completo
                                if(!notas[5][0].equals("sin_ID")){
                                    System.out.println("Limite de usuarios completos");
                                }
                                
                                break;
                            case "2":
                                //Muestra el arreglo con los usuarios y notas ingresados
                                    for (int i = 0; i < 6; i++) {
                                        for (int j = 0; j < 6; j++) {
                                            System.out.print(notas[i][j] + "\t");
                                            
                                        }
                                        System.out.println("\n");
                                    }
//                                }
                                break;
                            case "4":
                                System.out.println("Regresando al menu principal\n");
                                case4 = "4";
                                break;    
                            default:
                                System.out.println("\nERROR, opción incorrecta\n"
                                    + "Intentelo de nuevo\n");
                                break;
                        }
                    }                    
                    break;
                    
                case "5":
                    System.out.println("Fin del Programa");
                    System.exit(0);
                    
                    break;
                
                default:
                    System.out.println("\nERROR, opción incorrecta\n"
                            + "Intentelo de nuevo");
                    break;
            }
        }

    }
    
}
