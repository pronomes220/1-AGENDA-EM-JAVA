package AGENDA;

import java.io.*;
import java.util.Scanner;

public class leitor {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        System.out.println("qual agenda deseja abrir: ");// usuario informa o nome do arquivo para abertura
        String leitura;
        leitura = entrada.nextLine().concat(".txt");// a contatenação ja adiciona o tipo de arquivo a ser aberto
        FileInputStream abrir = new FileInputStream(leitura);// classe para abertura/leitura de arquivo. recebenedo
                                                             // paramentro de entrada do usuario
        Scanner leitor = new Scanner(abrir);// Scanner com parametro do objeto "abrir"
        while (leitor.hasNextLine()) {// verifica se em "leitor" do Scanner com parametro do abridor de arquivo, que
                                      // ja recebe o nome do arquivo pelo usuario contem linhas!!
            String linhas = leitor.nextLine();
            System.out.println(linhas+"\n\n");
        }
    }
}
