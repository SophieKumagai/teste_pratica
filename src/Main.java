import java.io.*;
import java.util.Scanner;

public class Main {
    // FileWriter - escrever em um arquivo. Esse você coloca caracteres. Esse é um caracter por vez.
    // PrintWriter - classe de saída. Esse você coloca texto. Esse trabalha com blocos de caracteres.
    // IOException

    // write(String texto) - escreve uma sequência de caracteres
    // println(String texto) - você escreve uma linha de texto no arquivo, adicionando uma nova linha após o texto.
    // printf() - excreve uma linha de texto formatado no arquivo
    // close() - fecha o arquivo após a gravação, liberando os recursos associados

    public static void main(String[] args) {
        try {
            File arquivo = new File("C:/Users/AlunoTemp/OneDrive - Instituto Germinare/Área de Trabalho/TECH/LPR/Lista_8_Arquivos/Lista_8_Arquivos");
            Scanner entrada = new Scanner(arquivo);
            while (entrada.hasNextLine()) {
                String linha = entrada.nextLine();
                System.out.println(linha);
            }
            entrada.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("Arquivo não encontrado!");
        }


    }
}