package Trabalho;

public class Estacionamento {
	private String Hora;
	private int NumerodeAcessos;
	private int capacidade;
	float Lucro;
	private float ValorDoContratante;
	private int HoraAberturaHora;
	private int HoraAberturaMinuto;
	private int HoraAberturaSaidaHora;
	private int HoraAberturaSaidaMinuto;
	private int TempoTotalEstacionamentoHora;
	private int TempoTotalEstacionamentoMinuto;
	
	public Estacionamento() {}
	public Estacionamento(String Hora, int NumerodeAcessos, int capacidade, float Lucro, float ValorDoContratante, int HoraAberturaHora, int HoraAberturaMinuto, int HoraAberturaSaidaHora, int HoraAberturaSaidaMinuto, int TempoTotalEstacionamentoHora, int TempoTotalEstacionamentoMinuto) {
		this.Hora = Hora;
		this.NumerodeAcessos = NumerodeAcessos;
		this.capacidade = capacidade;
		this.Lucro = Lucro;
		this.ValorDoContratante = ValorDoContratante;
		this.HoraAberturaHora = TotalHorasHora();
		this.HoraAberturaMinuto = TotalHorasMinuto();
		this.HoraAberturaSaidaHora = TotalHorasHoraSaida();
		this.HoraAberturaSaidaMinuto = TotalHorasMinutoSaida();
		this.TempoTotalEstacionamentoHora = TempoTotalEstacionamentoHora;
		this.TempoTotalEstacionamentoMinuto = TempoTotalEstacionamentoMinuto;

		}
	
	public int Computarcapacidade() {
		
		
	}
	public String ImprimirExcessao() {
		
		
	}
	public String Imprimir() {
	
	
}
	public float ComputarValoreAcesso() {
		
		
	}
	public int RegistrarCadastro() {
		
		
	}
	public int TotalHorasHora() {
		
		
	}
	public int TotalHorasMinuto() {
	
	
	}
	public int TotalHorasHoraSaida() {
		
		
	}
	public int TotalHorasMinutoSaida() {
	
	
	}
	public String StringHorario() {
		
		
	}
	public int IdentificarEstacionamentoSelecionado() {
	
	
}
	public int getNumerodeAcessos() {
		return NumerodeAcessos;
	}
	
	public void setNumerodeAcessos(int NumerodeAcessos) {
		this.NumerodeAcessos = NumerodeAcessos;
	}
	
	public int getcapacidade() {
		return capacidade;
	}
	
	public void setcapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public float getLucro() {
		return Lucro;
	}
	
	public void setLucro(float Lucro) {
		this.Lucro = Lucro;
	}
	
	public float getValorDoContratante() {
		return ValorDoContratante;
	}
	
	public void setValorDoContratante(float ValorDoContratante) {
		this.ValorDoContratante = ValorDoContratante;
	}
	
	public int getHoraAberturaHora() {
		return HoraAberturaHora;
	}
	
	public void setHoraAberturaHora(int HoraAberturaHora) {
		this.HoraAberturaHora = HoraAberturaHora;
	}
	
	public int getHoraAberturaMinuto() {
		return HoraAberturaMinuto;
	}
	
	public void setHoraAberturaMinuto(int HoraAberturaMinuto) {
		this.HoraAberturaMinuto = HoraAberturaMinuto;
	}

	public int getHoraAberturaSaidaHora() {
		return HoraAberturaSaidaHora;
	}
	
	public void setHoraAberturaSaidaHora(int HoraAberturaSaidaHora) {
		this.HoraAberturaSaidaHora = HoraAberturaSaidaHora;
	}
	
	public int getHoraAberturaSaidaMinuto() {
		return HoraAberturaSaidaMinuto;
	}
	
	public void setHoraAberturaSaidaMinuto(int HoraAberturaSaidaMinuto) {
		this.HoraAberturaSaidaMinuto = HoraAberturaSaidaMinuto;
	}
	
	public int getTempoTotalEstacionamentoHora() {
		return TempoTotalEstacionamentoHora;
	}
	
	public void setTempoTotalEstacionamentoHora(int TempoTotalEstacionamentoHora) {
		this.TempoTotalEstacionamentoHora = TempoTotalEstacionamentoHora;
	}
	
	public int getTempoTotalEstacionamentoMinuto() {
		return TempoTotalEstacionamentoMinuto;
	}
	
	public void setTempoTotalEstacionamentoMinuto(int TempoTotalEstacionamentoMinuto) {
		this.TempoTotalEstacionamentoMinuto = TempoTotalEstacionamentoMinuto;
	}
}