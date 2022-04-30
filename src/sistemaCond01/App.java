package sistemaCond01;

/**
 * 
 * @author Manoel Carvalho
 *
 */

public class App {

	public static void main(String[] args) {
		Morador morador = new Morador();
		Visitante visitante = new Visitante();
		Fornecedor fornecedor = new Fornecedor();
		
		System.out.println("Cadastro Moradores");
		System.out.println("");
		morador.setCodigo(1);
		System.out.println(morador.getCodigo());
		morador.setNome("Manoel");
		String nomeMorador = morador.getNome();
		System.out.println(nomeMorador);
		morador.setCpf("");
		System.out.println("---------------------------------");
		System.out.println("Cadastro de Visitante");
		System.out.println("");
		visitante.setCodigo(1);
		visitante.getCodigo();
		System.out.println("Código de registro: " + visitante.getCodigo());
		visitante.setNome("João");
		String nomeVisitante = visitante.getNome();
		System.out.println("nome do visitante: " + nomeVisitante);
		System.out.println("-----------------------------------");
		System.out.println("Cadastro de Fornecedores");
		System.out.println("");
		fornecedor.setCodigo(5);
		int codigoFornecedor = fornecedor.getCodigo();
		System.out.println("Código de registro: " + codigoFornecedor);
		fornecedor.setNomeEntregador("Nome do entregador: " + "Lucas");
		String nomeEntregador = fornecedor.getNomeEntregador();
		System.out.println(nomeEntregador);
		fornecedor.setCondominoDestinatario("Maria");
		String condominoDestinatario = fornecedor.getCondominoDestinatario();
		System.out.println("Condomino destinatário da entrega: " + condominoDestinatario);
		fornecedor.setNomeEmpresa("Deposito material de construção");
		String nomeEmpresa = fornecedor.getNomeEmpresa();
		System.out.println("Empresa fornecedora: " + nomeEmpresa);
		fornecedor.setPlacaAuto("HYE4487");
		String placaAuto = fornecedor.getPlacaAuto();
		System.out.println("Placa do automovel/moto: " + placaAuto);
		fornecedor.setData("29/04/2022");
		String data = fornecedor.getData();
		System.out.println("Data: " + data);
		fornecedor.setHorarioEntrada("10:30");
		String horarioEntrada = fornecedor.getHorarioEntrada();
		System.out.println("Horário de entrada: " + horarioEntrada);
		fornecedor.setHorarioSaida("12:30");
		String horarioSaida = fornecedor.getHorarioSaida();
		System.out.println("Horário de Saída: " + horarioSaida);
		fornecedor.setComentario("Entrega de cimento e bloco");
		String comentario = fornecedor.getComentario();
		System.out.println("Observações: " + comentario);
		
		
		

	}

}
