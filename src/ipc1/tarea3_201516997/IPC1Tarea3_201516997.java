/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.tarea3_201516997;

import java.util.Scanner;

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
        
        String [] usuarios = {"", "", "", "", ""};
        String [][] notas = new String[6][6];
        int op = 0;
        int case1 = 0;
        int case2;
        int case3;
        int case4;
        int i = 0;
        int num_entero;
        double num1;
        double num2;
        double num3;
        
        Scanner lector = new Scanner(System.in);
        //Menu principal
        while (op != 5) {
            
            
            System.out.println("[IPC1]Tarea3_201516997 \n --Menu Principal--\n" + 
                    "\nEliga una opcion: \n" +
                    "\n1. Usuarios" +
                    "\n2. Contador de dígitos" +
                    "\n3. Tres números de mayor a menor" +
                    "\n4. Calcular promedio" +
                    "\n5. Salir\n");
            op = lector.nextInt();
            
            switch(op){
                case 1:
                    
                    while(case1 != 4){
                        System.out.println("\nEliga una opcion: \n" +
                            "\n1. Ingresar Usuarios" +
                            "\n2. Mostrar Usuarios ascendente" +
                            "\n3. Mostrar Usuarios descendente" +
                            "\n4. Menu Principal");
                        case1 = lector.nextInt();
                    
                    
                        switch(case1){
                            case 1:
                                
                                int cont = 0;
                                String usuario = "";
                                System.out.println("Ingrese usuario: ");
                                while(cont ==0){
                                    usuario = lector.next();
                                    usuarios[i] = usuario;
                                    if(usuarios[i].equals("")){
                                        cont = cont+1;
                                    }else{
                                        i = i+1;
                                    }
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("\nERROR, opción incorrecta\n"
                                    + "Intentelo de nuevo");
                        break;
                            
                        }    
                    }
                    break;
                
                case 2:
                    System.out.println("");
                    break;
                
                case 3:
                        System.out.println("Ingrese el primer numero: ");
                        num1 = lector.nextInt();
                        System.out.println("Ingrese el segundo numero: ");
                        num2 = lector.nextInt();
                        System.out.println("Ingrese el tercer numero: ");
                        num3 = lector.nextInt();
                        if(num1>num2){
                            if(num2>num3){
                                System.out.println("El orden ascendente de los numeros es: "
                                + "\n" + num3 + "\n" + num2 + "\n" + num1);
                            }else if (num1>num3){
                                System.out.println("El orden ascendente de los numeros es: "
                                + "\n" + num2 + "\n" + num3 + "\n" + num1);
                            }else{
                                System.out.println("El orden ascendente de los numeros es: "
                                + "\n" + num2 + "\n" + num1 + "\n" + num3);
                            }
                        }else if(num1>num3){
                                System.out.println("El orden ascendente de los numeros es: "
                                + "\n" + num3 + "\n" + num1 + "\n" + num2);
                            }else if (num2>num3){
                                System.out.println("El orden ascendente de los numeros es: "
                                + "\n" + num1 + "\n" + num3 + "\n" + num2);
                            }else{
                                System.out.println("El orden ascendente de los numeros es: "
                                + "\n" + num1 + "\n" + num2 + "\n" + num3);
                            }
                    break;
                
                default:
                    System.out.println("\nERROR, opción incorrecta\n"
                            + "Intentelo de nuevo");
                    break;
                
                
                
                
            }
        }

    }
    
}
