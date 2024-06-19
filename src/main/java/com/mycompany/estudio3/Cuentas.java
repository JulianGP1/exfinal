
package com.mycompany.estudio3;

import java.util.Random;

class Cuentas implements Capacity{
    String name;
    String code;
    String activity;
    String activity2;
    public Cuentas(String name, String code, String activity) {
        this.name = name;
        this.code = code;
        this.activity = activity;
    }

    public Cuentas(String name, String code, String activity, String activity2) {
        this.name = name;
        this.code = code;
        this.activity = activity;
        this.activity2 = activity2;
    }

    public String getActivity2() {
        return activity2;
    }

    public void setActivity2(String activity2) {
        this.activity2 = activity2;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String code(String name) {
        String namee[]=name.split(" ");
        String code="";
         Random random = new Random();

     int numeroEntero = random.nextInt(3);

        for (String string : namee) {
            char letra=string.charAt(0);
            code+=letra;
        }
        code=code+numeroEntero;
        return code;
    }
    
    
}
