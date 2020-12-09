package model;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Todo implements ITodo {
	
	public final long id;
	private String resumo;
	private String descricao;
	private Boolean feito;
	private Date dataFim;
	
	public Todo() {
		this(-1);
	}
	
	public Todo(long i) {
		this(i, "");
	}
	
	@Autowired
	public Todo(long i, @Qualifier("resumo") String resumo) {
		this.id = i;
		this.resumo = resumo;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public String getResumo() {
		return resumo;
	}

	@Override
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
	@Override
	public String getDescricao() {
		return descricao;
	}
	
	@Autowired
	@Qualifier("descricao")
	@Override
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public boolean foiFeito() {
		return feito;
	}

	@Autowired
	@Override
	public void setFeito(boolean setFeito) {
		this.feito = setFeito;
	}

	@Override
	public Date getDataFim() {
		return dataFim;
	}

	@Autowired
	@Override
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	@Override
	public int hashCode() {
		final int primo = 31;
		int resultado = 1;
		resultado = primo * resultado + (int) (id ^ (id >>> 32));
		return resultado;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo outro = (Todo) obj;
		if (id != outro.id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Todo [id = " + id + ", resumo = " + resumo + ", descrição = " + descricao + "]";
	}

	@Override
	public Todo copia() {
		Todo todo = new Todo(id, resumo);
		todo.setFeito(this.foiFeito());
		todo.setDataFim(this.getDataFim());
		todo.setDescricao(getDescricao());
		
		return todo;
	}
}
