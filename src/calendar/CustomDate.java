package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CustomDate {
	
	public static void main(String[] args) {

		// Para fazer uma data personalizada, nos usamos o SimpleDateFormat.

		// Primeiramente precisamos fazer uma String da nossa data

		String datePattern = "'Dia: 'dd'\nDo Mes: 'MM'\nNo Ano de: 'yyyy '\nAs: 'HH:mm:ss";
		// Tudo que estiver em aspas simples sao palavras normais
		
		// https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		
		// Esse e o link onde mostra todas as letras e pra que elas servem

		SimpleDateFormat customDate = new SimpleDateFormat(datePattern, new Locale("en", "us"));
		// E nos construtor a gente pode passar nossa String, e tambem criar uma locale
		// nela

		Calendar c = Calendar.getInstance();

		String date = customDate.format(c.getTime());//Aqui vamos transforma um SimpleDateFormat em uma String, por causa do
		//Metodo "format" da SimpleDateFormat que retorna uma String, e o c.getTime() ele vai pegar a hora atual, porque eu 
		//Instanciei o Calendar sem parametros.
		
		System.out.println(date);//E aqui mostramos a data em Formato de String
		System.out.println(customDate.format(c.getTime()));//Podemos botar tudo em um Sysout, mas eu acho legal transformar
		//Em String, porque da pra mexer depois
		
		System.out.println(customDate.format(c.getTime()));
	}
}