package date;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		
		//Antigamente usava-se o date para trabalhar com data em java, mas ele nao dava suporte para muita coisa, como
		//Os tipos diferentes de data que temos no mundo, fusos horarios e etc. Voce sabia que o primeiro dia da semana
		//Na franca e segunda? Pse.
		
		//Entao para nao perder tempo, nao vou falar quase nada sobre o date, mas vou falar como converter algum sistema
		//Antigo que usava date para "Calendar" que esta sendo muito mais usado.
		
		Date d = new Date();
		System.out.println(d);
		
		Calendar c = Calendar.getInstance();//Calendar e uma classe abstrata, ou seja, nao pode ser instanciada, mas temos
		//Um metodo que instacia pra gente. Pra que fazer isso? Nao faco a minima ideia, java e suas frescuras ._.
		
		c.setTime(d);//Pronto, convertemos. E so isso mesmo ;-;. Ja pode ir embora
	}
}