import java.util.Calendar;
import java.util.Scanner;

public class DiaMesAnoTotal {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		double diaNascimento = 0;
		double mesNascimento = 0;
		double anoNascimento = 0;
		
		double diaHoje = 0;
		double mesHoje = 0;
		double anoHoje = 0;
		
		double diaQtd = 0;
		double mesQtd = 0;
		double anoQtd = 0;
		
		System.out.println("Digite o dia do seu nascimento: ");
		diaNascimento = leitor.nextDouble();
		System.out.println("Digite o mes do seu nascimento ");
		mesNascimento = leitor.nextDouble();
		System.out.println("Digite o ano do seu nascimento ");
		anoNascimento = leitor.nextDouble();
		
		leitor.close();
		
		diaHoje = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		mesHoje = Calendar.getInstance().get(Calendar.MONTH) + 1;
		anoHoje = Calendar.getInstance().get(Calendar.YEAR);
		
		diaQtd = Math.abs(diaHoje - diaNascimento);
		mesQtd = Math.abs(mesHoje - mesNascimento);
		anoQtd = Math.abs(anoHoje - anoNascimento);
		
		System.out.println("A diferença de dias é: " + diaQtd);
		System.out.println("A diferença de meses é: " + mesQtd);
		System.out.println("A diferença de anos é: " + anoQtd);
		
		
		
		
	}
}