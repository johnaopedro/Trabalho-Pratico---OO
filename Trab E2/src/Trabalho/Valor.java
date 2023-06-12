package Trabalho;
public class Valor {

	private float fracao;
	private float cheia;
	private float diurna;
	private float noturna;
	private float mensalista;
	private float evento;
	private float desconto;
	private float contratante;
	private Estacionamento Lucro;
	
	public Estacionamento contratantereturn() {
		return Lucro;
	}
	
	public float Testarhoravalor(){
		return diurna*desconto;	
	}
	public float Formulahoracheia(){
		return fracao*4*desconto;		
	}
	
	public Valor() {}
	public Valor(float fracao, float cheia, float diurna, Estacionamento Lucro, float noturna, float mensalista, float evento, float desconto, float contratante) {
		this.fracao = fracao;
		this.cheia = Formulahoracheia();
		this.diurna = diurna;
		this.Lucro = Lucro;
		this.noturna = Testarhoravalor();
		this.mensalista = mensalista;
		this.evento = evento;
		this.desconto = desconto;
		this.contratante = contratante;
		}
	public float getfracao() {
		return fracao;
	}
	
	public void setfracao(float fracao) {
		this.fracao = fracao;
	}
	
	public float getcheia() {
		return cheia;
	}
	
	public void setcheia(float cheia) {
		this.cheia = cheia;
	}
	
	public float getdiurna() {
		return diurna;
	}
	
	public void setdiurna(float diurna) {
		this.diurna = diurna;
	}
	
	public float getnoturna() {
		return noturna;
	}
	
	public void setnoturna(float noturna) {
		this.noturna = noturna;
	}
	
	public float getmensalista() {
		return mensalista;
	}
	
	public void setmensalista(float mensalista) {
		this.mensalista = mensalista;
	}
	
	public float getevento() {
		return evento;
	}
	
	public void setevento(float evento) {
		this.evento = evento;
	}
	
	public float getdesconto() {
		return desconto;
	}
	
	public void setdesconto(float desconto) {
		this.desconto = desconto;
	}
	
	public float getcontratante() {
		return contratante;
	}
	
	public void setcontratante(float contratante) {
		this.contratante = contratante;
	}
}
