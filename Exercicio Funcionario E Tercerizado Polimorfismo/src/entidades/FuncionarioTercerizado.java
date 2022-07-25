package entidades;

public class FuncionarioTercerizado extends Funcionario {

	private Double custoAdicional;
	
	public FuncionarioTercerizado() {
		super();
	}

	public FuncionarioTercerizado(String nome, Integer horas, Double valorPorHora, Double custoAdicional) {
		super(nome, horas, valorPorHora);
		this.custoAdicional = custoAdicional;
	}

	public Double getCustoAdicional() {
		return custoAdicional;
	}

	public void setCustoAdicional(Double custoAdicional) {
		this.custoAdicional = custoAdicional;
	}
	
	@Override
	public double Pagamento() {
		return super.Pagamento() + custoAdicional * 1.1;
	}

}
