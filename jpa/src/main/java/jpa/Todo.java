package jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String resumo;
	private String descricao;
	private Boolean feito;
	private Date dataFim;
	
	public Todo() {
		
	}
	
	public Todo(String resumo) {
		this.resumo = resumo;
	}
	
	public void setId(long id) {
		
	}
	
	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getFeito() {
		return feito;
	}

	public void setFeito(Boolean feito) {
		this.feito = feito;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public Todo copia() {
		Todo todo = new Todo(resumo);
		todo.setFeito(getFeito());
		todo.setDataFim(getDataFim());
        todo.setDescricao(getDescricao());
        
        return todo;
	}	
}
