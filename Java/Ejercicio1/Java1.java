/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cac4.pkg0;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Java1 {

    /**
     * @param args the command line arguments
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input = new Scanner(System.in);
        String nombre = "";
        String apellido = "";
        int edad = 0;
        String hobbie = "";
        String prefCodeEditor = "";
        String SO = "";
        
        System.out.println("Ingrese Nombre: ");
        nombre = input.next();
        System.out.println("Ingrese Apellido: ");
        apellido = input.next();
        System.out.println("Ingrese Edad: ");
        edad = input.nextInt();
        System.out.println("Ingrese Hobbie: ");
        hobbie = input.next();
        System.out.println("Ingrese Editor de Codigo Preferido: ");
        prefCodeEditor = input.next();
        System.out.println("Ingrese SO que utiliza: ");
        SO = input.next();
        
        System.out.println("\tBienvenido al Sistema\n");
        System.out.println(ANSI_CYAN_BACKGROUND+"Los datos ingresados son:\t\n"+ANSI_RESET);
        System.out.println(ANSI_RED+"Nombre: "+nombre+"\n"+ANSI_RESET);
        System.out.println(ANSI_RED+"Apellido: "+apellido+"\n"+ANSI_RESET);
        System.out.println(ANSI_RED+"Edad: "+edad+"\n"+ANSI_RESET);
        System.out.println(ANSI_RED+"Hobbie: "+hobbie+"\n"+ANSI_RESET);
        System.out.println(ANSI_RED+"Editor de Codigo: "+prefCodeEditor+"\n"+ANSI_RESET);
        System.out.println(ANSI_RED+"Sistema Operativo: "+SO+"\n"+ANSI_RESET);
        
    }
    
}
