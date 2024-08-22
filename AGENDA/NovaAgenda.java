package AGENDA;

import java.io.FileWriter;
import java.util.Scanner;

public class NovaAgenda {
    String data;
    double minutos;
    void agenda() throws Exception {
        
        Scanner EntradaNOva = new Scanner(System.in);
        String nomeAgenda;
        System.out.println("Ola bem vindo a sua agenda!\n");
        System.out.println("Informe o titulo da Agenda!");
        nomeAgenda = EntradaNOva.nextLine();

        System.out.print("Data de inicio do evento: ");// data do evento
        data = EntradaNOva.nextLine();
       
        System.out.print("Duração do evento: ");// duraçao do evento
        minutos = EntradaNOva.nextDouble();
        EntradaNOva.nextLine();

        FileWriter novagenda = new FileWriter(nomeAgenda.concat(".txt"));
        novagenda.write("TITULO:"+ nomeAgenda +"\n");
        novagenda.write("DATA:"+ data + "\n");
        novagenda.write("DURACAO:" + minutos + " MIN.");
        // fechamento
        EntradaNOva.close();
        novagenda.close();
    }
}
