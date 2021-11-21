package locale;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
	public static void main(String[] args) {
		//O Locale segue o padrao ISO 639. Ex.: primeiro vem a linguagem ("pt") depois o pais ("br"). Pesquise para saber,
		//De um pais especifico, como: "ISO 639 China".
		
		
		Locale locEnglish = new Locale("en", "us");
		Locale locPortuguese = new Locale("pt", "br");
		Locale locJapanese = new Locale("ja", "jp");//Nao precisamos botar o pais, porque so o japao fala japones ;-;
		
		Calendar c = Calendar.getInstance();
		
		DateFormat dFE = DateFormat.getDateInstance(DateFormat.FULL, locEnglish);
		DateFormat dFP = DateFormat.getDateInstance(DateFormat.FULL, locPortuguese);
		DateFormat dFJ = DateFormat.getDateInstance(DateFormat.FULL, locJapanese);
		
		System.out.println("Ingles: " + dFE.format(c.getTime()));
		System.out.println("Portugues: " + dFP.format(c.getTime()));
		System.out.println("Japones: " + dFJ.format(c.getTime()));
		
		//Metodo getDisplayLanguage()
		
		//Mostra a linguagem do locale...
		
		System.out.println(locJapanese.getDisplayLanguage());//Ta em portugues, porque minha jvm ta em portugues ._.
		
		System.out.println(locEnglish.getDisplayLanguage(locEnglish));//Mas se eu quiser posso passar um parametro
		//Para me falar a lingua em uma ligua .-.
		System.out.println(locJapanese.getDisplayLanguage(locEnglish));//Japones em ingles
		
		//Metodo getDisplayLanguage()
		
		//Mostra o pais do locale...

		System.out.println(locJapanese.getDisplayCountry(locEnglish));//Estados Unidos
		System.out.println(locEnglish.getDisplayCountry());//Estados Unidos
		System.out.println(locEnglish.getDisplayCountry(locEnglish));;//Estados Unidos em ingles
	}
}