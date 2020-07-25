package dao;

import java.util.HashMap;
import java.util.Map;

import model.Infracao;

public class DataBaseInfracoes {
	private static Map<Integer, Infracao> infracoes;

	static {
		infracoes = new HashMap<Integer, Infracao>();
		infracoes.put(0, new Infracao(0, 68.24f));
		infracoes.put(1, new Infracao(1, 23.17f));
		infracoes.put(2, new Infracao(2, 150.15f));
		infracoes.put(3, new Infracao(3, 166.99f));
		infracoes.put(4, new Infracao(4, 12.15f));
		infracoes.put(5, new Infracao(5, 184.49f));
		infracoes.put(6, new Infracao(6, 151.15f));
		infracoes.put(7, new Infracao(7, 56.67f));
		infracoes.put(8, new Infracao(8, 100.64f));
		infracoes.put(9, new Infracao(9, 195.19f));
		infracoes.put(10, new Infracao(10, 152.19f));
		infracoes.put(11, new Infracao(11, 200.15f));
		infracoes.put(12, new Infracao(12, 91.15f));
		infracoes.put(13, new Infracao(13, 70.16f));
		infracoes.put(14, new Infracao(14, 46.55f));
		infracoes.put(15, new Infracao(15, 198.12f));
	}

	public static Infracao getInfracao(Integer index) {
		if(index > infracoes.size())
			return infracoes.get(15);
		return infracoes.get(index);
	}

	public static int numberOfElements() {
		return infracoes.size();
	}
}
