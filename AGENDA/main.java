package AGENDA;

import java.util.Scanner;
import java.io.*;

public class main {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);// Scanner para usuario!!
        boolean loop = true;
        while (loop) {
            System.out.println("1-Adicionar novo evento");
            System.out.println("2-Excluir Agenda");
            System.out.println("3-Mostrar agendas");
            System.out.println("4-Sair");
            int menu;
            menu = entrada.nextInt();
            entrada.nextLine(); // Limpa o buffer após a leitura do número

            switch (menu) {
                case 1:
                    NovaAgenda acesso = new NovaAgenda();
                    acesso.agenda();
                    loop = true;
                    break;
                case 2:
                    ExcluirAgenda exclusao = new ExcluirAgenda();// da acesso ao metodo de exclusao de arquivo!
                    exclusao.exclusao();
                    loop = true;
                    break;
                case 4:
                    loop = false;
                    break;
                case 3:
                    leitor.main(null);
                    loop = true;
                    break;
            }
        }
        // nao fechar scanner para o loop sempre funcionar
    }
}
