package controller;

import java.util.List;

import dao.DataBaseInfracoes;

public class InfracaoController {

	public String GetMessageRemessa(List<Integer> infracoes, Boolean writeValues) {
		StringBuilder builder = new StringBuilder();
		
		builder.append( (infracoes.size() > 1) ? "Remessa emitida com as seguintes infrações:" : "Remessa emitida com a seguinte infração:");


		for(Integer value: infracoes) {
			builder.append(" ");
			builder.append(value);
			builder.append((writeValues) ? " cujo valor é R$ " : "");
			builder.append((writeValues) ? DataBaseInfracoes.getInfracao(value).getValue() : "");//Aqui buscaria o valor das infrações do banco de dados como esse exercicio não requisitava o uso de BD fiz uma classe statica que serve como BD nesse caso
			builder.append(",");
		}
		
		return builder.substring(0, builder.length()-1);//Remove o ultimo digito que sempre será uma virgula
	}
}
	

