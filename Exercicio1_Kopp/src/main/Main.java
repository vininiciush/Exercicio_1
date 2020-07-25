package main;

import java.util.Arrays;

import controller.InfracaoController;

public class Main {
	public static void main(String[] args) {
		InfracaoController infracoesController = new InfracaoController();
		
		String saida = infracoesController.GetMessageRemessa(Arrays.asList(1,5,8), true);
		
		System.out.println(saida);
	}
}
