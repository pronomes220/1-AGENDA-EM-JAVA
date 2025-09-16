##🗓️ Projeto AGENDA em Java##

Este projeto é uma aplicação simples de agenda em console desenvolvida em Java, que permite criar, excluir e visualizar eventos armazenados em arquivos de texto (.txt).

 Funcionalidades

Criar nova agenda

Usuário informa título, data e duração do evento.

Um arquivo .txt é gerado automaticamente com os dados.

Excluir agenda

Usuário informa o nome da agenda.

O arquivo .txt correspondente é excluído, se existir.

Visualizar agenda

Usuário informa o nome da agenda.

O sistema lê e exibe todo o conteúdo do arquivo.

Menu interativo

Navegação simples com opções numéricas:

Adicionar novo evento

Excluir agenda

Mostrar agendas

Sair

 Tecnologias utilizadas

Java (JDK 8+)

Classes e métodos (FileWriter, FileInputStream, File, Scanner)

Estrutura modular com 4 classes principais:

NovaAgenda → cria e salva novos eventos.

ExcluirAgenda → exclui arquivos de agenda.

leitor → abre e exibe agendas.

main → gerencia o menu principal do programa.
