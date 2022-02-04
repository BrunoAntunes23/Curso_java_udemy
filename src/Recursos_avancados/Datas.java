package Recursos_avancados;
/*Classe Date
A data representa o tempo, um tempo � composto por ano, m�s,
dia atual, minuto atual, entre outras propriedades que essa classe possui.
Hoje a maioria dos m�todos da classe Date est�o classificados como deprecated (depreciados),
ou seja, s�o m�todos que n�o s�o mais utilizados,
por isso essa classe foi substitu�da pela classe Calendar, 
para haver suporte correto � internacionaliza��o do sistema de datas.
 * */

import java.text.DateFormat;
import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class Datas {

	public static void main(String[] args) {
		
		
		LocalDate hoje=LocalDate.now();
	 System.out.println(hoje);//formado iso-(internacional)
		
		//LocalDate ano_novo=LocalDate.of(2023, Month.JANUARY, 1);
		//System.out.println("o ano novo ser� em : "+ano_novo);
		//int ano=ano_novo.getYear();
		//Month mes=ano_novo.getMonth();
		//int dia=ano_novo.getDayOfMonth();
		
		/*System.out.println("o ano novo ser� no dia :"+dia+"/"+mes+"/"+ano);
		Period periodo=Period.between(hoje, ano_novo);
		System.out.println(periodo);
		System.out.println("Faltam :"+periodo.getYears()+" anos "+periodo.getMonths()+" messes "+periodo.getDays()+" dias para o ano novo");
		*/
		//criando um formatador de data
		DateTimeFormatter formatador=DateTimeFormatter.ofPattern("dd/MM/yy");
		
		
		System.out.println(hoje.format(formatador));
	 	
	 	LocalDateTime agora=LocalDateTime.now();
	 	System.out.println(agora);
	 	
	 	DateTimeFormatter formatador_horas=DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss");
	 	System.out.println(agora.format(formatador_horas));
	 	
		

	}

}
