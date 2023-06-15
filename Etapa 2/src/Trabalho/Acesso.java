package Trabalho;
import java.util.ArrayList;
import java.util.Scanner;
import ValorAcessoInvalidoException;
import DescricaoEmBrancoException;

public class Acesso {
	static ArrayList<Estacionamento> Estacionamentos = new ArrayList<>( );
	static ArrayList<ClienteAcesso> Acessos = new ArrayList<>( );
	static ArrayList<Valor> Valores = new ArrayList<>( );
	static ArrayList<ChecarBool> Checar = new ArrayList<>( );
    public static void main(String args[]) {
    	 try{
        Scanner scan = new Scanner(System.in);
        System.out.println("Selecione:\n");
        System.out.println("1 - Cadastrar Estacionamento\n");
        System.out.println("2 - Cadastrar Acesso(Veiculo)\n");
        System.out.println("3 - Cadastrar Evento\n");
        System.out.println("0 - Sair\n");
        System.out.println("Escolhido: ");
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                Cadastrar(Estacionamentos, Valores);
                break;
            case 2:
                Acessar(Estacionamentos, Acessos, Checar);
                break;
            case 3:
                EV(Checar);
                break;
            case 0:
            	System.out.println("SAI. TCHAU.\n");
                break;
            default:
            	System.out.println("Invalido.\n");
                break;
                
        }
        } catch (DescricaoEmBrancoException e){
    		 System.out.println(e.getMessage());
      	 } catch (ValorAcessoInvalidoException e){
      		 System.out.println(e.getMessage());
      	 }
}
	
public static void Cadastrar(ArrayList<Estacionamento> Estacionamentos, ArrayList<Valor> Valores) throws DescricaoEmBrancoException, ValorAcessoInvalidoException{
	System.out.println("Numero do Estacionamento\n");
    Scanner Estacionamento = new Scanner(System.in);
    int NumeroEstacionamento = Estacionamento.nextInt();
    ////////////////////////
    
    System.out.println("Digite a capacidade:\n");
    Scanner Capacidade = new Scanner(System.in);
    int Vagas = Capacidade.nextInt();
    ////////////////////////
    
    System.out.println("Porcentagem do contratante:\n");
    Scanner Porcento = new Scanner(System.in);
    float Porcentagem = Porcento.nextFloat();
    ///////////////////////
    
    System.out.println("Horario de funcionamento:(Horas)\n");
    Scanner FunHora = new Scanner(System.in);
    int HorarioFunHora = FunHora.nextInt();
    ///////////////////////
    
    System.out.println("Horario de funcionamento:(Minutos)\n");
	Scanner FunMinuto = new Scanner(System.in);
	int HorarioFunMinuto = FunMinuto.nextInt();
    ///////////////////////
	
    System.out.println("Horario de periodo noturno:(Horas)\n");
    Scanner NoturnoHora = new Scanner(System.in);
    int HorarioNotHora = NoturnoHora.nextInt();
    ///////////////////////
    
    System.out.println("Horario de periodo noturno:(Minutos)\n");
    Scanner NoturnoMinuto = new Scanner(System.in);
    int HorarioNotMinuto = NoturnoMinuto.nextInt();
    ////////////////////////
    
    System.out.println("Valor da fracao:\n");
    Scanner Fracao = new Scanner(System.in);
    float ValFracao = Fracao.nextFloat();
    ////////////////////////
    
    System.out.println("Valor por hora:\n");
    Scanner HoraVal = new Scanner(System.in);
    float ValHora = HoraVal.nextFloat();
    ////////////////////////
    
    System.out.println("Valor da diurna:\n");
    Scanner Diurna = new Scanner(System.in);
    float ValDiurna = Diurna.nextFloat();
    ////////////////////////
    
    System.out.println("Valor da noturna:\n");
    Scanner Noturna = new Scanner(System.in);
    float ValNoturna = Noturna.nextFloat();
    ////////////////////////
    
    System.out.println("Valor mensalista:\n");
    Scanner Mensalista = new Scanner(System.in);
    float ValMensalista = Mensalista.nextFloat();
    ////////////////////////
    
    System.out.println("Valor evento:\n");
    Scanner Evento = new Scanner(System.in);
    float ValEvento = Evento.nextFloat();
    ////////////////////////
    
    Porcentagem = Porcentagem/100;
    Estacionamento est = new Estacionamento(NumeroEstacionamento, Vagas, HorarioFunHora, HorarioFunMinuto, HorarioNotHora, HorarioNotMinuto);
    Estacionamentos.add(est);
    Valor val = new Valor(Porcentagem, ValFracao, ValHora, ValDiurna, ValNoturna, ValMensalista, ValEvento);
    Valores.add(val);
    System.out.println("Estacionamento Criado!\n\n\n\n");
    Scanner scan = new Scanner(System.in);
    System.out.println("Selecione:\n");
    System.out.println("2 - Cadastrar Acesso(Veiculo)\n");
    System.out.println("3 - Cadastrar Evento\n");
    System.out.println("0 - Sair\n");
    System.out.println("Escolhido: ");
    int opcao = scan.nextInt();
    switch (opcao) {
        case 1:
            break;
        case 2:
            Acessar(Estacionamentos, Acessos, Checar);
            break;
        case 3:
            EV(Checar);
            break;
        case 0:
        	System.out.println("SAI. TCHAU.\n");
            break;
        default:
        	System.out.println("Invalido.\n");
            break;
            
    }
}


public static void Acessar(ArrayList<Estacionamento> Estacionamentos, ArrayList<ClienteAcesso> Acessos, ArrayList<ChecarBool> Checar) throws DescricaoEmBrancoException, ValorAcessoInvalidoException{
    System.out.println("Numero do Estacionamento:\n ");
    Scanner Estacionamento = new Scanner(System.in);
    int Procurar = Estacionamento.nextInt();
    Estacionamento NumeroEstacionamento = null;
    for (Estacionamento estacionamento : Estacionamentos) {
        if (estacionamento.getNumerodeAcessos() == Procurar) {
        	NumeroEstacionamento.equals(Estacionamento);
            break;
        }
    }
    Estacionamento Encontrar = NumeroEstacionamento;
    
    if (Encontrar != null) {
        System.out.println("Digite a placa do veículo\n");
        Scanner Placas = new Scanner(System.in);
        String Placa = Placas.next();
        ////////////////////////
        
        System.out.println("Hora de entrada: (Hora)\n");
        Scanner Hora = new Scanner(System.in);
        int HoraEntradaHora = Hora.nextInt();
        ////////////////////////
        
        System.out.println("Hora de entrada: (Minuto)\n");
        Scanner Minuto = new Scanner(System.in);
        int HoraEntradaMinuto = Minuto.nextInt();
        ////////////////////////
        
        System.out.println("Hora de Saida: (Hora)\n");
        Scanner HoraSaida = new Scanner(System.in);
        int HoraSaidaHora = HoraSaida.nextInt();
        ////////////////////////
        
        System.out.println("Hora de Saida: (Minuto)\n");
        Scanner MinutoSaida = new Scanner(System.in);
        int HoraSaidaMinuto = MinutoSaida.nextInt();
        ////////////////////////
        
        System.out.println("Data de entrada: (Dia)\n");
        Scanner DiaE = new Scanner(System.in);
        int Dia = DiaE.nextInt();
        ////////////////////////
        
        System.out.println("Data de entrada: (Mes)\n");
        Scanner MesE = new Scanner(System.in);
        int Mes = MesE.nextInt();
        ////////////////////////
        
        System.out.println("Data de entrada: (Ano)\n");
        Scanner AnoE = new Scanner(System.in);
        int Anos = AnoE.nextInt();
        ////////////////////////
        
        System.out.println("Data de Saida: (Dia)\n");
        Scanner DiaES = new Scanner(System.in);
        int DiaS = DiaES.nextInt();
        ////////////////////////
        
        System.out.println("Data de Saida: (Mes)\n");
        Scanner MesES = new Scanner(System.in);
        int MesS = MesES.nextInt();
        ////////////////////////
        
        System.out.println("Data de Saida: (Ano)\n");
        Scanner AnoES = new Scanner(System.in);
        int AnosS = AnoES.nextInt(); 
        ////////////////////////
        
        ClienteAcesso acess = new ClienteAcesso(Placa, HoraEntradaHora, HoraEntradaMinuto, HoraSaidaHora, HoraSaidaMinuto, Dia, Mes, Anos, DiaS, MesS, AnosS);
        Acessos.add(acess);
        System.out.println("Veiculo Registrado!\n\n\n\n\n");
        ////////////////////////
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Selecione:\n");
        System.out.println("3 - Cadastrar Evento\n");    
        System.out.println("0 - Sair\n");
        System.out.println("Escolhido: ");
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                EV(Checar);
                break;
            case 0:
            	System.out.println("SAI. TCHAU.\n");
                break;
            default:
            	System.out.println("Invalido.\n");
                break;}
                
    }
}
public static void EV(ArrayList<ChecarBool> Checar) throws DescricaoEmBrancoException, ValorAcessoInvalidoException{
        System.out.println("Esta em evento: ");
        Scanner Eventos = new Scanner(System.in);
        String Evento = Eventos.next();
        ChecarBool Event = null;
        /////////////////////////
        
        if(Evento.equals("S") || Evento.equals("s")) {
            for (ChecarBool Confirmacao : Checar) {
                if (Confirmacao.getConfirmacao().equals(Evento)) {
                	Event.equals(Evento);
                	System.out.println("Evento Registrado\n");                	
                	}}} 
        ////////////////////////
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Selecione:\n");
        System.out.println("0 - Sair\n");
        System.out.println("Escolhido: ");
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 3:
            	break;
            case 0:
            	System.out.println("SAI. TCHAU.\n");
                break;
            default:
            	System.out.println("Invalido.\n");
                break;}        
}
}