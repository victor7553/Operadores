package fundamentos;

public class Operadores {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		System.out.println(c);
		
		// Operadores de Atribuicao
		
		c += b; // c = c + b;
		c -= a; // c = c - b;
		c *= b; // c = c * b;
		c /= a; // c = c / b;
		
		// Operadores Unários
		
		int d = 1;
		int e = 2;
		
		d++; // d = d + 1;
		d--; // d = d - 1;
		
		++e; // e = e + 1; precedência
		--e; // e = e - 1;
		
		System.out.println(d);
		System.out.println(e);
		
		// Operador ternário
		
		double media = 8.6;
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em recuperação.";
		
		System.out.println("O aluno está " + resultadoFinal);
		
		
	}

}
