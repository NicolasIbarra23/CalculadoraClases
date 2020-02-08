
package calculadoraclases;

import java.util.Scanner;
public class CalculadoraConsola {
    
    public static void main(String[] args){
        
        CalculadoraClases obj1  = new CalculadoraClases();
        Scanner leer = new Scanner (System.in); 
        float num1;
        float num2;
        double resultado = 0;
        int sel = 0;
        
        do
        {
            System.out.println("\n");
            System.out.print("Seleccione la operación que desea realizar: ");
            System.out.println("\n");
            System.out.println("-----------------------------");
            System.out.println("- 1.  SUMA                  -");
            System.out.println("- 2.  RESTA                 -");
            System.out.println("- 3.  MULTIPLICACIÓN        -");
            System.out.println("- 4.  DIVISION              -");
            System.out.println("- 5.  FUN. INVERSA          -");
            System.out.println("- 6.  FUN. TRIGONOMÉTRICAS  -");
            System.out.println("- 7.  SALIR                 -");
            System.out.println("-----------------------------");
            sel = leer.nextInt();
            
            switch(sel)
            {
                case 1: 
                    System.out.println("\n");
                    System.out.println ("SUMA");
                    System.out.print("Inserte el primer número: ");
                    num1 = leer.nextInt();
                    System.out.print("Inserte el número 2: ");
                    num2 = leer.nextInt();
                    resultado = obj1.suma(num1 , num2);
                    System.out.println("El resultado de la suma es: " + resultado );
                    break;
                    
                case 2:
                    System.out.println("\n");
                    System.out.println("RESTA\n");
                    System.out.print("Inserte el primer número: ");
                    num1 = leer.nextInt();
                    System.out.print("Inserte el número 2: ");
                    num2 = leer.nextInt();
                    resultado = obj1.resta(num1 , num2);
                    System.out.println("El resultado de la suma es: " +resultado);
                    break;
                    
                case 3: 
                    System.out.println("\n");
                    System.out.println("MULTIPLICACIÓN");
                    System.out.print("Inserte el primer número: ");
                    num1 = leer.nextInt();
                    System.out.print("Inserte el número 2: ");
                    num2 = leer.nextInt();
                    resultado = obj1.mult(num1 , num2);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                    
                case 4:
                    System.out.println("\n");
                    System.out.println("DIVISÓN");
                    System.out.print("Inserte el primer número: ");
                    num1 = leer.nextInt();
                    System.out.print("Inserte el número 2: ");
                    num2 = leer.nextInt();
                    resultado = obj1.div(num1 , num2);
                    System.out.println("El resultado de la división es: " + resultado);
                    break;
                    
                case 5:
                    System.out.println("\n");
                    System.out.println("FUNCIÓN IVERSA (1/X)");
                    System.out.print("Inserte el primer número: ");
                    num1 = leer.nextInt();
                    resultado = obj1.inv(num1);
                    System.out.println("El resultado de la división es: " + resultado);
                    break;
                    
                case 6:
                    int sel2= 0;
                    do
                    {
                        System.out.println("FUNCIONES TRIGONOMÉTRICAS\n");
                        System.out.print("Seleccione la operación que desea realizar: ");
                        System.out.println("\n");
                        System.out.println("------------------------------");
                        System.out.println("- 1. SENO                    -");
                        System.out.println("- 2. COSENO                  -");
                        System.out.println("- 3. TANGENTE                -");
                        System.out.println("- 4. SALIR AL MENU PRINC.    -");
                        System.out.println("------------------------------");
                        sel2 = leer.nextInt();
                        
                        switch(sel2)
                        {
                            case 1:
                                System.out.println("\n");
                                System.out.println("FUNCIÓN SENO");
                                System.out.print("Inserte el número: ");
                                num1 = leer.nextInt();
                                resultado = obj1.sen(num1);
                                System.out.println("El seno del número es: " + resultado);
                                break;
                                
                            case 2:
                                System.out.println("\n");
                                System.out.println("FUNCIÓN COSENO");
                                System.out.print("Inserte el número: ");
                                num1 = leer.nextInt();
                                resultado = obj1.cos(num1);
                                System.out.println("El coseno de este número es: " + resultado);
                                break;
                                
                            case 3:
                                System.out.println("\n");
                                System.out.println("FUNCIÓN TANGENTE");
                                System.out.print("Inserte el número: ");
                                num1 = leer.nextInt();
                                resultado = obj1.tan(num1);
                                System.out.println("La tangente de este número es: " + resultado);
                                break;
                                
                        }
                    }while (sel2 != 4 && sel2 < 4);  
            }
        }while (sel != 7 && sel < 7);
        System.out.println("Ha elegido salir de la calculadora, Hasta luego");
    }
}
