/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numletras59903;
import java.util.Scanner;
/**
 *
 * @author Adrian Quej
 */
public class NumLetras59903 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0;
        String uno = "uno";
        String dos = "dos";
        String tres = "tres";
        String cuatro = "cuatro";
        String cinco = "cinco";
        String seis = "seis";
        String siete = "siete";
        String ocho = "ocho";
        String nueve = "nueve";
        String vein ="veinti";
        String trei ="treinta";
        String cuar ="cuarenta";
        String cinc = "cincuenta";
        String sese = "sesenta";
        String sete = "setenta";
        String oche = "ochenta";
        String nove = "noventa";
        
                
        
        
        Scanner miConsola = new Scanner(System.in);
        System.out.println("Escribe un numero entero entre el 0 y el 99 : ");
        numero = miConsola.nextInt();
        System.out.println("Tu numero en letras se escribe asi: ");
        switch (numero) {
            case 0:
                System.out.println("cero");
            case 1:
              System.out.println(uno);
                break;
                
            case 2:
                System.out.println(dos);
                break;
                
            case 3:
              System.out.println(tres);
                break;
            
            case 4:
               System.out.println(cuatro);
                break;
                
            case 5:
              System.out.println(cinco);
                break;
            case 6:
              System.out.println(seis);
                break;
            case 7:
              
                System.out.println(siete);
                break;
            case 8:
              
                System.out.println(ocho);
                break;
            case 9:
              
                System.out.println(nueve);
                break;
            case 10:
              
                System.out.println("diez");
                break;
            case 11:
               System.out.println("once");
                break;
            case 12:
                 System.out.println("doce");
                break;
            case 13:
              System.out.println("trece");
                break;
            case 14:
              System.out.println("catorce");
                break;
            case 15:
              System.out.println("quince");
                break;
            case 16:
              System.out.println("dieciseis");
                break;
            case 17:
              System.out.println("diecisiete");
                break;
            case 18:
              System.out.println("dieciocho");
                break;
            case 19:
              System.out.println("diecinueve");
                break;
            case 20:
              System.out.println("veinte");
                break;
            case 30:
                System.out.println(trei);
                break;
            case 40:
                System.out.println(cuar);
                break;
            case 50:
                System.out.println(cinc);
                break;
            case 60:
                System.out.println(sese);
                break;
            case 70:
                System.out.println(sete);
                break;
            case 80:
                System.out.println(oche);
                break;
            case 90:
                System.out.println(nove);
                break;
            default:
                if ((numero > 90) && (numero < 100)){
                    int otnum = 0;
                    otnum = (numero - 90);
                    String otlet;
                    switch (otnum) {
                        case 1:
                            otlet = uno;
                            break;
                        case 2:
                            otlet = dos;
                            break;
                        case 3:
                            otlet = tres;
                            break;
                        case 4:
                            otlet = cuatro;
                            break;
                        case 5:
                            otlet = cinco;
                            break;
                        case 6:
                            otlet = seis;
                            break;
                        case 7:
                            otlet = siete;
                            break;
                        case 8:
                            otlet = ocho;
                            break;
                        case 9:
                            otlet = nueve;
                            break;
                        default:
                            throw new AssertionError();
                    }
                    System.out.println( nove + " y " + otlet);
                }
                else if ((numero > 80) && (numero < 90)){
                    int otnum = 0;
                    otnum = (numero - 80);
                    String otlet;
                    switch (otnum) {
                        case 1:
                            otlet = uno;
                            break;
                        case 2:
                            otlet = dos;
                            break;
                        case 3:
                            otlet = tres;
                            break;
                        case 4:
                            otlet = cuatro;
                            break;
                        case 5:
                            otlet = cinco;
                            break;
                        case 6:
                            otlet = seis;
                            break;
                        case 7:
                            otlet = siete;
                            break;
                        case 8:
                            otlet = ocho;
                            break;
                        case 9:
                            otlet = nueve;
                            break;
                        default:
                            throw new AssertionError();
                    }
                    System.out.println( oche + " y " + otlet);
                } else if ((numero > 70) && (numero < 80)){
                    int otnum = 0;
                    otnum = (numero - 70);
                    String otlet;
                    switch (otnum) {
                        case 1:
                            otlet = uno;
                            break;
                        case 2:
                            otlet = dos;
                            break;
                        case 3:
                            otlet = tres;
                            break;
                        case 4:
                            otlet = cuatro;
                            break;
                        case 5:
                            otlet = cinco;
                            break;
                        case 6:
                            otlet = seis;
                            break;
                        case 7:
                            otlet = siete;
                            break;
                        case 8:
                            otlet = ocho;
                            break;
                        case 9:
                            otlet = nueve;
                            break;
                        default:
                            throw new AssertionError();
                    }
                    System.out.println( sete + " y " + otlet);
                } else if ((numero > 60) && (numero < 70)){
                    int otnum = 0;
                    otnum = (numero - 60);
                    String otlet;
                    switch (otnum) {
                        case 1:
                            otlet = uno;
                            break;
                        case 2:
                            otlet = dos;
                            break;
                        case 3:
                            otlet = tres;
                            break;
                        case 4:
                            otlet = cuatro;
                            break;
                        case 5:
                            otlet = cinco;
                            break;
                        case 6:
                            otlet = seis;
                            break;
                        case 7:
                            otlet = siete;
                            break;
                        case 8:
                            otlet = ocho;
                            break;
                        case 9:
                            otlet = nueve;
                            break;
                        default:
                            throw new AssertionError();
                    }
                    System.out.println( sese + " y " + otlet);
                } else if ((numero > 50) && (numero < 60)){
                    int otnum = 0;
                    otnum = (numero - 50);
                    String otlet;
                    switch (otnum) {
                        case 1:
                            otlet = uno;
                            break;
                        case 2:
                            otlet = dos;
                            break;
                        case 3:
                            otlet = tres;
                            break;
                        case 4:
                            otlet = cuatro;
                            break;
                        case 5:
                            otlet = cinco;
                            break;
                        case 6:
                            otlet = seis;
                            break;
                        case 7:
                            otlet = siete;
                            break;
                        case 8:
                            otlet = ocho;
                            break;
                        case 9:
                            otlet = nueve;
                            break;
                        default:
                            throw new AssertionError();
                    }
                    System.out.println( cinc + " y " + otlet);
                } else if ((numero > 40) && (numero < 50)){
                    int otnum = 0;
                    otnum = (numero - 40);
                    String otlet;
                    switch (otnum) {
                        case 1:
                            otlet = uno;
                            break;
                        case 2:
                            otlet = dos;
                            break;
                        case 3:
                            otlet = tres;
                            break;
                        case 4:
                            otlet = cuatro;
                            break;
                        case 5:
                            otlet = cinco;
                            break;
                        case 6:
                            otlet = seis;
                            break;
                        case 7:
                            otlet = siete;
                            break;
                        case 8:
                            otlet = ocho;
                            break;
                        case 9:
                            otlet = nueve;
                            break;
                        default:
                            throw new AssertionError();
                    }
                    System.out.println( cuar + " y " + otlet);
                } else if ((numero > 30) && (numero < 40)){
                    int otnum = 0;
                    otnum = (numero - 30);
                    String otlet;
                    switch (otnum) {
                        case 1:
                            otlet = uno;
                            break;
                        case 2:
                            otlet = dos;
                            break;
                        case 3:
                            otlet = tres;
                            break;
                        case 4:
                            otlet = cuatro;
                            break;
                        case 5:
                            otlet = cinco;
                            break;
                        case 6:
                            otlet = seis;
                            break;
                        case 7:
                            otlet = siete;
                            break;
                        case 8:
                            otlet = ocho;
                            break;
                        case 9:
                            otlet = nueve;
                            break;
                        default:
                            throw new AssertionError();
                    }
                    System.out.println( trei + " y " + otlet);
                } else if ((numero > 20) && (numero < 30)){
                    int otnum = 0;
                    otnum = (numero - 20);
                    String otlet;
                    switch (otnum) {
                        case 1:
                            otlet = uno;
                            break;
                        case 2:
                            otlet = dos;
                            break;
                        case 3:
                            otlet = tres;
                            break;
                        case 4:
                            otlet = cuatro;
                            break;
                        case 5:
                            otlet = cinco;
                            break;
                        case 6:
                            otlet = seis;
                            break;
                        case 7:
                            otlet = siete;
                            break;
                        case 8:
                            otlet = ocho;
                            break;
                        case 9:
                            otlet = nueve;
                            break;
                        default:
                            throw new AssertionError();
                    }
                    System.out.println( vein + otlet);
                } else{
                    System.out.println("El numero no es un entero que se encuentre entre el 0 y el 99");
                }
                } 
                
        }
        
        } 
    
    

