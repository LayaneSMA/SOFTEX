
package com.mycompany.animal;

import java.io.*;

class Cachorro implements Serializable{}
        
public class SerializacaoDesserializacao { 

    public static void main(String[] args) {
        
        Cachorro c = new Cachorro(); 
  try{
FileOutputStream fo = new FileOutputStream("teste.ser");
ObjectOutputStream oo = new ObjectOutputStream(fo);
   oo.writeObject(c); 
    oo.close();
System.out.println("Serializado com sucesso");  }
  catch(Exception e){e.printStackTrace();}         
 
 try{
    FileInputStream fi = new FileInputStream("teste.ser");
    ObjectInputStream oi = new ObjectInputStream(fi);
    c =(Cachorro) oi.readObject();
    oi.close();
System.out.println("Desserializado com sucesso");
 }catch(Exception e){e.printStackTrace();}          }}
    

