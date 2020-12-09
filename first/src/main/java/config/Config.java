package config;

import java.util.Date;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
	"first"
})
public class Config {
	
	@Bean
	public Long getId() {
		return Long.valueOf(0);
	}
	
	@Bean
	@Qualifier("resumo")
	public String getResumo() {
		return "Spring DI";
	}
	
	@Bean
	@Qualifier("descricao")
	public String getDescricao() {
		return "Depend�ncia em Spring � uma um recurso poderoso para invers�o de controle.";
	}
	
	@Bean
	public Boolean foiFeito() {
		return Boolean.FALSE;
	}
	
	@Bean
	public Date getDataFim() {
		return new Date();
	}
}