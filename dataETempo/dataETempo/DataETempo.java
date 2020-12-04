package dataETempo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.Duration;

public class DataETempo {
	public static void main(String[] args) {
		// Data e hora atuais:
		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println(dataHora);
		// A partir de valores:
		LocalDate d1 = LocalDate.of(2015,  Month.JULY,  13);
		System.out.println(d1);
		
		// Objeto de tempo baseado em horas e minutos:
		LocalTime t1 = LocalTime.of(17,  18);
		System.out.println(t1);
		// Objeto de tempo baseado em String:
		LocalTime t2 = LocalTime.parse("10:15:30");
		System.out.println(t2);
		
		// Usando LocalDateTime pra pegar valores de Data e Hora:
		LocalDate data = dataHora.toLocalDate();
		System.out.println(data);
		Month mes = dataHora.getMonth();
		System.out.println(mes);
		int dia = dataHora.getDayOfMonth();
		System.out.println(dia);
		int minuto = dataHora.getMinute();
		System.out.println(minuto);
		
		// Operações performadas nestes objetos sempre retornarão
		// um novo objeto, já que esse objetos são imutáveis
		
		LocalDateTime atualizaData = dataHora.withDayOfMonth(13).withYear(2015);
		System.out.println(atualizaData);
		LocalDateTime somaAnos = atualizaData.plusDays(25).plusYears(2);
		System.out.println(somaAnos);
		
		// A API também permite o uso de "ajustadores". Por exemplo,
		// o seguinte seta o dia para o último dia do mês
		LocalDateTime ultimoDia = dataHora.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(ultimoDia);
		
		// Também é possível truncar certas unidades de tempo, por exemplo
		// remover os segundos de um objeto de tempo
		LocalTime segundosTruncados = t2.truncatedTo(ChronoUnit.SECONDS);
		System.out.println(segundosTruncados);
		
		// Define uma duração de 5 horas:
		Duration duracao = Duration.ofHours(5);
		System.out.println(duracao);
		// Adiciona 20 minutos:
		Duration maisMinutos = duracao.plusMinutes(20);
		System.out.println(maisMinutos);
	}
}
