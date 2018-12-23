
public class Hora2Teste {

	public static void main(String[] args) {
		
		Hora2 testeSegundo = new Hora2(12, 30, 32);
		Hora2 testeMinuto = new Hora2(15, 55, 59);
		Hora2 testeHora = new Hora2(21, 59, 59);
		Hora2 testeDia = new Hora2(23, 59, 59);
		
		System.out.println("Teste segundos:\n");
		mostraHora("Antes do m�todo tick():", testeSegundo);
		testeSegundo.tick();
		mostraHora("Depois do m�todo tick():", testeSegundo);
		
		System.out.println("\nTeste minutos:\n");	
		mostraHora("Antes do m�todo tick():", testeMinuto);
		testeMinuto.tick();
		mostraHora("Depois do m�todo tick():", testeMinuto);
		
		System.out.println("\nTeste horas:\n");	
		mostraHora("Antes do m�todo tick():", testeHora);
		testeHora.tick();
		mostraHora("Depois do m�todo tick():", testeHora);
		
		System.out.println("\nTeste dias:\n");	
		mostraHora("Antes do m�todo tick():", testeDia);
		testeDia.tick();
		mostraHora("Depois do m�todo tick():", testeDia);

	}
	
	private static void mostraHora(String titulo, Hora2 h) {
		
		System.out.printf("%s%n   %s%n   %s%n", titulo, h.paraFormatoUniversalString(), h.toString());
		
	}

}
