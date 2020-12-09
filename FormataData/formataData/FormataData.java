package formataData;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FormataData {
	public static void main(String[] args) {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("d MM yyyy");
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd MMM yyyy");
        LocalDate data = LocalDate.of(2015, Month.JULY, 1);
        
        System.out.println(data.format(formatador));
        System.out.println(data.format(f1));
        LocalDate d2 = LocalDate.of(2015,  Month.JULY,  15);
        System.out.println(d2.format(formatador));
	}
}