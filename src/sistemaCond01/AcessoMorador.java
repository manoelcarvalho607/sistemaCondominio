package sistemaCond01;

public class AcessoMorador {

	public static void main(String[] args) {
		
		Morador morador = new Morador();
		System.out.println("Cadastro Moradores");
		System.out.println("");
		morador.setCodigo(1);
		System.out.println(morador.getCodigo());
		morador.setNome("Manoel");
		String nomeMorador = morador.getNome();
		System.out.println(nomeMorador);
		morador.setCpf("");

	}

}
