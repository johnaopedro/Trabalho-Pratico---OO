package Trabalho;

public class Estacionamento {
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
	public Estacionamento(int NumerodeAcessos, int capacidade, float Lucro, float ValorDoContratante, int HoraAberturaHora, int HoraAberturaMinuto, int HoraAberturaSaidaHora, int HoraAberturaSaidaMinuto, int TempoTotalEstacionamentoHora, int TempoTotalEstacionamentoMinuto) {
		this.NumerodeAcessos = NumerodeAcessos;
		this.capacidade = capacidade;
		this.Lucro = Lucro;
		this.ValorDoContratante = ValorDoContratante;
		this.HoraAberturaHora = HoraAberturaHora ;
		this.HoraAberturaMinuto = HoraAberturaMinuto;
		this.HoraAberturaSaidaHora = HoraAberturaSaidaHora;
		this.HoraAberturaSaidaMinuto = HoraAberturaSaidaMinuto;
		this.TempoTotalEstacionamentoHora = TempoTotalEstacionamentoHora;
		this.TempoTotalEstacionamentoMinuto = TempoTotalEstacionamentoMinuto;

		}

	public String TempoTotal() {
		int hora=0;
		int hora2=0;
		int horatotal=0;
		int horafinaltotal=0;
		int final1=0;
		while(HoraAberturaHora!=0){
			HoraAberturaHora--;
			hora=hora+60;
		}while(HoraAberturaSaidaHora!=0){
			HoraAberturaSaidaHora--;
			hora2=hora2+60;
		}horatotal= hora+HoraAberturaMinuto;
		horafinaltotal=hora2+HoraAberturaSaidaMinuto;
		final1= horatotal-horafinaltotal;
		String HF = (final1/60)+":"+(final1%60);
		return HF;}
		
	public int TotalHorasHora(int HoraAberturaHora) {
		if(HoraAberturaHora>24 ||HoraAberturaHora<0) {
			System.out.println("Hora Invalida");
	} else {this.HoraAberturaHora=HoraAberturaHora;
	System.out.println("Hora Registrada");}
		return HoraAberturaHora;
	}
	public int TotalHorasMinuto(int HoraAberturaMinuto) {
		if(HoraAberturaMinuto>60 ||HoraAberturaMinuto<0) {
			System.out.println("Minuto Invalido");
	} else {this.HoraAberturaMinuto= HoraAberturaMinuto;
	System.out.println("Minuto Registrada");}
		return HoraAberturaMinuto;
	
	}
	public String StringHorario() {
		String Hora = HoraAberturaHora+":"+HoraAberturaMinuto;
		return Hora;
		
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
