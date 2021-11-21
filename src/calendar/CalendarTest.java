package calendar;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
	
		System.out.println(c);//Como podemos ver, ele da muitas informacoes pra gente
		
		if(Calendar.SUNDAY == c.getFirstDayOfWeek()) {
			System.out.println("Primeiro dia da semana no seus pais e Domingo");
		} else {
			System.out.println("Voce mora na Franca :0");
		}
		
		int hora = c.get(Calendar.HOUR_OF_DAY);//HOUR vai ate as 12 horas, HOUR_OF_DAY ate 24
		
		//Sistema de Boas Vindas...
		
		if(hora > 6 && hora < 12) {
			System.out.println("Bom dia");
		} else if (hora >= 12 && hora < 18) {
			System.out.println("Boa Tarde");
		} else {
			System.out.println("Boa Noite");
		}
		
		System.out.println(c.getTime()); //Ele retorna um date
		System.out.println("Dia do Ano: " + c.get(Calendar.DAY_OF_YEAR));
		System.out.println("Dia do Mes: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia da Semana: " + c.get(Calendar.DAY_OF_WEEK));
		
		//Adicionando horas...
		
		c.add(Calendar.HOUR, 24); //24 horas. Ele vira o dia automaticamente
		
		System.out.println(c.getTime());
		
		//Mas se eu quiser nao virar o dia, mes ou ano? Use o comando Roll, ai ele so vai mudar o campo que voce esta
		//Trabalhando, aqui no caso ele so vai mudar o mes
		c.roll(Calendar.MONTH, 3);
		
		System.out.println(c.getTime());
	}
}