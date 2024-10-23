package org.aplicacao;

import java.io.IOException;
import java.util.Scanner;

import org.aplicacao.servico.ApiServico;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ApiServico apiServico = new ApiServico();

        System.out.print("Insira o CEP que gostaria de mais informações: ");
        String cep = sc.nextLine();
        try {
            System.out.println(apiServico.getEndereco(cep));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}