package Trabalho;

public class ChecarBool {
	private boolean acessoevento;
	private boolean acessomensalista;
	private String Confirmacao;
	
	public ChecarBool() {}
	public ChecarBool(boolean acessoevento, boolean acessomensalista, String Confirmacao) {
		this.acessoevento = acessoevento;
		this.acessomensalista = acessomensalista;	
		this.Confirmacao = Confirmacao;
	}

	
	public boolean getacessoevento(){
		return acessoevento;
		
	}
	public void setacessoevento(boolean acessoevento){
		this.acessoevento = acessoevento;
		
	}
	public boolean getacessomensalista(){
		return acessomensalista;
		
	}
	public void setacessomensalista(boolean acessomensalista){
		this.acessomensalista = acessomensalista;
		
	}
	public String getConfirmacao(){
		return Confirmacao;
		
	}
	public void setConfirmacao(String Confirmacao){
		this.Confirmacao = Confirmacao;
		
	}
}
