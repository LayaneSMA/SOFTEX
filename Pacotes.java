
package com.mycompany.institutoeducar;

public class InstitutoEducar {

    public static void main(String[] args) {
        
        System.out.println("---- INSTITUTO EDUCAR ----");
        
        Instituto ie = new Instituto();
        ie.local = "RECIFE/PE";
        ie.cnpj = 1234567891;
        ie.gestor = "Luiz Inácio da Silva";
       
        ie.Dados();
    }
    
}
