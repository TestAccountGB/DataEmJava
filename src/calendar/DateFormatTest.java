package calendar;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest {
	public static void main(String[] args) {
		
		//O DateFormat ele serve apenas para formatar a data pra gente.
		
		Calendar c = Calendar.getInstance();
		DateFormat[] dt = new DateFormat[6]; //Criar um array para mostrar todos os 6 tipos de formatacao que temos
		String[] string = new String[6];
		//Esses tipos de instaciamento sao apenas os formatos
		
		dt[0] = DateFormat.getInstance();
		dt[1] = DateFormat.getDateInstance();
		dt[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dt[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dt[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dt[5] = DateFormat.getDateInstance(DateFormat.FULL);
		
		string[0] = "Instancia Normal: ";
		string[1] = "Instancia Date Normal: ";
		string[2] = "Instancia Date Short: ";
		string[3] = "Instancia Date Medium: ";
		string[4] = "Instancia Date Long: ";
		string[5] = "Instancia Date Full: ";
		
		int i = 0;
		for(DateFormat DT : dt) {
			System.out.println(string[i] +  "\n" + DT.format(c.getTime()) + "\n");
			i++;
		}
	}
}