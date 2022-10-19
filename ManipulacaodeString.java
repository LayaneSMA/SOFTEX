//Estruture três códigos, os quais devem conter
//uma função de manipulação de string que obtenha resultado.

public class ManipulacaodeString {public static void main(String[] args) {
        
    String animais = "COBRA, Urso, CAchorro E gaTO.";
    String animaisMinusc = animais.toLowerCase();
    System.out.println("Os animais informados foram : " + animaisMinusc );
    
    String siglas = "inss, Cnpj, cPf, cbf.";
    String siglasMaisc = siglas.toUpperCase();
    System.out.println( "A forma correta de escrita de siglas, são: " + siglasMaisc);
    
    String nomeCompleto = "Maria Joaquina de Amaral Pereira Góes";
    int numCaracter = nomeCompleto.length();
    int stringSemEspaco = nomeCompleto.replace(" ", "").length();
    
    System.out.println("Nome completo informado: " + nomeCompleto);
    System.out.println("O total de Caracter: " + numCaracter);
    System.out.println("O nome completo possui : " + stringSemEspaco + " letras");
    }
}
