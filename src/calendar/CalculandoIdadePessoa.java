package calendar;

import java.util.Calendar;

public class CalculandoIdadePessoa {
	public static void main(String[] args) {
		
		//Simulacao...
		
		Calendar calendar = Calendar.getInstance();//Calendar Atual, do horario, dia, mes e ano atual.
		
		int anoAtual = calendar.get(Calendar.YEAR); //Pego o ano atual
		
		int mesAtual = calendar.get(Calendar.MONTH);//Pego o mes atual
		
		int diaAtual = calendar.get(Calendar.DAY_OF_MONTH);//Pego o dia atual
		
		//Possivelmente a data da pessoa vai vim em formato date. Entao e so fazer isso pessoa.setTime(*date*);
		calendar.set(1980, 9, 6);//Como nao tenho nehum date, vo colocar uma data aleatoria
		
		//Obs.: Ele comeca a contar o mes do 0, ou seja, janeiro = 0.
		
		int anoPessoa = calendar.get(Calendar.YEAR); //Pego o ano da pessoa
		
		int mesPessoa = calendar.get(Calendar.MONTH);//Pego o mes da pessoa
		
		int diaPessoa = calendar.get(Calendar.DAY_OF_MONTH);//Pego o dia da pessoa.
		
		int idade = anoAtual - anoPessoa;//Subtrai para saber a "idade", nao e a idade exata, porque pode ser que a pessoa
		//Ainda nao fez aniversario.
		

		if(mesAtual < mesPessoa) { //Ou seja, se o aniversario da pessoa ainda nao chegou, tire 1
			idade--;
			} else {
				if(diaAtual < diaPessoa) {//Se ja passou o mes, mas ainda nao chegou no dia, tire 1
					idade--;
 	 			}
		}
		
		
		System.out.println("Voce tem: " + idade);
		
		//Se eu tiver um objeto...
		
		//objeto.setIdade(idade);
		
		//E e so botar tudo isso em um metodo para calcular a idade e GG
		
		//Mas o banco de dados ja tem um metodo especifico para calcular a "idade", entao normalmente voce nao vai
		//Precisar fazer isso.
	}
}