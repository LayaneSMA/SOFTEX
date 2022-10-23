package com.mycompany.testes;

public class Exception {

    public static void main(String[] args) {
        
        //Na situação a seguir não houve nada fora do esperado. 
        //Neste caso segue o código sem falhas.
        
        String lista[] = {"Feijão" , "Arroz", "Cuscuz", "Açúcar" } ;
        
        System.out.println("Ontem fui ao mercado comprar alguns produtos." );
        
        System.out.println("O " + lista[2] + " estava em falta no mercado." );
        
        System.out.println("O " + lista[3] + " estava muito caro e não comprei." );
        
        System.out.println("Resolvi comprar apenas: " + lista[0]+" e "+ lista[1] + ".");
        
       
     
     
        //Neste caso, ao ser informado uma posição na lista que não é válida,
        // a exceção é tratada.
        System.out.println("________________________________________________");
        try{ 
           
        String vetor[] = {"Feijão" , "Arroz", "Cuscuz", "Açúcar" } ;
        
        System.out.println("O item mais caro na lista foi o " + vetor[4] + "." );
        
        }
        catch(ArrayIndexOutOfBoundsException exception){
       
         System.out.println("O item informado não consta na lista de compras.");}
     
    }
}
    




       
    
    
   
   
       
       


    
