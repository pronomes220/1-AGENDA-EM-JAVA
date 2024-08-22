package AGENDA;

import java.io.File;
import java.util.Scanner;

public class ExcluirAgenda {
    void exclusao() {// metodo para exclusao de qualquer agenda

        Scanner entrada1 = new Scanner(System.in);
        // progama usado para apagar arquivos em forma txt por padrao!!

        boolean ex = true;
        while (ex) {
            System.out.println("Digite o nome da agenda para exclusao!");
            String resposta;
            resposta = entrada1.nextLine();
            File file = new File(resposta);
            if (file.delete()) {
                System.out.println("Arquivo excluido com sucesso!");
                ex = false;
            } else {
                System.out.println("arquivo nao existe! tente novamente");
                ex = true;
            }
        }
    }
}
