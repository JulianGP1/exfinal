/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crono
 */
public class Estudio3 {

    public static void main(String[] args) {
         List<Cuentas> Cuenta=new ArrayList<>();
         Scanner scan=new Scanner(System.in);
         while (true) {      
             Cuentas cuenta1=new Cuentas("","","");
              System.out.println("¿register new activity?");
            String r=scan.nextLine();
            if (r.equalsIgnoreCase("no")) {
                break;
            }
            
             try {
             System.out.println("egrees u name");
             String name =scan.nextLine();
             Exeps.verificar(name, Cuenta);
             cuenta1.setName(name);
             String code=cuenta1.code(name);
             System.out.println("you code is:"+" "+code);

                 try {
                     
                     Exeps.verificarCode(code, Cuenta);
                      cuenta1.setCode(code);
                 } catch (Exception e) {
                     String code2=cuenta1.code(name);
                       System.out.println("tu codigo nuevo es"+code2);
                      cuenta1.setCode(code2);
                    
                 }
            
             System.out.println("egrees u activity:");
             String activity=scan.nextLine();
             cuenta1.setActivity(activity);

             } catch (Exception e) {

                 System.out.println(e.getMessage());
                 System.out.println("egrees u second activity:");
                 String secAct=scan.nextLine();
                 cuenta1.setActivity2(secAct);

             }
             Cuenta.add(cuenta1);
        }
    }
    
}
