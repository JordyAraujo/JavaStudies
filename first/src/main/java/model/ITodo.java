package model;

import java.util.Date;

public interface ITodo {
	long getId();
	String getResumo();
	void setResumo(String resumo);
	void setDescricao(String descricao);
	String getDescricao();
	boolean foiFeito();
	void setFeito(boolean foiFeito);
	Date getDataFim();
	void setDataFim(Date dataFim);
	ITodo copia();
}