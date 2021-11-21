package locale;

import java.util.Locale;
import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormatTest {
	public static void main(String[] args) {
		
		//Como o nosso Javinha e bem completo, ele ja pensou em todos os tipos de diferentes de moedas e numeros. Por exemplo
		//Para serparar os numeros decimais no Brasil e a virgula e nos EUA e o ponto.
		
		float numero = 105289.4521f;
		Locale locBr = new Locale("pt", "br");
		Locale locEn = new Locale("en", "us");
		NumberFormat[] nfArray = new NumberFormat[4];
		String[] istringui = new String[4];
		int i = 0;
		
		//nfArray[0] = NumberFormat.getInstance();//Formato de Numero normal predefinido pela linguagem da JVM, mas vou
		//Colocar como ingles pq minha JVM ta em portugues entao nao vai mudar nada.
		
		nfArray[0] = NumberFormat.getInstance(locEn);//Formato de Numero com a localizacao en-us
		nfArray[1] = NumberFormat.getInstance(locBr);//Formato de Numero com a localizacao pt-br
		nfArray[2] = NumberFormat.getCurrencyInstance(locEn);//Formato de Moeda com a localizacao en-us
		nfArray[3] = NumberFormat.getCurrencyInstance(locBr);//Formato de Moeda com a localizacao pt-br
		
		
		istringui[0] = "Numero Normal (ingles): ";
		istringui[1] = "Numero Formato Brasileiro: ";
		istringui[2] = "Moeda Normal (ingles): ";
		istringui[3] = "Moeda Formato Brasileiro: ";
		
		for(NumberFormat test: nfArray) {
			System.out.println(istringui[i] + test.format(numero));
			i++;
		}
		
		System.out.println("\nComo podemos ver o formato em ingles usa o ponto para separar os numeros decimais\ne a virgula"
				+ " para separar as casas");
		
		//Mas como estamos vendos ele no formato de numero, so ta mostrando 3 numeros decimais, e o nosso numero tem 4 
		//numeros decimais, como fazemos pra aumentar o limite?
		
		System.out.println("\n===============");
		
		System.out.println(nfArray[0].getMaximumFractionDigits());
		
		//Vemos que o maximo e 3
		
		nfArray[0].setMaximumFractionDigits(4); //Agora sim, o maximo de numero decimais sao 4.
		
		System.out.println("4 Numeros Decimais: " + nfArray[0].format(numero));//Esse e o formato ingles
		//Obs.: Como podemos ver na declaracao da variavel "numero", no java as casas decimais sao divididas pelo ponto, nao
		//Pela virgura.
		
		//Normalmente a gente vai receber os numeros em uma String, e NumberFormat tem um metodo de conversao
		
		//parse()
		
		String numeroString = "1234.54";
		
		//Precisamos tratar uma excecao, porque as vezes esse numero pode vim com alguma letra
		
		try {
			System.out.println("Numero Transformado: "+nfArray[0].parse(numeroString));
			nfArray[0].setParseIntegerOnly(true);//Aqui a gente ignora os numeros deciamais, so deixa os inteiros
			System.out.println("Numero Transformado: "+nfArray[0].parse(numeroString));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}