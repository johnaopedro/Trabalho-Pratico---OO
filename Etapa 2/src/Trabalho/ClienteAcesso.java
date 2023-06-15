package Trabalho;

public class ClienteAcesso {
	private String Rplaca;
	private float valor;
	private int HoraEntradaHora;
	private int HoraEntradaMinuto;
	private int HoraSaidaHora;
	private int HoraSaidaMinuto;
	int TempoTotalEstHora;
	int TempoTotalEstMinuto;
	private String TempoTotalRestante;

	public ClienteAcesso() {}
	public ClienteAcesso(String Rplaca, int capacidade, float valor, int HoraEntradaHora, int HoraEntradaMinuto, int HoraAberturaMinuto, int HoraSaidaHora, int HoraSaidaMinuto, int TempoTotalEstHora, int TempoTotalEstMinuto, String TempoTotalRestante) {
		this.Rplaca = Rplaca;
		this.valor = valor;
		this.HoraEntradaHora = HoraEntradaHora;
		this.HoraEntradaMinuto = HoraEntradaMinuto;
		this.HoraSaidaHora = HoraSaidaHora;
		this.HoraSaidaMinuto = HoraSaidaMinuto;
		this.TempoTotalEstHora = TempoTotalEstHora;
		this.TempoTotalEstMinuto = TempoTotalEstMinuto;
		this.TempoTotalRestante = TempoTotalRestante;
		}
	public ClienteAcesso(String placa, int horaEntradaHora2, int horaEntradaMinuto2, int horaSaidaHora2,
			int horaSaidaMinuto2, int dia, int mes, int anos, int diaS, int mesS, int anosS) {
		// TODO Auto-generated constructor stub
	}
}
