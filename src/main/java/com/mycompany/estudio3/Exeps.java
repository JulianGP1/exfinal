
package com.mycompany.estudio3;

import java.util.List;

public class Exeps {
     public static void verificar(String name, List<Cuentas> Cuenta) throws Exception {
         for (Cuentas cuentas : Cuenta) {
             if (name.equalsIgnoreCase(cuentas.getName())) {
            throw new Exception("¡La cuenta ya está registrada!");
             }
         }
     }
     public static void verificarCode(String code, List<Cuentas> Cuenta) throws Exception {
         for (Cuentas cuentas : Cuenta) {
             if (code.equalsIgnoreCase(cuentas.getCode())) {
            throw new Exception("¡YA EL CODIGO ESTA EN USO!");
             }
         }
     }
}
